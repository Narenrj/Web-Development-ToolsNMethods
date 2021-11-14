<%-- 
    Document   : BookStore
    Created on : Oct 24, 2021, 1:09:11 AM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="Tomato">
        <h1>WELCOME TO OUR BOOK STORE!</h1>
        <p><i> Please enter the number of books you want to add: </i></p>
        <form method='post'action="booksUserChoice">
            <input type="text" id="books" name="books"><br><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
