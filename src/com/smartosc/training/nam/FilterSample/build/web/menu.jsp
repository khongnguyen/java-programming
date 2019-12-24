<%-- 
    Document   : menu
    Created on : Mar 5, 2019, 8:10:30 AM
    Author     : TrongDuyDao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            a{padding:10px;text-decoration: none;}
        </style>
    </head>
    <body>
        <p>
            <a href="/FilterSample/index.jsp">Index</a>
            <a href="/FilterSample/admin/index.jsp">Admin</a>
            <a href="/FilterSample/user/index.jsp">User</a>   
            <c:if test="${not empty sessionScope.login}">
                Welcome ${sessionScope.login.username}
                <a href="/FilterSample/logout">Sign out</a>   
            </c:if>
        </p>
    </body>
</html>
