<%-- 
    Document   : ViewOrdersHistory
    Created on : Oct 12, 2021, 1:20:04 PM
    Author     : LAMDTHE153097
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SHOPE</title>
        <!--Boostrap-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <!--Font-->
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <!--Fontawesome-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <!--CSS-->
        <link href="css/order.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <!--ICON-->
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <div class="container mt-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-10">
                    <div class="rounded">
                        <div class="table-responsive table-borderless">

                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Order #</th>
                                        <th>status</th>
                                        <th>Total</th>
                                        <th>Created</th>
                                        <th>Order Information</th>
                                    </tr>
                                </thead>
                                <tbody class="table-body">
                                    <c:forEach var="o" items="${orders}">
                                        <tr class="cell-1">
                                            <td>${o.id}</td>
                                            <td><span class="badge badge-success">${o.status}</span></td>
                                            <td>${o.totalPrice}</td>
                                            <td>${o.date}</td>
                                            <td><a href="ViewOrderDetails?id=${o.id}" style="cursor: pointer ">View</a></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                           <!--<tbody class="table-body">
                                    <tr class="cell-1">
                                        <td>#SO-13487</td>
                                        <td><span class="badge badge-success">Fullfilled</span></td>
                                        <td>$2674.00</td>
                                        <td>Today</td>
                                        <td><a href="ViewOrderDetails.jsp" style="cursor: pointer ">View</a></td>
                                    </tr>
                                    <tr class="cell-1">
                                        <td>#SO-13453</td>
                                        <td><span class="badge badge-info">Confirmed</span></td>
                                        <td>$3454.00</td>
                                        <td>Yesterday</td>
                                        <td><a href="ViewOrderDetails.jsp" style="cursor: pointer ">View</a></td>
                                    </tr>
                                    <tr class="cell-1">
                                        <td>#SO-13498</td>
                                        <td><span class="badge badge-danger">Partially shipped</span></td>
                                        <td>$6274.00</td>
                                        <td>May 12,2020</td>
                                        <td><a href="ViewOrderDetails.jsp" style="cursor: pointer ">View</a></td>
                                    </tr>
                                    <tr class="cell-1">
                                        <td>#SO-16499</td>
                                        <td><span class="badge badge-success">Fullfilled</span></td>
                                        <td>$6375.00</td>
                                        <td>May 11,2020</td>
                                        <td><a href="ViewOrderDetails.jsp" style="cursor: pointer ">View</a></td>
                                    </tr>
                                </tbody>-->
                            </table>

                        </div>
                    </div>
                </div>
            </div>
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
