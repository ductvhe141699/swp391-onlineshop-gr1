<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 
    Document   : Daskboard
    Created on : 12-10-2021, 21:59:57
    Author     : BEAN
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
            />
        <link rel="stylesheet" href="css/dataTables.bootstrap5.min.css" />
        <link rel="stylesheet" href="css/dashboard.css" />
        <title>Dashboard</title>
    </head>
    <body>
        <!-- top navigation bar -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container-fluid">
                <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="offcanvas"
                    data-bs-target="#sidebar"
                    aria-controls="offcanvasExample"
                    >
                    <span class="navbar-toggler-icon" data-bs-target="#sidebar"></span>
                </button>
                <a
                    class="navbar-brand me-auto ms-lg-0 ms-3 text-uppercase fw-bold"
                    href="#"
                    >SHOPE</a
                >
                <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#topNavBar"
                    aria-controls="topNavBar"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
                    >
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="topNavBar">
                    <form class="d-flex ms-auto my-3 my-lg-0">
                        <div class="input-group">
                            <input
                                class="form-control"
                                type="search"
                                placeholder="Search"
                                aria-label="Search"
                                />
                            <button class="btn btn-primary" type="submit">
                                <i class="bi bi-search"></i>
                            </button>
                        </div>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a
                                class="nav-link dropdown-toggle ms-2"
                                href="#"
                                role="button"
                                data-bs-toggle="dropdown"
                                aria-expanded="false"
                                >
                                <i class="bi bi-person-fill"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-end">
                                <li><a class="dropdown-item" href="#">Logout</a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- top navigation bar -->
        <!-- offcanvas -->
        <div
            class="offcanvas offcanvas-start sidebar-nav bg-dark"
            tabindex="-1"
            id="sidebar"
            >
            <div class="offcanvas-body p-0">
                <nav class="navbar-dark">
                    <ul class="navbar-nav">
                        <li>
                            <div class="text-muted small fw-bold text-uppercase px-3">
                                CORE
                            </div>
                        </li>
                        <li>
                            <a href="#" class="nav-link px-3 active">
                                <span class="me-2"><i class="bi bi-speedometer2"></i></span>
                                <span>Home</span>
                            </a>
                        </li>
                        <li class="my-4"><hr class="dropdown-divider bg-light" /></li>
                        <li>
                            <div class="text-muted small fw-bold text-uppercase px-3 mb-3">
                                Interface
                            </div>
                        </li>
                        <li>
                            <a
                                class="nav-link px-3 sidebar-link"
                                data-bs-toggle="collapse"
                                href="#layouts"
                                >
                                <span class="me-2"><i class="bi bi-layout-split"></i></span>
                                <span>Mange Blog</span>
                                <span class="ms-auto">

                                </span>
                            </a>

                        </li>
                        <li>
                            <a href="#" class="nav-link px-3">
                                <span class="me-2"><i class="bi bi-book-fill"></i></span>
                                <span>Manage Account</span>
                            </a>
                        </li>

                        <li>
                            <div class="text-muted small fw-bold text-uppercase px-3 mb-3">

                            </div>
                        </li>

                        <li>
                            <a href="manager" class="nav-link px-3">
                                <span class="me-2"><i class="bi bi-table"></i></span>
                                <span>Manage Product</span>
                            </a>
                        </li>

                        <li>
                            <a href="ManagerOrder" class="nav-link px-3">
                                <span class="me-2"><i class="bi bi-table"></i></span>
                                <span>Manager Order</span>
                            </a>
                        </li>
                         <li>
                            <a href="PostList.jsp" class="nav-link px-3">
                                <span class="me-2"><i class="bi bi-book-fill"></i></span>
                                <span>Manage Post</span>
                            </a>
                        </li>
                        <li class="my-4"><hr class="dropdown-divider bg-light" /></li>

                    </ul>
                </nav>
            </div>
        </div>
        <!-- offcanvas -->
        <main class="mt-5 pt-3">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <h4>Dashboard</h4>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3">
                        <div class="card bg-primary text-white h-100">
                            <div class="card-body py-5">Total Customer : ${totalCus}</div>

                        </div>
                    </div>
                    <div class="col-md-4 mb-3">
                        <div class="card bg-warning text-dark h-100">
                            <div class="card-body py-5">Total Product : ${totalPro}</div>

                        </div>
                    </div>

                    <div class="col-md-4 mb-3">
                        <div class="card bg-danger text-white h-100">
                            <div class="card-body py-5">Total Order : ${totalOrders}</div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 mb-3">
                        <div class="card">
                            <div class="card-header">
                                <span><i class="bi bi-table me-2"></i></span> Order Dashboard
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table id="example"  class="table table-striped data-table"  style="width: 100%">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Product Name</th>
                                                <th>Product price</th>
                                                <th>Status</th>
                                                <th>Date</th>>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="o" items="${listOrder}">
                                                <tr>
                                                    <td>${o.id}</td>
                                                    <td>${o.productName}</td>
                                                    <td>${o.productPrice}</td>
                                                    <c:if test="${o.status == 1}">
                                                        <td><span class="badge rounded-pill bg-secondary">Waiting for Confirmation</span></td>
                                                    </c:if> 
                                                         <c:if test="${o.status == 2}">
                                                        <td><span class="badge rounded-pill bg-warning text-dark">Packing</span></td>
                                                    </c:if> 
                                                         <c:if test="${o.status == 3}">
                                                        <td><span class="badge rounded-pill bg-primary">Delivering</span></td>
                                                    </c:if> 
                                                         <c:if test="${o.status == 4}">
                                                        <td><span class="badge bg-danger">Canceled</span></td>
                                                    </c:if> 
                                                         <c:if test="${o.status == 5}">
                                                        <td><span class="badge bg-success">completed</span></td>
                                                    </c:if> 
                                                    <td>${o.date}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>



                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <script src="./js/bootstrap.bundle.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js@3.0.2/dist/chart.min.js"></script>
        <script src="./js/jquery-3.5.1.js"></script>
        <script src="./js/jquery.dataTables.min.js"></script>
        <script src="./js/dataTables.bootstrap5.min.js"></script>
        <script src="./js/script1.js"></script>
    </body>
</html>
