<%-- 
    Document   : VirtualCart.jsp
    Created on : Oct 24, 2021, 1:36:50 PM
    Author     : naren
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.movies.model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightCoral">
        <h1>Virtual Cart Page!</h1>
<!--        <form method="post" action="removeItem">-->
             <form method="post" action="removeItem.htm">

            <!--            //<label for="item1"> FROSTED FLAKES TIGER 64 OZ</label><br>-->
            <%
                if (session.getAttribute("items") != null) {
                    Cart c1 = (Cart) session.getAttribute("items");
                    ArrayList<String> items = c1.getItemsList();

                    //out.println("<ol>");
                    for (int i = 0; i < items.size(); i++) {
                        //out.println("<li>");
                        //out.println(items.get(i));
                        out.println("<input type='checkbox' id = " + i + " name = 'vCart' value = '"+ items.get(i) +"' >");
                        out.println("<label for=" + i + ">" + items.get(i) + "</label><br>");
                        //out.println("<h3>" + items.get(i) + "</h3>");
                        //out.println("</li>");
                        //out.println("<br>");
                    }
                    //out.println("</ol>");
                }

    //            int size = items.length;
    //            //out.println(size);
    //            out.println("<ol>");
    //            for (int i = 0; i < size; i++) {
    //                out.println("<li>");
    //                out.println("<h3>" + items[i] + "</h3>");
    //                out.println("</li>");
    //                //out.println("<br>");
    //            }
    //            out.println("</ol>");
            %>
            <br>
            <input type="submit" value="Remove">
        </form>
        <br>
        <a href="http://localhost:8081/Assignment4/ShoppingCart.jsp">Click Here to be Redirected to Main Page</a>

    </body>
</html>
