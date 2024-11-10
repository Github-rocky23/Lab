<html>
    <head>
        <title>Example on Expression ,Comments,Scriplets</title>
    </head>
    <body>
        <p>The square root od 5 is <%=Math.sqrt(5)%></p>
        <%--Example of SQRT function using two ways--%>
        <h2>using Scriplets the same example is derived</h2>
        <%
        out.write("<p>The square root of 5 is ");
        out.print(Math.sqrt(5));
        %>
    </body>
</html>