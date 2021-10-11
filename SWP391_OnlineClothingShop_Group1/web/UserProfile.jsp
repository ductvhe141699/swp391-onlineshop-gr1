<%-- 
    Document   : UserProfile
    Created on : Sep 30, 2021, 9:19:51 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User's Profile</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/UserProfile.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" type="text/css" href="./css/homepage.css" /> 
    </head>
    <body>
        <%@include file="model/header.jsp" %>
        <div class="container">
            <div class="row">
                <br><br>
            </div>
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-5" id="form">
                    <br><br>
                    <%-- Display username --%>
                    <i class="fas fa-user-circle fa-pulse fa-spin fa-3x" id="profileIcon"></i>
                    <h4 style="text-align: center">${sessionScope.acc.UserName}</h4>

                    <%-- Display user email --%>
                    <h5>Email: ${acc.email}</h5>

                    <%-- Display user role --%>
                    <h5 style="display: inline-block">Role: </h5>
                    <c:choose>
                        <c:when test="${acc.RoldID==1}">
                            <input type="checkbox" checked="checked" disabled="disabled" style="display: inline-block">
                            <label>Seller</label>
                            <input type="checkbox" disabled="disabled" style="display: inline-block">
                            <label>Customer</label>
                        </c:when>           
                        <c:otherwise>
                            <input type="checkbox" disabled="disabled" style="display: inline-block">
                            <label>Seller</label>
                            <input type="checkbox" checked="checked" disabled="disabled" style="display: inline-block">
                            <label>Customer</label>
                        </c:otherwise>
                    </c:choose>

                    <%-- Display user status --%>
                    <br>
                    <h5 style="display: inline-block">Status: </h5>
                    <c:choose>
                        <c:when test="${acc.StatusID == 1}">
                            <span class="active">Active</span>
                        </c:when> 
                        <c:when test="${acc.StatusID == 2}">
                            <span class="active">Locked</span>
                        </c:when>
                        <c:when test="${acc.StatusID == 3}">
                            <span class="login-facebook">Gmail Login</span>
                        </c:when>
                        <c:when test="${acc.StatusID == 4}">
                            <span class="unverified">Unverified</span>
                        </c:when>
                    </c:choose>      
                    <br><br>

                    <%-- Link to change user password --%>
                    <a style="background-color: #ff523b" class="btn btn-primary btn-block" href="ChangePassword.jsp" id="link">Change password</a>

                    <br><br>

                    <%-- Link to view order history --%>
                    <a style="background-color: #ff523b" class="btn btn-primary btn-block" href="?id=${acc.userID}" id="link">My orders</a>
                    <br><br>

                    <%-- Link to return to home page --%>
                    <!--                    <a href="productList" id="back">Back to Product List page</a>-->
                    <br><br>
                </div>
                <div class="col-md-4" id="image">
                    <img style="height: 550px; width: 600px; border-radius: 20px;" src="resources/profile.jpg" alt=""/>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>
                    <div class="row">
                        <br><br>
            </div>
        <%@include file="model/footer.jsp" %>
    </body>
</html>
