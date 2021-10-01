<%-- 
    Document   : footer
    Created on : Sep 27, 2021, 1:36:14 PM
    Author     : SAKURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- FOOTER --%>
<footer class="text-center text-lg-start bg-dark text-white pt-4" id="footer">
    <div class="container text-center text-md-start">
      <div class="row">
        <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
          <h6 class="text-uppercase fw-bold mb-4"><i class="fas fa-gem me-3"></i>HTSHOP</h6>
          <figure class="text-center">
            <blockquote class="blockquote">
              <p>We provide top-notch quality product with a great price.</p>
            </blockquote>
            <figcaption class="blockquote-footer">
              Placeholder <cite title="Source Title">HTCorp. CEO</cite>
            </figcaption>
          </figure>
        </div>
        <div class="col-md-5 col-lg-4 col-xl-4 mx-auto mb-4">
          <h6 class="text-uppercase fw-bold mb-4">
            <i class="fas fa-comment-alt me-3"></i>Feedback
          </h6>
            <form action="AddFeedbackServlet" method="post">
            <div class="mb-3">
              <label for="name" class="form-label">Name</label>
              <input type="text" class="form-control" id="name" name="feedback_name" placeholder="Name">
            </div>
            <div class="mb-3">
              <label for="feedback" class="form-label">Feedback</label>
              <textarea class="form-control" id="feedback" maxlength="255" name="feedback_content" rows="3"></textarea>
            </div>
            <input type="submit" value="Send"/>
          </form>
        </div>

        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
          <h6 class="text-uppercase fw-bold mb-4">
            <i class="fas fa-address-book me-3"></i>Contact
          </h6>
          <p><i class="fas fa-home me-3"></i>Km29 Đại lộ Thăng Long, huyện Thạch Thất, Hà Nội</p>
          <p><i class="fas fa-envelope me-3"></i>htshop@gmail.com</p>
          <p><i class="fas fa-phone me-3"></i> +84 123456789</p>
          <p><i class="fas fa-print me-3"></i> +84 123456789</p>
        </div>
      </div>
    </div>
</footer>
<%-- FOOTER --%>