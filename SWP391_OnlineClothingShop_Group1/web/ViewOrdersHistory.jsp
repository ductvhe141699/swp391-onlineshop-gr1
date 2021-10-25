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
        <title>SHOPE</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/OrderTableStyle.css" rel="stylesheet" type="text/css"/> 
        <!--<link rel="icon" type="image/png" href="image/faviconLogo.png" />-->
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <style>

        </style>
        <%@include file="model/header.jsp" %>
        <div class="container mt-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-10">
                    <div class="rounded">
                        <div class="table-responsive table-borderless">
                            <table class="table">
                                <thead>
                                    <tr>
<!--                                        <th class="text-center">
                                            <div class="toggle-btn">
                                                <div class="inner-circle"></div>
                                            </div>
                                        </th>-->
                                        <th>Order #</th>
                                        <th>Company name</th>
                                        <th>status</th>
                                        <th>Total</th>
                                        <th>Created</th>
                                        <th>Order Information</th>
                                    </tr>
                                </thead>
                                <tbody class="table-body">
                                    
                                    <tr class="cell-1">
<!--                                        <td class="text-center">
                                            <div class="toggle-btn">
                                                <div class="inner-circle"></div>
                                            </div>
                                        </td>-->
                                        <td>#SO-13487</td>
                                        <td>Gasper Antunes</td>
                                        <td><span class="badge badge-success">Fullfilled</span></td>
                                        <td>$2674.00</td>
                                        <td>Today</td>
                                        <td><i class="fa fa-ellipsis-h text-black-50"></i></td>
                                    </tr>
                                    <tr class="cell-1">
                                        <td class="text-center">
                                            <div class="toggle-btn">
                                                <div class="inner-circle"></div>
                                            </div>
                                        </td>
                                        <td>#SO-13453</td>
                                        <td>Aartsen van</td>
                                        <td><span class="badge badge-info">Confirmed</span></td>
                                        <td>$3454.00</td>
                                        <td>Yesterday</td>
                                        <td><i class="fa fa-ellipsis-h text-black-50"></i></td>
                                    </tr>
                                    <tr class="cell-1">
                                        <td class="text-center">
                                            <div class="toggle-btn">
                                                <div class="inner-circle"></div>
                                            </div>
                                        </td>
                                        <td>#SO-13498</td>
                                        <td>Trashes Habard</td>
                                        <td><span class="badge badge-danger">Partially shipped</span></td>
                                        <td>$6274.00</td>
                                        <td>May 12,2020</td>
                                        <td><i class="fa fa-ellipsis-h text-black-50"></i></td>
                                    </tr>
                                    <tr class="cell-1">
                                        <td class="text-center">
                                            <div class="toggle-btn">
                                                <div class="inner-circle"></div>
                                            </div>
                                        </td>
                                        <td>#SO-16499</td>
                                        <td>Samban Hubart</td>
                                        <td><span class="badge badge-success">Fullfilled</span></td>
                                        <td>$6375.00</td>
                                        <td>May 11,2020</td>
                                        <td><i class="fa fa-ellipsis-h text-black-50"></i></td>
                                    </tr>
                                </tbody>
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
        <script>
            $(document).ready(function () {

                $('.toggle-btn').click(function () {
                    $(this).toggleClass('active').siblings().removeClass('active');
                });

            });
        </script>
    </body>
</html>
