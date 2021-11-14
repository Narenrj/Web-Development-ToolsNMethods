<%-- 
    Document   : IOCExample
    Created on : Nov 3, 2021, 2:26:11 PM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        User Name: <strong> ${requestScope.username} </strong><br><br>
        IOC TEXT: <strong> ${requestScope.info}</strong><br><br>
        Object ID: <strong> ${requestScope.objectID}</strong><br><br>
    </body>
</html>
