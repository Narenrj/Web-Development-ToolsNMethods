<%-- 
    Author     : sachin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: lightblue; text-align: center">
        <h1>User Registration Details</h1>
        <table style="margin-left: auto; margin-right: auto; border: 1px solid black;">
            <tr>
                <th style="border: 1px solid black;">ID</th>
                <th style="border: 1px solid black;">NAME</th>
            </tr>
            <tr>
                <td style="border: 1px solid black;">${requestScope.user.id}</td>
                <td style="border: 1px solid black;">${requestScope.user.name}</td>
            </tr>
        </table>
        <br><br>
        <b><a href="index.htm">GO BACK</a></b>
    </body>
</html>
