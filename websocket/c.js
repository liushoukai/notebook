var http = require('http')
  , url = require('url')
  , crypto = require('crypto')
  ;

var options = {
    port: 8888,
    hostname: '127.0.0.1',
    headers: {
        'Connection': 'Upgrade',
        'Upgrade': 'websocket',
        'Sec-WebSocket-Key': 'x3JJHMbDL1EzLkh9GBhXDw==',
        'Sec-WebSocket-Version': 13
    }
};

for(var i=0; i<20000; i++) {
    (function() {
        var req = http.request(options);
        req.end();
        req.on('upgrade', function(res, socket, upgradeHead) {
            //console.log('got upgraded!');
            //console.log(socket._httpMessage._headers);
            //console.log(res.headers);
            socket.on('data', function(chunk) {
                console.log(chunk.toString());
            });
            //socket.end();
            //process.exit(0);
        });
        req.on('error', function(e) {
            console.info(e);
        });
    })();
}




