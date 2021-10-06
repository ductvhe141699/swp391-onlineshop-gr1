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
        <title>Change Your Password</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/ChangePassword.css" rel="stylesheet" type="text/css"/> 
    </head>
    <body>
        <div class="container">
            <div class="row">
                <br>
            </div>
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-5" id="text">
                    <br><br><br>
                    <!--<i class="fa fa-refresh fa-spin" style="font-size:24px"></i>-->
                    <h1>Change Your Password</h1>
                    <br><br>
                    <form action="ChangedPasswordControl" method="POST">
                        <input type="password" id="pass" name="pass" placeholder="Old Password" class="form-control">
                        <br><br>
                        <input type="password" id="new-pass" name="new-pass" placeholder="Enter new Password" class="form-control">
                        <br><br>
                        <input type="password" id="repeat-new-pass" name="repeat-new-pass" placeholder="Re-enter new Password" class="form-control">
                        <hr>
                        <button class="btn btn-primary btn-block" type="submit" style="width: 200px" id='link2'><i class="fa fa-check-circle"></i>Confirm</button>
                    </form>
                    <br><br>
                    <a href="productList" id="back">Back to Product List page</a>
                    <br><br>
                </div>
                
                 <div class="col-md-4" id="image">
                    <img style="height: 570px; width: 570px; border-radius: 20px; opacity: 0.7; filter: alpha(opacity=50);" src="resources/pass.jpg" alt=""/>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>
    </body>
</html>
