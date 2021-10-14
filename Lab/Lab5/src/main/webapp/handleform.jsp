<%-- 
    Document   : handleform
    Created on : Feb 3, 2020, 7:16:35 PM
    Author     : deepgamit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Handle JSP Form </title>
    </head>
    <body>
        
        <form action="handleform.jsp">
            
           <input type="text" name="username">
           <input type="submit" value="submit"> 
           
        </form>
        
        <% String username = request.getParameter("username");
        if(username!= null)
            out.println("Welcome "+username);
        %>
        
        
    </body>
</html>
