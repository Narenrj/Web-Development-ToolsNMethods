<%-- 
    Document   : AddMovies
    Created on : Oct 23, 2021, 1:24:02 PM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            label {
                float: left;
                width: 150px;
            }

            #container {
                width: 100%;
                margin: auto;
            }
        </style>
    </head>
    <body bgcolor="DarkSalmon">
        <h1>Welcome to Add Movies Section!</h1>
        <p><i> Please provide all the fields below to add your movie to our collections: </i></p>
        <div id="container">
            <form method='post' action="addmovies.htm">

                <label for="movieID">Movie ID:</label>
                <input type="text" id="movieID" name="movieID"><br><br>

                <label for="movieTitle">Movie Title:</label>
                <input type="text" id="movieTitle" name="movieTitle"><br><br>

                <label for="actor">Actor Name:</label>
                <input type="text" id="actor" name="actor"><br><br>

                <label for="actress">Actress Name:</label>
                <input type="text" id="actress" name="actress"><br><br>

                <label for="genre">Movie Genre:</label>
                <input type="text" id="genre" name="genre"><br><br>

                <label for="year">Release Year:</label>
                <input type="text" id="year" name="year"><br><br>

                <input type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
