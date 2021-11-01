<%-- 
    Document   : UserProfile
    Created on : Sep 30, 2021, 9:19:51 PM
    Author     : LAMDTHE153097
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SHOPE</title>
        <!--Boostrap-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <!--Font-->
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <!--Fontawesome-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <!--CSS-->
        <link href="css/UserProfile.css" rel="stylesheet" type="text/css"/> 
        <!--<link rel="stylesheet" type="text/css" href="./css/style.css" />-->
        <!--<link rel="stylesheet" type="text/css" href="./css/queries.css" />-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <!--ICON-->
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>

        <header>
            <div class="row m-0 p-0">
                <span id="promo" class="d-lg-block d-none">
                    <marquee style="width: 100%" behavior="scroll" direction="left"><i>Get 10% SALE by using special discount code "CHEERSLUV"</i></marquee>
                </span>
            </div>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <!-- LOGO -->
                <a class="navbar-brand col-lg-2 offset-lg-2 logo" href="${pageContext.request.contextPath}/home">
                    <img src="${pageContext.request.contextPath}/resources/img/SHOPE-logos_transparent.png"> </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" 
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" 
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" 
                               href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0">Product</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#footer">Contacts Us</a>
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0" method="get" action="${pageContext.request.contextPath}/product">
                        <input type="hidden" name="page" value="1"/>
                        <input name="query" class="form-control mr-sm-2" type="search" placeholder="Search here..." aria-label="Search">
                        <input type="hidden" name="subcategory" value="0"/>
                        <input type="hidden" name="brand" value="0"/>
                        <input type="hidden" name="price" value="0"/>
                        <input type="hidden" name="sortType" value="0"/>
                        <input type="hidden" name="sortMode" value="0"/>
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>
        </header>

        <div class="container rounded bg-white mt-5 mb-5">
            <div class="row">

                <div class="col-md-3 border-right">
                    <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" src="resources/img/user_no-frame.png" width="90"><span class="font-weight-bold">${user.userName}</span><span class="text-black-50">${user.email}</span><span>Viet Nam</span></div>
                </div>

                <div class="col-md-5 border-right">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <h6 class="text-right">Your profile</h6>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-6"><label class="labels">Name</label><input type="text" class="form-control" placeholder="first name" value="${user.userName}" disabled></div>

                        </div>
                        <div class="row mt-3">
                            <div class="col-md-12"><label class="labels">Your Number ID</label><input type="text" class="form-control" placeholder="headline" value="${user.userID}" disabled></div>
                            <div class="col-md-12"><label class="labels">Your Current Password</label><input type="text" class="form-control" placeholder="headline" value="${user.password}" disabled></div>
                                <c:choose>
                                    <c:when test="${user.roleID==1}">
                                    <div class="col-md-12"><label class="labels">Current Role</label><input type="text" class="form-control" placeholder="education" value="Admin" disabled></div>
                                    </c:when>
                                </c:choose>
                                <c:choose>
                                    <c:when test="${user.roleID==2}">
                                    <div class="col-md-12"><label class="labels">Current Role</label><input type="text" class="form-control" placeholder="education" value="Seller" disabled></div>
                                    </c:when>
                                </c:choose>
                                <c:choose>
                                    <c:when test="${user.roleID==3}">
                                    <div class="col-md-12"><label class="labels">Current Role</label><input type="text" class="form-control" placeholder="education" value="Customer" disabled></div>
                                    </c:when>
                                </c:choose>

                        </div>
                        <div class="row mt-3">
                            <div class="col-md-6"><label class="labels">Country</label><input type="text" class="form-control" placeholder="country" value="Viet Nam" disabled></div>

                        </div>
                        <a href="changepass" style="width: 300px"
                           class="mt-5 text-center btn btn-primary profile-button" type="button">Change your password
                        </a>
                        <br>
                        <a href="viewOrder?id=${user.userID}" style="width: 300px"
                           class="mt-5 text-center btn btn-primary profile-button" type="button">View your orders
                        </a>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center experience"><span>About us</span><span class="border px-3 p-1 add-experience"><i class="fa fa-plus"></i>&nbsp;Get more information</span></div>
                        <div class="d-flex flex-row mt-3 exp-container"><img src="https://i.imgur.com/azSfBM3.png" width="45" height="45">
                            <div class="work-experience ml-1"><span class="font-weight-bold d-block">SHOPE</span><span class="d-block text-black-50 labels">Twitter Inc.</span><span class="d-block text-black-50 labels">March,2017 - May 2020</span></div>
                        </div>
                        <hr>
                        <div class="d-flex flex-row mt-3 exp-container"><img src="https://img.icons8.com/color/100/000000/facebook.png" width="45" height="45">
                            <div class="work-experience ml-1"><span class="font-weight-bold d-block">SHOPE</span><span class="d-block text-black-50 labels">Facebook Inc.</span><span class="d-block text-black-50 labels">March,2017 - May 2020</span></div>
                        </div>
                        <hr>
                        <div class="d-flex flex-row mt-3 exp-container"><img src="https://img.icons8.com/color/50/000000/google-logo.png" width="45" height="45">
                            <div class="work-experience ml-1"><span class="font-weight-bold d-block">SHOPE</span><span class="d-block text-black-50 labels">Google Inc.</span><span class="d-block text-black-50 labels">March,2017 - May 2020</span></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%-- FOOTER --%>
        <footer class="text-white text-center text-lg-start" style="background-color: #23242a;" id="footer">
            <!-- Grid container -->
            <div class="container p-4">
                <!--Grid row-->
                <div class="row mt-4">
                    <!--Grid column-->
                    <div class="col-lg-4 col-md-12 mb-4 mb-md-0">
                        <h5 class="text-uppercase mb-4"><i class="fas fa-tshirt"></i>&nbsp;About shop</h5>

                        <p>
                            Our purpose at Shope is to empower people to lead bold and full lives. 
                        </p>

                        <p>
                            We believe that if you look good, you feel good. And when you feel good you can do good for others around you. Shope brings you a wide range of trendy shoes, beautiful scarves, and statement-making jewelry, all at affordable prices to make them accessible to you. 
                        </p>

                        <div class="my-4">
                            <!-- Facebook -->
                            <a type="button" class="btn btn-floating btn-warning btn-lg"><i class="fab fa-facebook-f"></i></a>
                            <!-- Dribbble -->
                            <a type="button" class="btn btn-floating btn-warning btn-lg"><i class="fab fa-instagram"></i></a>
                            <!-- Twitter -->
                            <a type="button" class="btn btn-floating btn-warning btn-lg"><i class="fab fa-twitter"></i></a>
                            <!-- Google + -->
                            <a type="button" class="btn btn-floating btn-warning btn-lg"><i class="fab fa-google"></i></a>
                            <!-- Linkedin -->
                        </div>
                    </div>
                    <!--Grid column-->

                    <!--Grid column-->
                    <div class="col-lg-4 col-md-6 mb-4 mb-md-0">
                        <h5 class="text-uppercase mb-4 pb-1"><i class="fas fa-search"></i>&nbsp;Search product</h5>
                        <form method="get" action="${pageContext.request.contextPath}/product">
                            <div class="form-floating mb-4">
                                <input type="hidden" name="page" value="1"/>
                                <input type="search" name="query" id="searchbarFooter" class="form-control" placeholder="Search Something">
                                <input type="hidden" name="subcategory" value="0"/>
                                <input type="hidden" name="brand" value="0"/>
                                <input type="hidden" name="price" value="0"/>
                                <input type="hidden" name="sortType" value="0"/>
                                <input type="hidden" name="sortMode" value="0"/>
                                <label for="searchbarFooter" style="color:black;">Search</label>
                                <div class="form-notch"><div class="form-notch-leading" style="width: 9px;"></div><div class="form-notch-middle" style="width: 48.8px;"></div><div class="form-notch-trailing"></div></div></div>
                        </form>
                        <ul class="fa-ul" style="margin-left: 1.65em;">
                            <li class="mb-3">
                                <span class="fa-li"><i class="fas fa-home"></i></span><span class="ms-2">Km29 Đại lộ Thăng Long, huyện Thạch Thất, Hà Nội</span>
                            </li>
                            <li class="mb-3">
                                <span class="fa-li"><i class="fas fa-envelope"></i></span><span class="ms-2">shope@gmail.com</span>
                            </li>
                            <li class="mb-3">
                                <span class="fa-li"><i class="fas fa-phone"></i></span><span class="ms-2">+84 123456789</span>
                            </li>
                            <li class="mb-3">
                                <span class="fa-li"><i class="fas fa-print"></i></span><span class="ms-2">+84 123456789</span>
                            </li>
                        </ul>
                    </div>
                    <!--Grid column-->

                    <!--Grid column-->
                    <div class="col-lg-4 col-md-6 mb-4 mb-md-0">
                        <h5 class="text-uppercase mb-4"><i class="far fa-clock"></i>&nbsp;Opening hours</h5>

                        <table class="table text-center text-white">
                            <tbody class="font-weight-normal">
                                <tr>
                                    <td>Mon - Thu:</td>
                                    <td>8am - 9pm</td>
                                </tr>
                                <tr>
                                    <td>Fri - Sat:</td>
                                    <td>8am - 12pm</td>
                                </tr>
                                <tr>
                                    <td>Sunday:</td>
                                    <td>9am - 10pm</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <!--Grid column-->
                </div>
                <!--Grid row-->
            </div>
            <!-- Grid container -->

            <!-- Copyright -->
            <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                © 2021 Copyright:
                <a class="text-white" href="#">SWP391 - GRP1</a>
            </div>
            <!-- Copyright -->
        </footer>
        <!--BOOTSTRAP5-->
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
        ></script>
        <!--SCRIPT--> 
        <script src="${pageContext.request.contextPath}/js/script.js"></script>
    </body>
</html>
