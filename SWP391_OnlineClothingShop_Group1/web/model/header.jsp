<%-- 
    Document   : navbar
    Created on : Sep 27, 2021, 1:34:43 PM
    Author     : SAKURA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<div class="row m-0 p-0" style="background-color:lightgrey;">
      <span id="promo">
          <marquee behavior="scroll" direction="left">BLACK FRIDAY! SALE 0%</marquee>
      </span>
    </div>
    <nav class="navbar main-navbar navbar-expand-lg navbar-light bg-light ">
        
        <div class="container-fluid">
            <!-- LOGO -->
            <a class="navbar-brand col-lg-2 offset-lg-2 logo" href="#"><img src="resources/img/SHOPE-logos_transparent.png"> </a>
            
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <!-- SEARCHBAR -->
            <form class="d-flex searchbar">
              <input class="form-control me-2" type="search" placeholder="Search entire store here..." aria-label="Search">
              <button class="btn btn-danger" type="submit"><i class="fas fa-search" style="font-size: 100%;"></i></button>
            </form>
            <ul class="navbar-nav me-auto ms-auto">                
              <!-- EXPANDED -->
              <li class="nav-item d-none d-lg-block">
                  <a class="nav-link" href="#"><i class="fas fa-bell"></i>
                    <span class="position-relative translate-middle badge rounded-pill bg-danger">
                      0
                      <span class="visually-hidden">unread notifications</span>
                    </span>
                  </a> 
              </li>
              <li class="nav-item d-none d-lg-block">
                  <a class="nav-link" href="#">
                    <i class="fas fa-shopping-cart"></i>
                    <span class="position-relative translate-middle badge rounded-pill bg-danger">
                      0
                      <span class="visually-hidden">cart items</span>
                  </span>
                  </a>
              </li>
              <li class="nav-item dropdown d-none d-lg-block">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  <i class="fas fa-user-circle"></i>
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <!-- COLLAPSED -->
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item dropdown d-block d-lg-none">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Shop
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item dropdown d-block d-lg-none">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Blog
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item dropdown d-block d-lg-none">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Pages
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link" href="#">About Us</a>
              </li>
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link" href="#footer">Contacts Us</a>
              </li>
              <li class="nav-item d-block d-lg-none">
                <a class="nav-link d-inline-block" href="#"><i class="fas fa-bell"></i>
                  <span class="position-relative translate-middle badge rounded-pill bg-dark">
                    0
                    <span class="visually-hidden">unread notifications</span>
                  </span>
                </a> 
                <a class="nav-link d-inline-block" href="#">
                  <i class="fas fa-shopping-cart"></i>
                  <span class="position-relative translate-middle badge rounded-pill bg-dark">
                    0
                    <span class="visually-hidden">cart items</span>
                </span>
                </a>
                <i class="fas fa-user-circle"></i>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- SECONDARY NAVBAR -->
      <nav id="navbar2" class="navbar navbar-expand-lg navbar-dark bg-dark d-none d-lg-block">
        <div class="container-fluid">
          <ul class="navbar-nav offset-2 me-auto mb-2 mb-lg-0">
            <li class="nav-item me-4">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
            <li class="nav-item dropdown me-4">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Shop
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown me-4">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Blog
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown me-4">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Pages
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
              </ul>
            </li>
            <li class="nav-item me-4">
              <a class="nav-link" href="#">About Us</a>
            </li>
            <li class="nav-item me-4">
              <a class="nav-link" href="#footer">Contacts Us</a>
            </li>
          </ul>
        </div>
      </nav>
<%-- NAV --%>