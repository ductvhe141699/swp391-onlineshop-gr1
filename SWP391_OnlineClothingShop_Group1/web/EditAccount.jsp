<%-- 
    Document   : EditAccount
    Created on : Oct 11, 2021, 9:08:41 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/EditAccount.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" type="text/css" href="./css/homepage.css" /> 
        <title>Edit Acount</title>
    </head>
    <body>
        <%@include file="model/header.jsp" %>
         <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="editAccount" method="POST">
                            <div class="modal-header">						
                                <h4 class="modal-title">Edit Account</h4>
                                <a type="button" class="close" href="AccountManagerControl" aria-hidden="true">&times;</a>                                                         
                            </div>
                            <div class="modal-body">	
                                <div class="form-group">
                                    <label>ID</label>
                                    <input type="text"  class="form-control" name="id" value="${id}" readonly>
                            </div>
                            <div class="form-group">
                                <label>UserName</label>
                                <input type="text" class="form-control" required name="user" value="${user}">
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="text" class="form-control" required name="pass" value="${pass}">
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input type="text" class="form-control" required name="email" value="${email}">
                            </div>
                            <div class="form-group">
                                <label>Seller</label>
                                <input type="checkbox" class="form-control" name="Seller" value="2" ${role==2?"checked":""} style="height: 30px;">
                            </div>
                            <div class="form-group">
                                <label>Customer</label>
                                <input type="checkbox" class="form-control" name="Admin" value="3" ${role==3?"checked":""} style="height: 30px;">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <a type="button" class="btn btn-default" href="AccountManagerControl">Cancel</a>
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
                            <%@include file="model/footer.jsp" %>
    </body>
</html>
