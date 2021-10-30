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
        <title>SHOPE</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/UserProfile.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>
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
                        <a href="ViewOrdersHistory.jsp" style="width: 300px"
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
        <%@include file="model/footer.jsp" %>
        <!-- BOOTSTRAP5-->
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
        ></script>
        <!-- SCRIPT -->
        <script src="${pageContext.request.contextPath}/js/script.js"></script>
    </body>
</html>
