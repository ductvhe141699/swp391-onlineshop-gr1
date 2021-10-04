<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
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
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/queries.css" />
        <title>Home Page</title>
    </head>
    <body style="min-height: 2000px">
        <%@include file="model/header.jsp" %>

        <!-- SLIDER -->
        <section class="slider">
            <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                            aria-current="true" aria-label="Nike"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                            aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                            aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="./resources/img/banner/nike.png" class="d-block w-100" alt="..." />
                        <div class="carousel-caption d-none d-md-block">
                            <h5>First slide label</h5>
                            <p>
                                Some representative placeholder content for the first slide.
                            </p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="./resources/img/banner/gucci.png" class="d-block w-100" alt="..." />
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Second slide label</h5>
                            <p>
                                Some representative placeholder content for the second slide.
                            </p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="./resources/img/banner/chanel.jpg" class="d-block w-100" alt="..." />
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Third slide label</h5>
                            <p>
                                Some representative placeholder content for the third slide.
                            </p>
                        </div>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                        data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                        data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </section>
        <!-- Categories -->

        <section class="categories">
            <div class="title text-center">
                <h4>Category</h4>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 p-0">
                        <div class="categories_item categories_large_item">
                            <img src="./resources/img/Categories/category-1.jpg" alt="" class="img-fluid">
                            <div class="categories_text">
                                <h1> fashion</h1>
                                <p>BEAN</p>
                                <a href="#">Buy now</a>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6">
                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-12 p-0">
                                <div class="categories_item">
                                    <img src="./resources/img/Categories/category-2.jpg" alt="" class="img-fluid">
                                    <div class="categories_text">
                                        <h4> fashion</h4>
                                        <p>358 items</p>
                                        <a href="#">Buy now</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-12 p-0">
                                <div class="categories_item">
                                    <img src="./resources/img/Categories/category-2.jpg" alt="" class="img-fluid">
                                    <div class="categories_text">
                                        <h4> fashion</h4>
                                        <p>358 items</p>
                                        <a href="#">Buy now</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-12 p-0">
                                <div class="categories_item">
                                    <img src="./resources/img/Categories/category-1.jpg" alt="" class="img-fluid">
                                    <div class="categories_text">
                                        <h4> fashion</h4>
                                        <p>358 items</p>
                                        <a href="#">Buy now</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-12 p-0">
                                <div class="categories_item">
                                    <img src="./resources/img/Categories/category-2.jpg" alt="" class="img-fluid">
                                    <div class="categories_text">
                                        <h4> fashion</h4>
                                        <p>358 items</p>
                                        <a href="#">Buy now</a>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    </section>

                    <!-- Product -->
                    <section class="product ">
                        <div class="container">
                            <div class="row">

                                <div class="title text-center">
                                    <h4>New Product</h4>
                                </div>
                            </div>
                            <div class="row property_gallery">

                                <c:forEach var="o" items="${listProduct}">
                                    <div class="col-lg-3 col-md-4 col-sm-6">
                                        <div class="product_item">
                                            <div class="product_item_pic">
                                                <img src="${o.url}" alt="">
                                                <ul class="product_hover">
                                                    <li><a href="#"><i class="fa fa-arrows-alt"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-shopping-bag"></i></a></li>
                                                </ul>
                                            </div>
                                            <div class="product_item_text">
                                                <h6><a href="#">${o.productName}</a></h6>
                                                <div class="rating">
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                </div>
                                                <div class="product_price">$ ${o.sellPrice}</div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>

                        </div>
                </div>

            </div>
        </div>
    </section>

    <!-- Discount -->
    <section class="discount">
        <div class="container">
            <div class="col-lg-12 discount-bg text-center">
                <div class="discount-text">
                    <span>Discount</span>
                    <h2>Fall Sales</h2>
                    <h3>Sale 60% OFF</h3>
                    <a href="#">Buy now</a>
                </div>
            </div>
        </div>
    </section>

    <section class="brand mt-3 text-center">
        <div class="title text-center">
            <h4>Brands</h4>
        </div>
        <div class="container">
            <div class="d-flex justify-content-between align-items-center flex-wrap">

                <div class="col ">
                    <img src="./resources/img/Brands/nike.png">
                </div>
                <div class="col">
                    <img src="./resources/img/Brands/dickies.png">
                </div>

                <div class="col">
                    <img src="./resources/img/Brands/h&m.png">
                </div>

                <div class="col">
                    <img src="./resources/img/Brands/champions.png">
                </div>
                <div class="col">
                    <img src="./resources/img/Brands/chanel.png">
                </div>
            </div>
        </div>
    </section>

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
