<%-- 
    Document   : ShoppingCart
    Created on : Oct 24, 2021, 11:37:49 AM
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
        <a href="">Books</a>
        <a href="http://localhost:8081/Assignment4/Computers.jsp">Computers</a>
        <a href="http://localhost:8081/Assignment4/Gadgets.jsp">Gadgets</a>
        <a href="http://localhost:8081/Assignment4/Grocery.jsp">Grocery</a>
        <a href="http://localhost:8081/Assignment4/VirtualCart.jsp">Cart</a>
    </div>

    <div class="main">
        <h2>Books</h2>
        <hr>
        <p>Please check out our amazing collection of Books.</p>
        <!--        <form action="virtualCart" method="post">-->
        <form action="virtualCart.htm" method="post">
            <input type="checkbox" id="item1" name="books" value="Game of Thrones: The Complete Series [Includes Digital Copy]">
            <label for="item1"> Game of Thrones: The Complete Series [Includes Digital Copy] </label><br>
            <input type="checkbox" id="item2" name="books" value="Harry Potter and the Sorcerer Stone [SteelBook]">
            <label for="item2"> Harry Potter and the Sorcerer's Stone [SteelBook] </label><br>
            <input type="checkbox" id="item3" name="books" value="In Search of Lost Time by Marcel Proust">
            <label for="item3"> In Search of Lost Time by Marcel Proust.</label><br>
            <input type="checkbox" id="item4" name="books" value="Don Quixote by Miguel de Cervantes">
            <label for="item4"> Don Quixote by Miguel de Cervantes.</label><br>
            <input type="submit" value="Submit">

        </form>
    </div>

</body>
</html>
