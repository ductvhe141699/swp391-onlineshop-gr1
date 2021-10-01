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
        <title>User's Profile</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link href="css/ChangePassword.css" rel="stylesheet" type="text/css"/> 
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6" id="text">
                    <h1>Change Your Password</h1>   
                    <br><br>
                    <form action="change-password" method="POST">
                        <input type="password" id="pass" name="pass" placeholder="Old Password" class="control">
                        <br><br>
                        <input type="password" id="new-pass" name="new-pass" placeholder="Enter new Password" class="control">
                        <input type="password" id="repeat-new-pass" name="repeat-new-pass" placeholder="Re-enter new Password" class="control">
                        <hr>
                        <button class="btn primary block" type="submit" style="width: 200px"><i class="fa check-circle"></i>Confirm</button>
                    </form>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>
