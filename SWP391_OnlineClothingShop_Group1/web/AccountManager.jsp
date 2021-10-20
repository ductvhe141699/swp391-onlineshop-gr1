<%-- 
    Document   : AccountManager
    Created on : Oct 7, 2021, 4:30:11 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>View List of Users</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/AccountManage.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" type="text/css" href="./css/homepage.css" /> 
    </head>
    <body>
        <%@include file="model/header.jsp" %>
         <div class="row">
                <br><br>
            </div>
        <h2 style="font-family: Brush Script MT; text-align: center; font-size: 60px">Account manager</h2>
        <hr>
        <div class="container bootstrap snippets bootdey">
            <div class="row">
                <div class="col-lg-12">
                    <div class="main-box no-header clearfix">
                        <div class="main-box-body clearfix">
                            <div class="table-responsive">
                                <table class="table user-list">
                                    <thead>
                                        <tr>
                                            <th class="text-center"><span>ID</span></th>
                                            <th class="text-center"><span>UserName</span></th>
                                            <th class="text-center"><span>Role</span></th>
                                            <th class="text-center"><span>Action</span></th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${list}" var="o">
                                            <tr>
                                                <td class="text-center">${o.userID}</td>
                                                <td class="text-center">${o.userName}</td>
                                                <td class="text-center">
                                                   
                                                    
                                                        <span class="label label-default">${o.roleID}</span>
                                                    
                                                </td>
                                                <td style="width: 20%;" class="text-center">
                                                    <a href="editAccount?userID=${o.userID}" class="table-link text-info">
                                                        <span class="fa-stack">
                                                            <i class="fa fa-square fa-stack-2x"></i>
                                                            <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                        </span>
                                                    </a>
                                                        <a href="#" onclick="showMess(${o.userID})" class="table-link danger">
                                                        <span class="fa-stack">
                                                            <i class="fa fa-square fa-stack-2x"></i>
                                                            <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                        </span>
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                               
                                <br><br>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
         <div class="row">
                <br><br>
            </div>

        <%@include file="model/footer.jsp" %>
    </body>
    <script>
        function showMess(userID){
            var option=confirm('Are you sure to delete this Account?');
            if(option===true){
                window.location.href = 'deleteAccount?UserID='+userID;
            }
        }
    </script>
</html>
