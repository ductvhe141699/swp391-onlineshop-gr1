<%-- 
    Document   : ManageBlog
    Created on : Oct 20, 2021, 12:45:34 AM
    Author     : Ottelia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- icon -->
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
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
        <title>Manage Blog</title>
        <style>
            .container{
                margin:50px;
            }
            table.table td a.delete {
                color: #F44336;
            }
            table.table td a.edit {
                color: #FFC107;
            }
            .btn btn-success{
                margin-right: 0px;
            }
        </style>

        <script>
            function ProductID(PID) {
                document.getElementById("pid").setAttribute("value", PID);
            }
            function ProductID2(PID) {
                document.getElementById("pid2").setAttribute("value", PID);
            }
            function search() {
                var searchText = document.getElementById("search_Manager").value;
                location.href = "searchInManager?text=" + searchText;
                return false;
            }
        </script>
    </head>
    <body style="font-family: 'Poppins',sans-serif">
        <%@include file="model/header.jsp" %>
        <div class="container">


            <div class="row">
                <div class="table-responsive">
                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                <div class="col-sm-10">
                                    <h2>Manage Blog</h2>
                                </div>
                                <div class="col-sm-2">
                                    <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Blog</span></a>
                                </div>
                            </div>
                        </div>

                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Author</th>
                                    <th>Title</th>
                                    <th>Image</th>
                                    <th>Content</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>

                                <c:forEach items="${blogList}" var="o">
                                    <tr>
                                        <td>${o.id}</td>
                                        <td>${o.author}</td>
                                        <td>${o.title}</td>
                                        <td><img src="./resources/img/Blog/${o.imageLink}" style="height: 100px"></td>
                                        <td>${o.content} </td>
                                        <td>
                                            <%--Link redirect to EditBlog page --%>
                                            <a href="UpdateBlog?BlogID=${o.id}" class="edit"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                            <a href="#deleteEmployeeModal" onclick="ProductID2(${o.id})" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>


                    </div>
                </div>        
            </div>
            <!-- Add Product -->
            <div id="addEmployeeModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="AddBlog" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Add Blog</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">	
                                <div class="form-group">
                                    <label>Author</label>
                                    <input type="text" class="form-control" required name="author">
                                </div>
                                <div class="form-group">
                                    <label>Title</label>
                                    <input type="text" class="form-control" required name="title">
                                </div>
                                <div class="form-group">
                                    <label>Content</label>
                                    <input type="text" class="form-control" required name="content">
                                </div>
                                <div class="form-group">
                                    <label>Image Link</label>
                                    <input type="text" class="form-control" required name="imageLink">
                                </div>
                                <div class="form-group">
                                    <label>Image </label>     
                                    <img src="./resources/img/products/${o.imageLink}" style="height: 100px">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                <input type="submit" class="btn btn-success" value="Add">
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <!-- Delete Blog -->
            <div id="deleteEmployeeModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="DeleteBlog" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Delete Blog</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">					
                                <p>Are you sure you want to delete this Blog?</p>
                                <p class="text-warning"><small>This action cannot be undone.</small></p>
                            </div>
                            <div class="modal-footer">
                                <input type="text" id="pid2" name="BlogID" visibility: hidden>
                                <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                <input type="submit" class="btn btn-danger" value="Delete">
                            </div>
                        </form>
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
