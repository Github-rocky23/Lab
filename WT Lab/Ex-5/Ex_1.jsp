<%@ page import = "java.io.*,java.util.*,javax.servlet.*" %>
<html>
    <head>
        <title>Display Currnet Date and Time</title>
    </head>
    <body>
        <center>
            <h1>Dispaly Current Date & Time</h1>
        </center>
        <%
        Date date=new Date();
        out.print("<h2 align=\"center\">"+date.toString()+"</h2>");
        %>
    </body>
</html>