<%-- 
    Document   : demo4
    Created on : Feb 3, 2020, 9:30:51 PM
    Author     : deepgamit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Headers demo</title>
    </head>
    <body>
        <h1>Print Headers Example using JSTL</h1>
        
        <c:forEach var="entry" items="${header}">
            <br>
            ${entry.key} - ${entry.value}
            
        </c:forEach>
            
    </body>
</html>
