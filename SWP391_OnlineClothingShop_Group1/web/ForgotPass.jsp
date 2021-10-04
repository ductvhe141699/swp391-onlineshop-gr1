<%-- 
    Document   : ForgotPass
    Created on : Oct 4, 2021, 11:40:45 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Verification</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/ResetPassword.css" rel="stylesheet" type="text/css"/> 
    </head>
    <body>
        <div class="container">
        <div class="row">
            <br><br>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6" id="text">
                <br>
                <form action="forgetPassword">
                    <h5 name="wrongEmail">${wrongEmail}</h5>
                    <h5><i class="fas fa-exclamation-triangle"></i>Please enter your Username and Email to receive Verification Code:</h5>
                    <br>
                    <input type="text" name="username" placeholder="Your Username" id="username" class="form-control"> <br>
                    <input type="text" name="email" placeholder="Your Email" id="email" class="form-control"> <br><hr>
                    <button class="btn btn-primary btn-block" type="submit" value="OK" id="confirm"><i class="fa fa-envelope-open-text"></i>Confirm</button>

                </form>
                    <br>
            </div>
            <div class="col-md-3"></div>
        </div>
    </div>
    </body>
</html>
