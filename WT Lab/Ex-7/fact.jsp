<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <center>
            <h1>The required Factorial value is::</h1>
        </center>
            <%!
            long n,result;
            String str;
            long fact(long n)
            {
                if(n==0)
                    return 1;
                else
                    return n*fact(n-1);
            }
            %>
            <%
            str=request.getParameter("val");
            n = Long.parseLong(str);
            result = fact(n);
            %>
            <b>Factorial value: </b> <%= result %>
    </body>
</html>