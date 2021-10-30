<%-- 
    Document   : ChangePassword
    Created on : Oct 1, 2021, 1:30:47 PM
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
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/ChangePassword.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container mt-3">
            <div class="row">
                <br><br>
            </div>
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-5" id="text">
                    <br><br><br>
                    <h1>Change Your Password</h1>
                    ${mess}
                    <br><br>
                    <form action="changepass" method="POST">
                        <input type="password" id="pass" name="pass" placeholder="Old Password" class="form-control">
                        <br><br>
                        <input type="password" id="new-pass" name="new-pass" placeholder="Enter new Password" class="form-control">
                        <br><br>
                        <input type="password" id="repeat-new-pass" name="repeat-new-pass" placeholder="Re-enter new Password" class="form-control">
                        <hr>
                        <button class="btn btn-primary btn-block" type="submit" style="width: 200px" id='link2'><i class="fa fa-check-circle"></i>Confirm</button>
                    </form>
                    <br><br>
                    <a href="ProfileControl" id="back">Back to My Profile</a>
                    <br><br>
                </div>

                <div class="col-md-4" id="image">
                    <img style="height: 570px; width: 570px; border-radius: 20px; opacity: 0.7; filter: alpha(opacity=50);" src="resources/pass.jpg" alt=""/>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>
        <div class="row">
            <br><br>
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
