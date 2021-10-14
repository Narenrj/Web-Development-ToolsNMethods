<%-- 
    Document   : demo2
    Created on : Feb 3, 2020, 7:34:32 PM
    Author     : deepgamit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@include file= "header.html" %>
<h1>This is my JSP</h1>
<h2>
<% out.println("Session Id: " +session.getId());%>
</h2>
<%@include file="footer.html" %>
