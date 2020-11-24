<%@page import = "java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("userName") %></h1>
        <%! int x = 10; %>
        X = <%= x %>
        <%
            int a = 5, b = 7;
            int c = a+b;
            out.println("Sum = "+c);
        %>
        Today is <%= new Date()%>
        <%--I am jsp comment--%>
        <%/*I am java comment*/%>
        <!--I am html comment%-->
    </body>
</html>