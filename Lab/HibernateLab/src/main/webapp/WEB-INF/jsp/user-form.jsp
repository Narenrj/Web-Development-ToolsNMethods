<%-- 
    Author     : sachin
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
    </head>
    <body style="background-color: lightblue; text-align: center">
        <h1>User Registration Page</h1>
        <form:form modelAttribute ="user">
            Name: <form:input path="name" /> 
            <br><br>
            <input type="submit" value="REGISTER"/>
        </form:form>
    </body>
</html>
