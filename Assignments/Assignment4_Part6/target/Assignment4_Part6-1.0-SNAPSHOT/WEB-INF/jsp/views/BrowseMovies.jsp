<%-- 
    Document   : BrowseMovies
    Created on : Oct 23, 2021, 1:23:50 PM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="pink">
        <h1>Browse through our Awesome Collections !</h1>
        <p><i> Please provide a keyword & type of keyword provided to identify your movie: </i></p>
        <form method='post' action="retrieve.htm">
            <label for="keyword">Keyword:</label>
            <input type="text" id="keyword" name="keyword"><br><br>

            <div>
                <input type="radio" id="title" name="drone" value="title"
                       checked>
                <label for="title">Search By Movie Title</label>
            </div>
            <br>
            <div>
                <input type="radio" id="actor" name="drone" value="actor">
                <label for="actor">Search By Actor</label>
            </div>
            <br>
            <div>
                <input type="radio" id="actress" name="drone" value="actress">
                <label for="actress">Search By Actress</label>
            </div>
            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
