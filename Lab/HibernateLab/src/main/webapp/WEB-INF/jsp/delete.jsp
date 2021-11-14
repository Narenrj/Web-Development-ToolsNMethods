<%-- 
    Document   : update
    Created on : Nov 6, 2021, 12:23:38 AM
    Author     : sachin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>delete</title>
    </head>
    <body style="background-color: lightblue; text-align: center">
        <h1>User Details Update Page</h1>
        <form:form modelAttribute ="user">
            Enter User ID <form:input path="id" />
            <br><br> 
            <input type="submit" value="DELETE"/>
        </form:form>
    </body>
</html>
