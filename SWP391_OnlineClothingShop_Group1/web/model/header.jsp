<%-- 
    Document   : navbar
    Created on : Sep 27, 2021, 1:34:43 PM
    Author     : SAKURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%-- PROMO --%>
<%--
<div class="row m-0 p-0" style="background-color:lightgrey;">
    <span id="promo">
        <marquee behavior="scroll" direction="left">SPECIAL PROMO! 1 USB stick for every Laptop!</marquee>
    </span>
</div>
--%>
<%-- PROMO --%>
<%-- NAV --%>
<nav class="navbar navbar-expand-xl navbar-light "  style="z-index:100;height: 100px; background-color:#2bcbba;">
    <div class="container-fluid bg-light pb-3 pb-xl-0" style="z-index: 10;">
      <a class="navbar-brand" href="HomeServlet"><img style="height: 40px;" src="resource/img/logo.png"/></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="HomeServlet">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="ProductServlet?p=1&st=0&sm=0&c=0&b=0&search=">All product</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Category
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <c:forEach items="${categorys}" var="category">
                    <li><a class="dropdown-item" href="ProductServlet?p=1&st=0&sm=0&c=${category.getId()}&b=0&search=">${category.getIcon()}&nbsp;${category.getName()}</a></li>
                </c:forEach>
            </ul>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Brand
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <c:forEach items="${brands}" var="brand">
                    <li><a class="dropdown-item" href="ProductServlet?p=1&st=0&sm=0&c=0&b=${brand.getId()}&search=">${brand.getName()}</a></li>
                </c:forEach>
            </ul>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#footer">About us</a>
          </li>                    
        </ul>
        <form class="d-flex me-2 mb-3 mb-xl-0" method="get" action="ProductServlet">
            <input type="hidden" value="1" name="p"/>
            <input type="hidden" value="0" name="st"/>
            <input type="hidden" value="0" name="sm"/>
            <input type="hidden" value="0" name="c"/>
            <input type="hidden" value="0" name="b"/>
            <input class="form-control me-2 w-100" name="search" type="search" placeholder="Search" value="${search}" aria-label="Search" >
            <input type="submit" class="btn btn-outline-secondary" value="Search"/>
        </form>
        <i class="fas fa-user-circle me-2" style="font-size: 30px;color:grey;"></i>
        <span class="me-2">
            <c:if test="${user==null}">
                <a class="text-decoration-none" style="color:grey;" href="LoginServlet">Login/Register</a>
            </c:if>
            <c:if test="${user!=null}">
                <a class="text-decoration-none" style="color:grey;" href="AccountServlet?t=1&pb=1&po=1&pf=1&pp=1">Hello, ${user.getName()}</a>
            </c:if>
        </span>
        <a class="me-3" href="#" >
            <i style="font-size: 30px;color:grey;" class="fas fa-shopping-cart"></i>
            <span class="position-absolute bottom-50 start-99 translate-middle badge rounded-pill bg-danger">
                <c:if test="${cart==null}">
                    0
                </c:if>
                <c:if test="${cart!=null}">
                    ${cart.getTotalAmount()}
                </c:if>
                <span class="visually-hidden">Cart item</span>
            </span>
        </a>
      </div>
    </div>
</nav>
<%-- NAV --%>