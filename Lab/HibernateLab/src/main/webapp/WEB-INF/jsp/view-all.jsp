<%-- 
    Document   : view-all
    Created on : Nov 6, 2021, 12:23:59 AM
    Author     : sachin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view all</title>
    </head>
    <body style="background-color: lightblue; text-align: center">
        <h1>All Users</h1>
        <table style="margin-left: auto; margin-right: auto; border: 1px solid black;">
            <tr>
                <th style="border: 1px solid black;">ID</th>
                <th style="border: 1px solid black;">NAME</th>
            </tr>
            <c:forEach items="${userList}" var="u">
                <tr>
                    <td style="border: 1px solid black;">${u.id}</td>
                    <td style="border: 1px solid black;">${u.name}</td>
                </tr>
            </c:forEach>
        </table>
        <br><br>
        <b><a href="index.htm">GO BACK</a></b>
    </body>
</html>
