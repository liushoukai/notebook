var net = require('net')
  , http = require('http')
  , crypto = require('crypto')
  ;


var server = net.createServer(function(c) { //'connection' listener
  console.log('client connected');

  c.on('end', function() {
    console.log('client disconnected');
  });

  var mask = '258EAFA5-E914-47DA-95CA-C5AB0DC85B11';
  //var key = req.headers['sec-websocket-key'];
  var key = 'x3JJHMbDL1EzLkh9GBhXDw==';
  key = crypto.createHash('sha1').update(key + mask).digest('base64');

  c.write('HTTP/1.1 101 Switching Protocals\r\n' + 
          'Upgrade: WebSocket\r\n' + 
          'Connection: Upgrade\r\n' +
          'Sec-WebSocket-Accept: ' + key + '\r\n' +
          '\r\n');

  c.pipe(c);
});

server.on('connection', function(socket) {
  console.info("sssss");
  console.info(socket.bufferSize);
});


server.listen(8888, function() { //'listening' listener
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
  var req = http.request(options);
  req.end();

  req.on('error', function(e) {
    console.info(e);
  })

  req.on('upgrade', function(res, socket, upgradeHead) {
      console.log('got upgraded!');
      console.log(socket._httpMessage._headers);
      console.log(res.headers);
      socket.end();
      process.exit(0);
  });
});