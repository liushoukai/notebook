var http = require('http')
  , crypto = require('crypto')
  ;

var server = http.createServer(function(req, res) {
    res.writeHead(200, {'Content-Type': 'text/plain'});
    res.end('okay');
});

server.on('upgrade', function(req, socket, head) {
    var mask = '258EAFA5-E914-47DA-95CA-C5AB0DC85B11';
    var key = req.headers['sec-websocket-key'];
    key = crypto.createHash('sha1').update(key + mask).digest('base64');

    socket.write('HTTP/1.1 101 Switching Protocals\r\n' + 
                 'Upgrade: WebSocket\r\n' + 
                 'Connection: Upgrade\r\n' +
                 'Sec-WebSocket-Accept: ' + key + '\r\n' +
                 '\r\n');
    
    function broadcast() {
        server.getConnections(function(err, count) {
            if (count > 1000) {
                console.info("Courrency connections:" + count);
                //socket.write("Hello Guys!");
            }
            //setTimeout(broadcast, 5 * 1000);
        }); 
    }
    process.nextTick(broadcast);
    socket.pipe(socket);
});

server.listen(8888, '127.0.0.1', function() {
    console.info("Server Running!");
});

