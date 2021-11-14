<%-- 
    Document   : AddBooks
    Created on : Oct 24, 2021, 1:36:50 AM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="DarkOliveGreen">
        <h1>Add to our Collections !</h1>

        <%
            String numberOfBooks = request.getParameter("books");
            //out.println("Next Line: " + numberOfBooks);

            int numberofRows = Integer.parseInt(numberOfBooks);
            int number = (int) request.getAttribute("number");
        %>

        
        <form method="post" action="addBooksToDB">
            <table border="1">
                <tr>
                    <th bgcolor="orange">ISBN</th>
                    <th bgcolor="orange">Title</th>
                    <th bgcolor="orange">Authors</th>
                    <th bgcolor="orange">Price</th>
                </tr>
                <p><i>Please fill the below fields to save your book to our collection</i></p>

                <c:forEach begin="1" end= "${number}">
                    <tr>
                        <td>
                            <input type="text" id="isbn" name="isbn">
                        </td>
                        <td>
                            <input type="text" id="btitle" name="btitle">
                        </td>
                        <td>
                            <input type="text" id="authors" name="authors"> 
                        </td>
                        <td>
                            <input type="text" id="price" name="price"> 
                        </td>
                    </tr>
                </c:forEach>
            </table><br>

            <input type="submit" value="Submit">
        </form>


    </body>
</html>
