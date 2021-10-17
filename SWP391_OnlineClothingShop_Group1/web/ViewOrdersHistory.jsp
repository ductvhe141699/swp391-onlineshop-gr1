<%-- 
    Document   : ViewOrdersHistory
    Created on : Oct 12, 2021, 1:20:04 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>My Order</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">;
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/OrderTableStyle.css" rel="stylesheet" type="text/css"/> 
        <!--<link rel="icon" type="image/png" href="image/faviconLogo.png" />-->
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" type="text/css" href="./css/homepage.css" /> 
    </head>
    <body>
        <%@include file="model/header.jsp" %>
        <br>
         <div class="col-6">
                        <div class="col-md-4">
                            <img src="resources/invoice.jpg" alt="..." width="100%" style="margin-top: 0px;">
                        </div>
            </div>
            <hr>
            <div class="row col-12">
                <style>
                    td{
                        padding-right:3em;
                        padding:10px; border: 1px solid;
                    }
                    
                </style>
                <table id="customers" style="margin-left:3em; border: 1px solid;text-align: center">
                    <thead >
                        <tr >
                            <th>Order ID</th>
                            <th>Total Price</th>
                            <th>Note</th>
                            <th>Status  </th>
                            <th>Day Buy</th>
                            <th>Order Information</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${orders}" varStatus="x">
                            <tr style="padding:2px; border: 1px solid">
                                <td>${item.id}</td>
                                <td>
                                    <fmt:formatNumber type = "number" maxFractionDigits = "1" value = "${item.totalPrice}"/>VNĐ
                                </td>
                                <td>${item.note}</td>
                                <td>${item.status}</td>
                                <td>${item.date}</td>
                                <td><a  style="cursor: pointer ">View</a></td>

                        <c:set var="total" value="${total + item.totalPrice}" />
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

                </br>
                </hr>
                <br>
                <h3 style="color:red;">Total:                                        
                    <fmt:formatNumber type = "number" maxFractionDigits = "1" value = "${total}"/> 
                    VNĐ</h3>
            </div>
        </div>
         <a href="ProfileControl" id="back">Back to My Profile</a>
         <br>
         <br>
         <%@include file="model/footer.jsp" %>
    </body>
</html>
