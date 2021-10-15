<%-- 
    Document   : checkout
    Created on : Oct 14, 2021, 7:48:27 PM
    Author     : SAKURA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- icon -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/favicon.ico" type="image/x-icon">
    <!-- Google Fonts -->
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap"
      rel="stylesheet"
    />
	  <!--BOOTSTRAP5-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!--FONTAWESOME-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <!--CSS-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cart.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cartqueries.css">
    <title>Checkout</title>
  </head>

  <body>
    <%@include file="model/header.jsp" %>
    <!-- PROGRESS -->
    <section id="progress" style="background-color: whitesmoke;">
            <div class="row container-fluid justify-content-center text-center align-content-center m-0 p-0" style="height: 50px;">
                <div class="col-4 col-lg-2 ">
                    <div class="relative15px">
                        <strong>CART</strong> <br>
                        <span class="fas fa-check"></span>
                    </div>
                </div>
                <div class="col-4 col-lg-2">
                    <div class="relative15px">
                        <strong>CHECKOUT</strong> <br>
                        <span class="fas fa-check"></span>
                    </div>
                </div>
                <div class="col-4 col-lg-2">
                    <div class="relative15px">
                        <strong>FINISH</strong> <br> 
                    </div>
                </div>
            </div>
        <div class="progress">
            <div class="progress-bar progress-bar-striped progress-bar-animated bg-success" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 55%"></div>
        </div>
    </section>
    <div class="content-width m-auto">
        <table class="table table-light">
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col" colspan="2">Item</th>
                <th scope="col">Amount</th>
                <th scope="col">Price</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>Image</td>
                <td>Name</td>
                <td>
                    <div class="btn-group">
                        <span class="btn btn-light">42</span>
                    </div>
                </td>
                <td>Price</td>
              </tr>
            </tbody>
            <tfoot>
                <tr>
                    <th scope="row" colspan="4">Total</th>
                    <td>Total Price</td>
                  </tr>
            </tfoot>
          </table>
        <form>
            <div class="row container-fluid justify-content-center p-0 p-lg-5 m-0">
                <div class="col-12 col-lg-6 bg-white p-5">
                    <h6 class="display-6 mb-3">Shipping information</h6>
                    <div class="row g-3">
                        <div class="col-md-6">
                            <label for="inputName" class="form-label">Name</label>
                            <input type="text" class="form-control" id="inputName" disabled required>
                        </div>
                        <div class="col-md-6">
                            <label for="inputPhone" class="form-label">Phone</label>
                            <input type="tel" class="form-control" id="inputPhone" disabled required>
                        </div>
                        <div class="col-md-8">
                            <label for="inputAddress" class="form-label">Address</label>
                            <input type="text" class="form-control" id="inputAddress" disabled>
                        </div>
                        <div class="col-md-4">
                            <label for="inputCity" class="form-label">City</label>
                            <input type="text" class="form-control" id="inputCity" disabled>
                        </div>
                        <div class="col-12">
                            <label for="inputNote"  class="form-label">Note</label>
                            <input type="text" class="form-control" id="inputNote" disabled>
                        </div>
                    </div>
                </div>
                <div class="col-12 offset-lg-1 col-lg-3 p-0 mt-5 mt-lg-0">
                    <table class="table-light table">
                        <thead>
                            <tr>
                                <th scope="col">Bill</th>
                                <th scope="col">Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Product</td>
                                <td>Price</td>
                            </tr>
                            <tr>
                                <td>Shipping fees</td>
                                <td>Price</td>
                            </tr>
                            <tr>
                                <td>Sale</td>
                                <td>Price</td>
                            </tr>
                        </tbody>
                        <tfoot>
                            <tr>
                                <th scope="row">Total</th>
                                <td>Total Price</td>
                            </tr>
                        </tfoot>
                    </table>
                    <button type="submit" class="btn btn-success float-end">Place order</button>
                    <button type="button" class="btn btn-light float-end me-2">Back to cart</button>
                </div>       
            </div>
        </form>
    </div> 
    <%@include file="model/footer.jsp" %>
    <!-- BOOTSTRAP5-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <!-- SCRIPT -->
    <script src="${pageContext.request.contextPath}/js/script.js"></script>      
  </body>
</html>
