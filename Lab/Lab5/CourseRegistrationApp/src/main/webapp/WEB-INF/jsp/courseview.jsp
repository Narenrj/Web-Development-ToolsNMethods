<%@page import="java.util.ArrayList"%>
<%@page import="com.me.pojo.Course"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="course1" class="com.me.pojo.Course" scope="page"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course View</title>
    </head>
    <body>
        <h1>Course View Page</h1>
<!--        <table border="1">
            <tr>
                <td>COURSE</td>
                <td>CRN</td>
                <td>INSTRUCTOR</td>
            </tr>
            <tr>
                <td>${requestScope.course1.code} ${requestScope.course1.title}</td>
                <td>${requestScope.course1.crn}</td>
                <td>${requestScope.course1.instructor}</td>
            </tr>
        </table>-->
        <% 
            ArrayList<Course> courses = (ArrayList)application.getAttribute("courses");
            for(Course c : courses){
                out.println(c.getTitle());
            }
        %>

    </body>
</html>
