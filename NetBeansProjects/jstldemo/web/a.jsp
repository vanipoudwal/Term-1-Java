<%-- 
    Document   : a
    Created on : 7 Sep, 2019, 7:17:13 PM
    Author     : VANI POUDWAL
--%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var = "a" value = "10"></c:set>
        <c:set var = "b" value = "15"/>
        <c:set var = "sum" value = "${a+b}"/>
        Sum = <c:out value = "${sum}"/>
        <c:if test = "${sum > 10}"/>
        Great...
        
      
        <c:choose>
            <c:when test = "${sum > 10}">
                Wow..!!!
            </c:when>
                <c:when test = "${sum < 10}">
                Ohoo..!!!
            </c:when>
                <c:otherwise>
                Baap Re..!!!
            </c:otherwise>
        </c:choose>
                
     <br/>
        <c:forEach var = "i" begin = "I" end = "10">
            <c:out value = "${i}"/><br/>
        </c:forEach>
    </body>
</html>