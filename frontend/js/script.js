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

$(function () {
    $("#command").keyup(function (e) {
        if (e.keyCode === 13) {
            var $command = $("#command");
            var $log = $(".log");
            $log.append($("<div class='log-line'>").text($command.val()));
            $command.val("");
            $log.scrollTop($log.height());
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
});