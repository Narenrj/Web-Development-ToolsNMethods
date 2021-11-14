<%-- 
    Document   : Part3
    Created on : Oct 22, 2021, 11:13:09 AM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Page</title>
    </head>
    <body>
        <h1>JSTL TAGS!</h1>
        <h2>1:Core Tags</h2>
        <c:out value="${'This content is displayed using <strong> c:out tag </strong>'}"/><br><br>
        <% out.println("<strong>For Each Tag</strong>");%><br>
        <c:forEach var="j" begin="1" end="5">  
            Value at Each Iteration: <c:out value="${j}"/><p>
            </c:forEach>

            <% out.println("<strong>JSTL c:when, c:otherwise, c:choose</strong>");%><br><br>

            <c:set value="10" var="num"></c:set>  
            <c:choose>  
                <c:when test="${num%2==0}">  
                    <c:out value="${num} is even number"></c:out>
                </c:when>  
                <c:otherwise>  
                    <c:out value="${num} is odd number"></c:out><br><br>
                </c:otherwise>  
            </c:choose>

        <h2>2.Formatting Tags</h2>

        <h3>The fmt:parseNumber tag Example is:</h3>  

        <c:set var="Amount" value="786.970" />  

        <fmt:parseNumber var="j" type="number" value="${Amount}" />  
        <p><i>Amount is:</i>  <c:out value="${j}" /></p>  

        <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
        <p><i>Amount is:</i>  <c:out value="${j}" /></p>  

        <h3>Formatting of Number:</h3>  
        <c:set var="Amount" value="9850.14115" />     
        <p>Formatted Number-3:  
            <fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p> 

        <h3>Parsed Date:</h3>  
        <c:set var="date" value="12-08-2016" />  

        <fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
        <p><c:out value="${parsedDate}" /></p> 


        <h2>3.Function Tags</h2>
        <c:set var="String" value="Welcome to javatpoint"/>  

        <h3>Contains tag </h3>
        <c:if test="${fn:contains(String, 'javatpoint')}">  
            <p>Found javatpoint string<p>  
            </c:if>  

            <c:if test="${fn:contains(String, 'JAVATPOINT')}">  
            <p>Found JAVATPOINT string<p>  
            </c:if>  

        <h3>Index Of tag </h3>
        <c:set var="string1" value="It is First String."/>  
        <c:set var="string2" value="It is <xyz>Second String.</xyz>"/>  

        <p>Index of "First": ${fn:indexOf(string1, "First")}</p>
        <p>Index of "Second": ${fn:indexOf(string2, "Second")}</p>

        <h3>Length tag </h3>
        <c:set var="str1" value="This is first string"/>  
        <c:set var="str2" value="Hello"/>  
        Length of the String-1 is: ${fn:length(str1)}<br>
        Length of the String-2 is: ${fn:length(str2)}  

        <h2>4.XML Tags: </h2>    
        <c:set var="vegetable">  
        <vegetables>  
            <vegetable>  
                <name>onion</name>  
                <price>40</price>  
            </vegetable>  
            <vegetable>  
                <name>Potato</name>  
                <price>30</price>  
            </vegetable>  
            <vegetable>  
                <name>Tomato</name>  
                <price>90</price>  
            </vegetable>  
        </vegetables>  
    </c:set>  
    <x:parse xml="${vegetable}" var="output"/>  
    <h3>Out Tag: </h3>
    <b>Name of the vegetable is</b>:  
    <x:out select="$output/vegetables/vegetable[1]/name" /><br>  
    <b>Price of the Potato is</b>:  
    <x:out select="$output/vegetables/vegetable[2]/price" /> 
    <h3>IF Tag: </h3>

    <x:if select="$output/vegetables/vegetable/price < 100">  
        Vegetables prices are very low.  
    </x:if> 
    <h3>Set Tag: </h3>
    <c:set var="book">
        <books>   
            <book>  
                <name>Tomorrow land</name>  
                <author>Brad Bird</author>  
                <price>2000</price>  
            </book>  
        </books>  
    </c:set>  
    <x:parse xml="${book}" var="output"/>  
    <x:set var="fragment" select="$output/books/book[1]/price"/>  
    <b>The price of the Tomorrow land book</b>:  
    <x:out select="$fragment" /> 

    <h2>5.SQL Tags: </h2>   
    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                       url="jdbc:mysql://localhost/moviestore"  
                       user="root"  password="MySQLPwd$21"/>  

    
     <sql:update dataSource="${db}" var="count">  
        UPDATE moviecollections SET RELEASE_YEAR = 2011 WHERE MOVIE_ID = 105;
    </sql:update>
    

    <sql:query dataSource="${db}" var="rs">  
        SELECT * from moviecollections;
    </sql:query>  

    <table border="2" width="100%">  
        <tr>  
            <th>Movie Name</th>  
            <th>Movie Genre</th>
            <th>Release Year</th>
        </tr>  


        <c:forEach var="table" items="${rs.rows}">  
            <tr>  
                <td><c:out value="${table.MOVIE_TITLE}"/></td>  
                <td><c:out value="${table.MOVIE_GENRE}"/></td>
                <td><c:out value="${table.RELEASE_YEAR}"/></td>  
            </tr>  
        </c:forEach>  
    </table>  

</body>
</html> 
