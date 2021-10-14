<%-- 
    Document   : demo1
    Created on : Feb 3, 2020, 6:48:08 PM
    Author     : deepgamit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo 1</title>
    </head>
    <body>
        <%! int count=10; %>
        <% out.println("The Number is " +count); %>
        
        <jsp:declaration> int count1=20; </jsp:declaration>
        <% out.println("The Second Number is " +count1); %>
        <h2>
        <jsp:scriptlet> out.println("The Second Number is " +count1); </jsp:scriptlet>
        </h2>
        
        <% out.println("The Server Time is: " +new java.util.Date());%>
        <br>
        <%= count1 %>
        </br>
        <jsp:expression> new java.util.Date() </jsp:expression>
        
        
    </body>
</html>
