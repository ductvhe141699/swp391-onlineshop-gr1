<%-- 
    Document   : SidebarMarketing
    Created on : 5/11/2021
    Author     : SAKURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <nav id="sidebar">
            <div id="dismiss">
                <i class="bi bi-arrow-left"></i>
            </div>

            <div class="sidebar-header">
                <h3>Shope</h3>
            </div>

            <ul class="list-unstyled components">
                <p>Marketing</p>
                <li>
                    <a href="home">Home
                        <i class="bi bi-house float-end"></i>
                    </a>

                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/mtk/ManagerBanner">Manager Banner <i class="fab fa-adversal"></i></a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
                <li><a href="${pageContext.request.contextPath}/logout" class="download">Log out</a></li>
            </ul>
        </nav>