<%-- 
    Document   : PostList
    Created on : Oct 28, 2021, 4:26:59 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- icon -->
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
        <!-- link Fonts -->
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap"
            rel="stylesheet"
            />
        <!--BOOTSTRAP5-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <!--FONTAWESOME-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
            integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" type="text/css" href="./css/homepage.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post List</title>
        <!------ Include the above in your HEAD tag ---------->
        <link href="css/Postlist.css" rel="stylesheet" type="text/css"/>




        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


    </head>
    <body>

        <%@include file="model/header.jsp" %>
        <div class="container1">
            <div class="row1">
                <div class="col-md-4">
                    <div class="single-blog-item1">
                        <div class="blog-thumnail">
                            <a href=""><img src="https://cdn1.vectorstock.com/i/1000x1000/76/70/special-clothing-sale-social-media-post-design-vector-30327670.jpg" alt="blog-img"></a>
                        </div>
                        <div class="blog-content1">
                            <h4><a href="#">Description</a></h4>
                            <p>The Chanel sale begins Wednesday. Shoes and ready-to-wear are 40% off. .</p>
                            <div >June 03, 2015</div>
                           <div class="btngroup" >
                                <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                    <button type="button" class="btn btn-danger">Delete</button>
                                    <button type="button" class="btn btn-warning">Read More</button>
                                    <button type="button" class="btn btn-success">Hide</button>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

                <div class="col-md-4">
                    <div class="single-blog-item1">
                        <div class="blog-thumnail">
                            <a href=""><img src="https://lh3.googleusercontent.com/proxy/oP_73F_Zh5yiQiw4oqgZc55Y5y2veywOlObLWuVbB8DFSjIioOhxfuwVx9PHngzka3OJJCZTajqlMBy_sV03MfhGmdMYub8759vUGJosnhfx3xSiYnaqPMhjYuRq" alt="blog-img"></a>
                        </div>
                        <div class="blog-content1">
                            <h4><a href="#">Description</a></h4>
                            <p>When you know you need to work outside, come and buy clothes. </p>
                            <div >June 03, 2015</div>
                           <div class="btngroup" >
                                <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                    <button type="button" class="btn btn-danger">Delete</button>
                                    <button type="button" class="btn btn-warning">Read More</button>
                                    <button type="button" class="btn btn-success">Hide</button>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

                <div class="col-md-4">
                    <div class="single-blog-item1">
                        <div class="blog-thumnail">
                            <a href=""><img src="https://i.pinimg.com/originals/d2/87/b5/d287b5b4325d309acbeefff46fd09bff.png" alt="blog-img"></a>
                        </div>
                        <div class="blog-content1">
                            <h4><a href="#">Description</a></h4>
                            <p>Take up to 50% off all things home at the retailer’s Winter Clearance Sale..</p>
                            <div >June 03, 2015</div>
                            <div class="btngroup" >
                                <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                    <button type="button" class="btn btn-danger">Delete</button>
                                    <button type="button" class="btn btn-warning">Read More</button>
                                    <button type="button" class="btn btn-success">Hide</button>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>


            </div>
        </div>


    </body>
</html>
