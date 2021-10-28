<%-- 
    Document   : SearchAccount
    Created on : Oct 22, 2021, 9:44:29 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SHOPE</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/AccountManage.css" rel="stylesheet" type="text/css"/> 
        <link href="css/ChangePassword.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body style="background: #673AB7">
        <%@include file="model/header.jsp" %>
        <div class="row">
            <br><br>
        </div >
        <div class="col-12 center" style="margin-left: 450px;width: 100%">
            <form action="searchAccount" method="post">
                <input type="text" name="txt" value="${tag}" placeholder="The first letter of the name" 
                       class="form-control"/>
                <input type="submit" value="Search" class="form-control"style="background-color: #ff523b; border-color: bisque"/>
            </form>
        </div>
        <div class="row">
            <br><br>
        </div >
        <div class="col-12">
            <c:if test="${listS!=null}">
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
                        <c:forEach items="${listS}" var="o">
                            <tr>
                                <td class="text-center">${o.userID}</td>
                                <td class="text-center">${o.userName}</td>
                                <td class="text-center">
<!--                                                    <span class="label label-default">${o.roleID}</span>-->
                                    <c:if test="${o.roleID==1}">
                                        <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">Admin</a>
                                    </c:if>
                                    <c:if test="${o.roleID==2}">
                                        <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">Seller</a>
                                    </c:if>
                                    <c:if test="${o.roleID==3}">
                                        <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">Customer</a>
                                    </c:if>
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
            </c:if>
            <br><br>
            <a href="AccountManagerControl" id="back">Back to Original List</a>
            <br><br>
        </div>
        <div class="row">
            <br><br>
        </div >
        <%@include file="model/footer.jsp" %>
        <script>
            function showMess(userID) {
                var option = confirm('Are you sure to delete this Account?');
                if (option === true) {
                    window.location.href = 'deleteAccount?UserID=' + userID;
                }
            }
        </script>
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
