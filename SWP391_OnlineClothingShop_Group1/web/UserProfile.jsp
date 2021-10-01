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
                    <i class="fa user" id="profileIcon"></i>
                    <!--NAME OF USER-->
                    <h4 style="text-align: center">DINH TIEN LAM</h4>
                    <!--EMAIL OF USER-->
                    <h5>Email: lam@gmail.com</h5>
                    <!--ROLE OF USER-->
                    <h5 style="display: inline-block">Role: </h5>
                    <input type="checkbox" checked="checked" disabled="disabled" style="display: inline-block">
                    <label>Seller</label>
                    <input type="checkbox" disabled="disabled" style="display: inline-block">
                    <label>Customer</label>
                    <br>
                    <!--ACTIVE-->
                    <h5 style="display: inline-block">Status: </h5>
                    <span class="active">Active</span>
                    <br><br>
                    <!--LỰA CHỌN THAY ĐỔI MẬT KHẨU-->
                    <a class="btn primary block" href="confirm-change-password" id="link">Change password</a>
                    <br><br>
                    <!--XEM DANH SÁCH ĐẶT HÀNG CỦA BẢN THÂN-->
                    <a class="btn primary block" href="viewOrder?id=${acc.id}" id="link">Your orders</a>
                    <br><br>
                    <!--TRỞ VỀ TRANG HOME-->
                    <a href="productList" id="back">Back to Product List page</a>
                    <br><br>
                </div>
                    
                <div class="col-md-3"></div>
                
            </div>      
        </div>
    </body>
</html>
