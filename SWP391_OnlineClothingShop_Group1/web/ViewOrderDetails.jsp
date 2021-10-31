<%-- 
    Document   : ViewOrderDetails
    Created on : Oct 28, 2021, 1:34:14 PM
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
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/orderdetails.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    </head>
    <body>
        <%@include file="model/header.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-body text-center">
                            <h5 class="card-title m-b-0">Order ID: #OR898 </h5>
                        </div>
                        <div class="table-responsive">
                            <table class="table">
                                <thead class="thead-light">
                                    <tr>
                                        <th> <label class="customcheckbox m-b-20"> <input type="checkbox" id="mainCheckbox" disabled><span class="checkmark"></span> </label> </th>
                                        <th scope="col">Product ID</th>
                                        <th scope="col">Product Name</th>
                                        <th scope="col">Image</th>
                                        <th scope="col">Price</th>
                                    </tr>
                                </thead>
                                <tbody class="customtable">
                                    <tr>
                                        <th> <label class="customcheckbox"> <input type="checkbox" class="listCheckbox" checked> <span class="checkmark"></span> </label> </th>
                                        <td>#PD002</td>
                                        <td>Nike</td>
                                        <td><img onmouseover="bigImg(this)" onmouseout="normalImg(this)"  
                                                 src="./resources/img/Categories/categories-5.png" alt="" style="width: 100px; height: 100px"></td>
                                        <td>76$</td>
                                    </tr>
                                    <tr>
                                        <th> <label class="customcheckbox"> <input type="checkbox" class="listCheckbox" disabled> <span class="checkmark"></span> </label> </th>
                                        <td>#PD016</td>
                                        <td>ZABA</td>
                                        <td><img src="./resources/img/Categories/categories-5.png" alt="" style="width: 100px; height: 100px"></td>
                                        <td>10$</td>
                                    </tr>
                                    <tr>
                                        <th> <label class="customcheckbox"> <input type="checkbox" class="listCheckbox" disabled> <span class="checkmark"></span> </label> </th>
                                        <td>#PD05</td>
                                        <td>Safari</td>
                                        <td><img src="./resources/img/Categories/categories-5.png" alt="" style="width: 100px; height: 100px"></td>
                                        <td>16$</td>
                                    </tr>
                                    <tr>
                                        <th> <label class="customcheckbox"> <input type="checkbox" class="listCheckbox" checked> <span class="checkmark"></span> </label> </th>
                                        <td>#PD08</td>
                                        <td>Google Chrome</td>
                                        <td><img src="./resources/img/Categories/categories-5.png" alt="" style="width: 100px; height: 100px"></td>
                                        <td>76.12$</td>
                                    </tr>
                                    <tr>
                                        <th> <label class="customcheckbox"> <input type="checkbox" class="listCheckbox" disabled> <span class="checkmark"></span> </label> </th>
                                        <td>#PD07</td>
                                        <td>Internet Explorer</td>
                                        <td><img src="./resources/img/Categories/categories-5.png" alt="" style="width: 100px; height: 100px"></td>
                                        <td>10$</td>
                                    </tr>
                                    <tr>
                                        <th> <label class="customcheckbox"> <input type="checkbox" class="listCheckbox" checked> <span class="checkmark"></span> </label> </th>
                                        <td>#PD08</td>
                                        <td>Internet Explorer 8</td>
                                        <td><img src="./resources/img/Categories/categories-5.png" alt="" style="width: 100px; height: 100px"></td>
                                        <td>8$</td>
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
<!--        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
        ></script>
         SCRIPT 
        <script src="${pageContext.request.contextPath}/js/script.js"></script>-->
        <script>
                                            function bigImg(x) {
                                                x.style.height = "500px";
                                                x.style.width = "500px";
                                            }

                                            function normalImg(x) {
                                                x.style.height = "100px";
                                                x.style.width = "100px";
                                            }
        </script>
    </body>
</html>
