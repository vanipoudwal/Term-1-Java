<%-- 
    Document   : Login
    Created on : 19 Sep, 2019, 7:57:38 PM
    Author     : VANI POUDWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "j_Security_Check" method = "Post">
            UserName : <input type = "Text" name = "j_Username"><br>
            Password : <input type = "Password" name = "j_Password"><br>
            <input type = "Submit" value = "Login">
        </form>
    </body>
</html>