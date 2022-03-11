<%-- 
    Document   : nameView
    Created on : 19 mars 2020, 00:17:21
    Author     : faycal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrez votre nom</title>
    </head>
    <body>
        <h1>Entrez votre nom</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
            Nom :
            <spring:bind path="value">
            <input type="text" name="${status.expression}" value="${status.value}">
            </spring:bind>
            <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
