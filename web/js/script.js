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

$(function () {
    var $command = $("#command");
    var $log = $(".log");
    var loggedIn = false;

    wsocket = new WebSocket('ws://' + document.location.host + document.location.pathname + 'game/global');

    wsocket.onmessage = function (e) {
        var resp = JSON.parse(e.data);
        if(resp.hasOwnProperty("update")) {
            loggedIn = true;
            $("#command-label").html("&gt;&gt;&gt;&nbsp;");
            var classForType = 'log-Notification';
            if (resp.hasOwnProperty("type"))
                classForType = 'log-' + resp.type;
            $log.append($("<div class='log-line" + classForType + "'>").text(resp.update));

        } else if (resp.hasOwnProperty("error")) {
            $log.append($("<div class='log-line log-fatal'>").text(resp.error));
        }
        console.log(e);
        $log.scrollTop($log.height());
    };

    $command.keyup(function (e) {
        if (e.keyCode === 13) {
            if (loggedIn)
                wsocket.send(JSON.stringify({ cmd: $command.val() }));
            else
                wsocket.send(JSON.stringify({ login: $command.val() }));
            $command.val("");
        }
    });

    function loadPage(pg) {
        $('.panel').removeClass('showing');
        if(pg !== "") $(pg).addClass('showing');
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