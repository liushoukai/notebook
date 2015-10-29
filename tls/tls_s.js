var tls = require('tls');
var fs = require('fs');

var options = {
    key: fs.readFileSync('./keys/server-key.pem'),
    cert: fs.readFileSync('./keys/server-cert.pem'),
    // This is necessary only if using the client certificate authentication.
    requestCert: true,
    // This is necessary only if the client uses the self-signed certificate.
    ca: [ fs.readFileSync('./keys/ca-cert.pem') ]
};

var server = tls.createServer(options, function(socket) {
    console.log('server connected', 
                socket.authorized ? 'authorized' : 'unauthorized');
    socket.write('welcome!\n');
    socket.setEncoding('utf8');
    socket.pipe(socket);

}).listen(8000, function() {
    console.log('server bound');
});

