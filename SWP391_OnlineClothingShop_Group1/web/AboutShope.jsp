<%-- 
    Document   : AboutShope
    Created on : Nov 7, 2021, 3:32:19 PM
    Author     : LAMDTHE153097
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SHOPE</title>
        <!--CSS-->
        <link href="css/AboutShope.css" rel="stylesheet" type="text/css"/> 
        <!--ICON-->
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <header>
            <a href="${pageContext.request.contextPath}/home">
                <img class="logo" src="${pageContext.request.contextPath}/resources/img/SHOPE-logos_transparent.png" alt="logo"></a>
            <ul class="main-nav">
                <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0">
                        Product</a></li>
                <li><a href="Recruitment.jsp">Recruitment</a></li>
            </ul>
                        <div class="clearfix"></div>
            <div class="row">
                <div class="heading-main-box">
                    <h1>Vietnamese people<br>use Vietnamese goods.<br>So join with us</h1>
                </div>
            </div>
        </header>
        <!-- Copyright -->
        <div class="text-center">
            © 2021 Copyright:
            <a class="text-white" href="#">SWP391 - GRP1</a>
        </div>
        <!-- Copyright -->
    </footer>
</body>
</html>
