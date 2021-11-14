<%-- 
    Document   : MovieCollections
    Created on : Oct 23, 2021, 1:05:47 PM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Store</title>
    </head>
    <body bgcolor="cyan">
        <h1>Welcome To Our Movie Store!</h1>
        <p> Please make your selection below: </p>
        <form method='post' action="getUserChoice">
            <select name="choice" id="choice">
                <option value="browse">Browse Movies</option>
                <option value="add">Add Movies</option>
            </select>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
