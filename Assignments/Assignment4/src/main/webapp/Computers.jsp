<%-- 
    Document   : Computers
    Created on : Oct 24, 2021, 2:12:57 PM
    Author     : naren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
            font-family: "Lato", sans-serif;
        }

        .sidenav {
            height: 100%;
            width: 160px;
            position: fixed;
            z-index: 1;
            top: 0;
            left: 0;
            background-color: #111;
            overflow-x: hidden;
            padding-top: 20px;
        }

        .sidenav a {
            padding: 6px 8px 6px 16px;
            text-decoration: none;
            font-size: 25px;
            color: #818181;
            display: block;
        }

        .sidenav a:hover {
            color: #f1f1f1;
        }

        .main {
            margin-left: 160px; /* Same as the width of the sidenav */
            font-size: 28px; /* Increased text to enable scrolling */
            padding: 0px 10px;
        }

        @media screen and (max-height: 450px) {
            .sidenav {padding-top: 15px;}
            .sidenav a {font-size: 18px;}
        }
    </style>
</head>
<body>

    <div class="sidenav">
        <a href="http://localhost:8081/Assignment4/ShoppingCart.jsp">Books</a>
        <a href="http://localhost:8081/Assignment4/Computers.jsp">Computers</a>
        <a href="http://localhost:8081/Assignment4/Gadgets.jsp">Gadgets</a>
        <a href="http://localhost:8081/Assignment4/Grocery.jsp">Grocery</a>
        <a href="http://localhost:8081/Assignment4/VirtualCart.jsp">Cart</a>
                 
    </div>

    <div class="main">
        <h2>Books</h2>
        <hr>
        <p>Please check out our amazing collection of Computers.</p>
<!--        <form action="virtualCart" method="post">-->
            <form action="virtualCart.htm" method="post">
            <input type="checkbox" id="item5" name="books" value="MSI GS66 Stealth Series">
            <label for="item5"> MSI GS66 Stealth Series </label><br>
            <input type="checkbox" id="item6" name="books" value="Dell XPS 13 Business Laptop - w/ 11th gen Intel Core - 13.4 FHD Screen">
            <label for="item6"> Dell XPS 13 Business Laptop - w/ 11th gen Intel Core - 13.4 FHD Screen </label><br>
            <input type="checkbox" id="item7" name="books" value="Surface Laptop Go, 256GB SSD, i5, 8GB RAM, Platinum, 12.4">
            <label for="item7"> Surface Laptop Go, 256GB SSD, i5, 8GB RAM, Platinum, 12.4</label><br>
            <input type="checkbox" id="item8" name="books" value="Lenovo ThinkPad X1 Carbon Gen 9 Intel Laptop - 11th Generation Intel Core i7">
            <label for="item8">Lenovo ThinkPad X1 Carbon Gen 9 Intel Laptop - 11th Generation Intel Core i7</label><br>
            <input type="submit" value="Submit">
            
        </form>
    </div>

</body>
</html>