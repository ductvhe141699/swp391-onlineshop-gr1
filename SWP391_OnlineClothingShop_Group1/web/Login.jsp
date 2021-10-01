<%-- 
    Document   : Login
    Created on : Sep 30, 2021, 8:39:47 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Printd T-Shirt - RedStore</title>
 
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/login.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    
    <!-- ------------Account-page------------------- -->
    <div class="account-page">
        <div class="container">
            <div class="row">
                <div class="col-2">
                    <img src="images/image1.png" width="80%">
                </div>

                <div class="col-2">
                    <div class="form-container">
                        <div class="form-btn">
                            <span onclick="login()">Login</span>
                           
                            <span onclick="register()">Register</span>

                            <hr style="width: 50%; margin-right: -5%;"  id="Indicator">
                            
                        </div>

                        <form id="LoginForm" action="login" method ="post">
                            
                            <input name="user" type="text" placeholder="Username">
                            <input name ="pass" type="password" placeholder="Password">
                            <button type="submit" class="btn">Login</button>
                            <p class="text-danger">${mess}</p>
                            <a href="">Forgot password</a>
                        </form>

                        <form id="RegForm" action ="register" method="post">
                            <input name="user" type="text" placeholder="Username">
                            <input name="email" type="email" placeholder="Email">
                            <input name="pass" type="password" placeholder="Password">
                            <input name="repass" type="password" placeholder="Repeat Password">
                            <button type="submit" class="btn">Register</button>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ------------footer----------- -->

        <!-- ------------------- js for Account form-------------- -->

        <script>
            var LoginForm = document.getElementById("LoginForm");
            var RegForm = document.getElementById("RegForm");
            var Indicator = document.getElementById("Indicator");

            function register() {
                RegForm.style.transform = "translateX(-300px)";
                LoginForm.style.transform = "translateX(-300px)";
                Indicator.style.transform = "translateX(75px)";

            }
            function login() {
                RegForm.style.transform = "translateX(0px)";
                LoginForm.style.transform = "translateX(0px)";
                Indicator.style.transform = "translateX(0px)";
            }


        </script>

</body>

</html>
