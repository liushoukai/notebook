var http = require('http')
  , express = require('express')
  , path = require('path')
  , fs = require('fs')
  , app = express()
  , url = require('url')
  , async = require('async')
  , crypto = require('crypto')
  , port = 8888
  ;

app.set('etag', 'strong');
app.get('/*', function(req, res, next) {
    var whoami = req.headers.whoami ? req.headers.whoami : 'webapp';
    var serverPath = `/data/${whoami}/nodeserver/`;
    var matched = req.url.match(/((\/\w+)+\/)(js|css)\/\?\?([a-z0-9\/\.]+\.js(,[a-z0-9\/\.]+\.js)*)(\?hash=(\w+))?/i);
    var relativePath = matched[1];
    var type = matched[3];
    var files = matched[4].split(',');
    var rootPath = path.join(serverPath, 'dist', relativePath, type);

    // set headers
    var expires = new Date();
    var maxAge = 3600;
    expires.setTime(expires.getTime() + maxAge * 1000);
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Expires', expires.toUTCString());
    res.setHeader('Cache-Control', 'max-age=' + maxAge);

    // read content
    var filePaths = [];
    files.forEach(function(file, index) {
        filePaths.push(path.join(rootPath, file));
    });

    async.map(filePaths, fs.readFile, function(err, contents) {
        if(err) {
            console.info(err);
            return;
        }
        var buffers = [];
        contents.forEach(function(content) {
            buffers.push(content);
        });
        var entity = Buffer.concat(buffers);
        res.type(type).status(200).send(entity);
    });

});


var server = http.createServer(app);

server.listen(port);
server.on('error', onError);
server.on('listening', onListening);

function onError(e) {
    console.log(e.message);
}

function onListening() {
    console.info("server running. Listening on port 8888");    
}

