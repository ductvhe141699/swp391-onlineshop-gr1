<%-- 
    Document   : navbar
    Created on : Sep 27, 2021, 1:34:43 PM
    Author     : SAKURA
--%>
<%@page import="entity.SubCategory"%>
<%@page import="DBContext.SubCategoryDAO"%>
<%@page import="entity.Category"%>
<%@page import="entity.Brand"%>
<%@page import="DBContext.BrandDAO"%>
<%@page import="java.util.List"%>
<%@page import="DBContext.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %> 
<!DOCTYPE html>
<%
    CategoryDAO cdao = new CategoryDAO();
        List<Category> categorys = cdao.getAllCategory();
        pageContext.setAttribute("categorys", categorys);
        BrandDAO bdao= new BrandDAO();
        List<Brand> brands = bdao.getAllBrand();
        pageContext.setAttribute("brands", brands);
        SubCategoryDAO scdao = new SubCategoryDAO();
        List<SubCategory> subcategorys = scdao.getAllSubCategory();
        pageContext.setAttribute("subcategorys", subcategorys);
%>
<div class="row m-0 p-0" style="background-color:lightgrey;">
    <span id="promo" class="d-lg-block d-none">
          <marquee behavior="scroll" direction="left">Get 10% SALE by using special discount code "CHEERSLUV"</marquee>
      </span>
    </div>
    <nav class="navbar main-navbar navbar-expand-lg navbar-light bg-light" id="navbar1">
        
        <div class="container-fluid">
            <!-- LOGO -->
            <a class="navbar-brand col-lg-2 offset-lg-2 logo" href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/resources/img/SHOPE-logos_transparent.png"> </a>
            
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <!-- SEARCHBAR -->
            <form class="d-flex searchbar" method="get" action="${pageContext.request.contextPath}/product">
              <input type="hidden" name="page" value="1"/>
              <input name="query" class="form-control me-2" type="search" placeholder="Search entire store here..." aria-label="Search">
              <input type="hidden" name="subcategory" value="0"/>
              <input type="hidden" name="brand" value="0"/>
              <input type="hidden" name="price" value="0"/>
              <input type="hidden" name="sortType" value="0"/>
              <input type="hidden" name="sortMode" value="0"/>
              <button class="btn btn-danger" type="submit"><i class="fas fa-search" style="font-size: 100%;"></i></button>
            </form>
            <ul class="navbar-nav me-auto ms-auto">                
              <!-- EXPANDED -->
              <li class="nav-item d-none d-lg-block">
                  <a class="nav-link" href="#"><i class="fas fa-bell"></i>
                     <c:if test="${sessionScope.user !=null}">
                        <span class="position-relative translate-middle badge rounded-pill bg-danger">
                          0
                          <span class="visually-hidden">unread notifications</span>
                        </span>
                    </c:if>
                  </a> 
              </li>
              <li class="nav-item d-none d-lg-block">
                  <a class="nav-link" href="${pageContext.request.contextPath}/user/cart">
                    <i class="fas fa-shopping-cart"></i>
                    <c:if test="${sessionScope.user !=null}">
                        <span class="position-relative translate-middle badge rounded-pill bg-danger">
                          0
                          <span class="visually-hidden">cart items</span>
                          </span>
                    </c:if>
                  </a>
              </li>
              <li class="nav-item dropdown d-none d-lg-block">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  <i class="fas fa-user-circle"></i>
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <c:if test ="${sessionScope.user !=  null}">
                        <li><span class="dropdown-item-text">Hello ${user.getUserName()}</span></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/logout">Logout</a></li>
                    </c:if>
                    <c:if test ="${sessionScope.user ==  null}">
                       <li><a class="dropdown-item" href="${pageContext.request.contextPath}/login">Login/Register</a></li>
                    </c:if>
                </ul>
              </li>
              <!-- COLLAPSED -->
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/home">Home</a>
              </li>
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0">Product</a>
              </li>
              <li class="nav-item dropdown d-block d-lg-none">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Category
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                   <c:forEach items="${categorys}" var="icategory">
                    <li><h6 class="dropdown-header">${icategory.getCategoryName()}</h6></li>
                    <c:forEach items="${subcategorys}" var="isubcategory"><c:if test="${isubcategory.getCateID()==icategory.getCategoryID()}"><li><a class="dropdown-item" href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=${isubcategory.getSubCateID()}&brand=0&price=0&sortType=0&sortMode=0">${isubcategory.getSubCateName()}</a></li></c:if></c:forEach>
                  </c:forEach>
                </ul>
              </li>
              <li class="nav-item dropdown d-block d-lg-none">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Brand
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <c:forEach items="${brands}" var="ibrand">
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=0&brand=${ibrand.getBrandID()}&price=0&sortType=0&sortMode=0">${ibrand.getBrandName()}</a></li>
                    </c:forEach>
                </ul>
              </li>
              <li class="nav-item dropdown d-block d-lg-none">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Blog
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="${pageContext.request.contextPath}/BlogList">All blog</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Spotlight</a></li>
                  <li><a class="dropdown-item" href="#">Spotlight</a></li>
                </ul>
              </li>
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link" href="#footer">Contacts Us</a>
              </li>
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link d-inline-block" href="#"><i class="fas fa-bell"></i>
                    <c:if test="${sessionScope.user !=null}">
                    <span class="position-relative translate-middle badge rounded-pill bg-dark">
                      0
                      <span class="visually-hidden">unread notifications</span>
                    </span>
                  </c:if>
                </a> 
                <a class="nav-link d-inline-block" href="${pageContext.request.contextPath}/user/cart">
                  <i class="fas fa-shopping-cart"></i>
                  <c:if test="${sessionScope.user !=null}">
                    <span class="position-relative translate-middle badge rounded-pill bg-danger">
                      0
                      <span class="visually-hidden">cart items</span>
                      </span>
                  </c:if>
                </a>
                <i class="fas fa-user-circle"></i>
              </li>
              <c:if test ="${sessionScope.user !=  null}">
                <li class="nav-item d-block d-lg-none">Hello ${user.getUserName()}</li>
                <li class="nav-item d-block d-lg-none">
                    <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                </li>
              </c:if>
              <c:if test ="${sessionScope.user ==  null}">
                <li class="nav-item d-block d-lg-none">
                    <a class="nav-link" href="${pageContext.request.contextPath}/login">Login/Register</a>
                </li>
               </c:if>
            </ul>
          </div>
        </div>
      </nav>
      <!-- SECONDARY NAVBAR -->
      <nav id="navbar2" class="navbar navbar-expand-lg navbar-dark bg-dark d-none d-lg-block">
        <div class="container-fluid">
          <ul class="navbar-nav offset-2 me-auto mb-2 mb-lg-0">
            <li class="nav-item me-4">
              <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/home">Home</a>
            </li>
            <li class="nav-item me-4">
              <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0">Product</a>
            </li>
            <li class="nav-item dropdown me-4">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Category
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <c:forEach items="${categorys}" var="icategory">
                    <li><h6 class="dropdown-header">${icategory.getCategoryName()}</h6></li>
                    <c:forEach items="${subcategorys}" var="isubcategory">
                        <c:if test="${isubcategory.getCateID()==icategory.getCategoryID()}">
                            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=${isubcategory.getSubCateID()}&brand=0&price=0&sortType=0&sortMode=0">${isubcategory.getSubCateName()}</a></li>
                        </c:if>
                    </c:forEach>
                  </c:forEach>
               </ul>
            </li>
            <li class="nav-item dropdown me-4">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Brand
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <c:forEach items="${brands}" var="ibrand">
                    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/product?page=1&query=&subcategory=0&brand=${ibrand.getBrandID()}&price=0&sortType=0&sortMode=0">${ibrand.getBrandName()}</a></li>
                </c:forEach>
              </ul>
            </li>
            <li class="nav-item dropdown me-4">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Blog
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/BlogList">All blog</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Spotlight</a></li>
                <li><a class="dropdown-item" href="#">Spotlight</a></li>
              </ul>
            </li>
            <li class="nav-item me-4">
              <a class="nav-link" href="#footer">Contacts Us</a>
            </li>
          </ul>
        </div>
      </nav>
<%-- NAV --%>
<%-- Top Btn --%>
<button onclick="topFunction()" id="myTBTN" title="Go to top"><i class="fas fa-arrow-up"></i></button>