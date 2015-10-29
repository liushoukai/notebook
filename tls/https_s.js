
var https = require('https');
var fs = require('fs');

var options = {
  key: fs.readFileSync('./keys/server-key.pem'),
  cert: fs.readFileSync('./keys/server-cert.pem')
};

https.createServer(options, function (req, res) {
  res.writeHead(200);
  res.end("hello world\n");
}).listen(8000);
