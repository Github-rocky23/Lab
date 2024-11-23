var http=require('http');
http.createServer(function(req,res)
{
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write('<b>my http module</b><br>');
    res.write("The date and time are: "+new Data().toString()+"<br>");
    res.write(req.url);
    res.end();
}).listen(8081);
