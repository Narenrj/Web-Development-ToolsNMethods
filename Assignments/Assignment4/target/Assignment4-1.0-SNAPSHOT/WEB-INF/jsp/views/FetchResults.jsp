<%-- 
    Document   : FetchResults
    Created on : Oct 23, 2021, 6:01:23 PM
    Author     : naren
--%>

<%@page import="com.movies.model.Movies"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Results Page</title>
    </head>
    <body bgcolor ="LightBlue">
        <h1>Results Page</h1>
        <%
            Movies obj = (Movies)request.getAttribute("test1");
            //out.println(obj);
            out.println("The Movie Name is: <strong>"+obj.getMovie_Title()+"</strong>");
            out.println("<br><br>");
            out.println("The Movie Actor is: <strong>"+obj.getLead_Actor()+"</strong>");
            out.println("<br><br>");
            out.println("The Movie Actress is: <strong>"+obj.getLead_Actress()+"</strong>");
            out.println("<br><br>");
            out.println("The Movie Name is: <strong>"+obj.getMovie_Genre()+"</strong>");
            out.println("<br><br>");
            out.println("The Movie Name is: <strong>"+obj.getRelease_Year()+"</strong>");
        %>
        <br><br>
        <a href="http://localhost:8081/Assignment4/MovieCollections.jsp">Click Here to be Redirected to Main Page</a>
    </body>
</html>
