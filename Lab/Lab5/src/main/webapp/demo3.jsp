<%-- 
    Document   : demo3
    Created on : Feb 3, 2020, 9:14:02 PM
    Author     : deepgamit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Headers </title>
    </head>
    <body>
        <h1>Http Request Headers Example 1</h1>
        <% Enumeration headerNames = request.getHeaderNames();
        
            while(headerNames.hasMoreElements()){
                String paramName = (String) headerNames.nextElement();
                out.print("Header Name: " +paramName);
                out.print("</br>");
                String paramValue = request.getHeader(paramName);
                out.print("Header Value: " +paramValue);
                out.print("</br>");
                out.print("</br>");
            }
        %>
        
        <h1>Http Request Headers Example 2</h1>
        <jsp:scriptlet> 
            
            Enumeration headerNames2 = request.getHeaderNames();
        
            while(headerNames2.hasMoreElements()){
                String paramName1 = (String) headerNames2.nextElement();
                out.print("Header Name: ");
        </jsp:scriptlet> 
        <jsp:expression> paramName1 </jsp:expression>
        </br>
        
        <jsp:scriptlet>
                String paramValue1 = request.getHeader(paramName1);
                out.print("Header Value: ");
        </jsp:scriptlet>
        <jsp:expression> paramValue1 </jsp:expression>
        </br>
        </br>
        <jsp:scriptlet> 
                 }
        </jsp:scriptlet>

    </body>
</html>
