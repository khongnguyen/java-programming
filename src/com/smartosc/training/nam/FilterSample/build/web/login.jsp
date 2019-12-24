<%-- 
    Document   : login
    Created on : Mar 5, 2019, 8:20:08 AM
    Author     : TrongDuyDao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>   
        <c:if test="${not empty sessionScope.error}">
            <p style="color:red;">
                ${sessionScope.error}
            <p>
        </c:if>
        <form action="login" method="post">
            <p>Username 
            <input type="text" name="username" />
            <p>
            Password <input type="text" name="password"/>
            <p><input type="submit" value="Login"/>
        </form>
    </body>
</html>
