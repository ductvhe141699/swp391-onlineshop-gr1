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
    </head>
    <body>
        <div class="container">
            <div class="row">
                <br><br>
            </div>
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6" id="form">
                    <br><br>
                    <%-- Display username --%>
                    <!--<h4 style="text-align: center">${sessionScope.acc.user}</h4>-->
                    <i class="fa fa-user-circle" id="profileIcon"></i><h4 style="text-align: center">Đinh Tiến Lâm</h4>
                    <!-- Message for notification -->
<!--                    <c:if test="${requestScope.message ne null}">
                        <h5>${requestScope.message}</h5>
                    </c:if>       -->

                    <%-- Display user email --%>
                    <!--<h5>Email: ${acc.email}</h5>-->
                    <h5>Email: lam@gmail.com</h5>
                    <%-- Display user role --%>
                    <h5 style="display: inline-block">Role: </h5>
                    <!--                    <c:choose>
                                            <c:when test="${acc.isSell==1}">-->
                    <input type="checkbox" checked="checked" disabled="disabled" style="display: inline-block">
                    <label>Seller</label>
                    <input type="checkbox" disabled="disabled" style="display: inline-block">
                    <label>Customer</label>
                    <!--                        </c:when>           
                                            <c:otherwise>
                                                <input type="checkbox" disabled="disabled" style="display: inline-block">
                                                <label>Seller</label>
                                                <input type="checkbox" checked="checked" disabled="disabled" style="display: inline-block">
                                                <label>Customer</label>
                                            </c:otherwise>
                                        </c:choose>-->

                    <%-- Display user status --%>
                    <br>
                    <h5 style="display: inline-block">Status: </h5>
                    <!--<c:choose>-->
                        <c:when test="${acc.status == 1}">
                            <span class="active">Active</span>
<!--                        </c:when> 
                        <c:when test="${acc.status == 3}">
                            <span class="login-facebook">Login with Facebook</span>
                        </c:when>
                        <c:when test="${acc.status == 4}">
                            <span class="unverified">Unverified</span>
                        </c:when>
                    </c:choose>      -->
                    <br><br>

                    <%-- Link to change user password --%>
                    <a class="btn btn-primary btn-block" href="confirm-change-password" id="link">Change password</a>

                    <br><br>

                    <%-- Link to view order history --%>
                    <a class="btn btn-primary btn-block" href="viewOrder?id=${acc.id}" id="link">Your orders</a>
                    <br><br>

                    <%-- Link to return to home page --%>
                    <a href="productList" id="back">Back to Product List page</a>
                    <br><br>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>

    </body>
</html>
