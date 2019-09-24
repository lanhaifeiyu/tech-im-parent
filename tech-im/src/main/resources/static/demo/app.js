Vue.component('todo-item', {
    template: '<li>这是个待办项</li>'
});

var app = new Vue({
    el: '#app',
    data: {
        connected: false,
        conversation: false,
        message: 'hello vue',
        stompClient: null,
        messageList: []
    },
    methods: {
        setConnected: function (connected) {
            this.connected = connected;
            this.messageList = [];
        },
        connect: function () {
            var that = this;
            var socket = new SockJS('/gs-guide-websocket');
            that.stompClient = Stomp.over(socket);
            that.stompClient.connect({}, function (frame) {
                that.setConnected(true);
                console.log('Connected: ' + frame);
                that.stompClient.subscribe('/topic/greetings', function (greeting) {
                    that.showGreeting(JSON.parse(greeting.body).content);
                });
            });
        },
        disconnect: function () {
            var that = this;
            if (that.stompClient !== null) {
                that.stompClient.disconnect();
            }
            that.setConnected(false);
            console.log("Disconnected");
        },
        sendName: function () {
            this.stompClient.send("/app/hello", {}, JSON.stringify({'name': this.message}));
        },
        showGreeting: function (message) {
            var id = new Date().getTime();
            this.messageList.push({id: id, content: message});
        }
    }
});

/*var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    } else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (greeting) {
            showGreeting(JSON.parse(greeting.body).content);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
}

function showGreeting(message) {
    $("#greetings").append("<tr><td>" + message + "</td></tr>");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#connect").click(function () {
        connect();
    });
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendName();
    });
});*/

