/* Thanks, Moustache! */
var entityMap = {
    "&": "&amp;",
    "<": "&lt;",
    ">": "&gt;",
    '"': '&quot;',
    "'": '&#39;',
    "/": '&#x2F;'
};

function escapeHtml(string) {
    return String(string).replace(/[&<>"'\/]/g, function (s) {
        return entityMap[s];
    });
}

var wsocket = null;
var log;

$(function () {
    var $command = $("#command");
    var $log = $(".log");
    var loggedIn = false;
    var requestMade = false;
    var lastCommand = "";

    log = function (level, message) {
        $log.append($("<div class='log-line log-" + level + "'>").text(message));
    }

    wsocket = new WebSocket('ws://' + document.location.host + document.location.pathname + 'game/global');

    wsocket.onmessage = function (e) {
        var resp = JSON.parse(e.data);
        if (resp.hasOwnProperty("update")) {
            loggedIn = true;
            $("#command-label").html("&gt;&gt;&gt;&nbsp;");
            log(resp.type || 'Notification', resp.update);
        } else if (resp.hasOwnProperty("error")) {
            log('Fatal', resp.error);
        } else if (resp.hasOwnProperty("request")) {
            log('Failure', "You must choose from the following options:");
            var options = resp.options;
            for (var i = 0; i < options.length; i++)
                log('Failure', "(" + (i + 1) + ") " + options[i]);
            requestMade = true;
        }
        console.log(e);
        $log.scrollTop($log.height());
    };

    $command.keyup(function (e) {
        if (e.keyCode === 13) {
            var inputLine = $command.val().trim();
            if (inputLine.length === 0){
                // do nothing
            } else if (inputLine === "help") {
                if (window.location.hash !== "#commands")
                    loadPage("commands");
            } else if (requestMade) {
                var selection = parseInt(inputLine);
                if (!isNaN(selection)) {
                    var data = JSON.stringify({ cmd: lastCommand + " " + (selection - 1) });
                    wsocket.send(data);
                    requestMade = false;
                } else {
                    log('Fatal', 'You must enter a number');
                }
            } else if (loggedIn) {
                lastCommand = inputLine;
                wsocket.send(JSON.stringify({ cmd: inputLine }));
            } else {
                wsocket.send(JSON.stringify({ login: inputLine }));
            }

            $command.val("");
        }
    });

    function loadPage(pg) {
        $('.panel').removeClass('showing');
        if (pg !== "") $(pg).addClass('showing');
        window.location.hash = pg;
    }

    $(window).bind('hashchange', function () {
        loadPage(window.location.hash);
    });

    $("nav a").click(function (e) {
        e.preventDefault();
        var page = $(this)[0].hash;
        if (page == window.location.hash) page = '';
        loadPage(page);
    });

    window.location.hash && loadPage(window.location.hash);

    $command.focus();
});