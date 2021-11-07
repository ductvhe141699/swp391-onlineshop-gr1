package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutShope_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/AboutShope.css\" rel=\"stylesheet\" type=\"text/css\"/>      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">\n");
      out.write("                <img class=\"logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/SHOPE-logos_transparent.png\" alt=\"logo\"></a>\n");
      out.write("            <ul class=\"main-nav\">\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0\">\n");
      out.write("                    </a>Product</a></li>\n");
      out.write("                <li><a href=\"Recruitment.jsp\"></a>Recruitment</a></li>\n");
      out.write("                <li><a href=\"#part-1\"></a>Contact us</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 class=\"heading-main-text\">Vietnamese people use Vietnamese goods.<br>So join with us</h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <footer class=\"text-white text-center text-lg-start\" style=\"background-color: #23242a;\" id=\"part-1\">\n");
      out.write("            <!-- Section: Social media -->\n");
      out.write("            <section\n");
      out.write("                class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\"\n");
      out.write("                >\n");
      out.write("                <!-- Left -->\n");
      out.write("                <div class=\"me-5 d-none d-lg-block\">\n");
      out.write("                    <span>Get connected with us on social networks:</span>\n");
      out.write("                </div>\n");
      out.write("                <!-- Left -->\n");
      out.write("\n");
      out.write("                <!-- Right -->\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class=\"fab fa-twitter\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class=\"fab fa-google\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class=\"fab fa-instagram\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class=\"fab fa-linkedin\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class=\"fab fa-github\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Right -->\n");
      out.write("            </section>\n");
      out.write("            <!-- Section: Social media -->\n");
      out.write("\n");
      out.write("            <!-- Section: Links  -->\n");
      out.write("            <section class=\"\">\n");
      out.write("                <div class=\"container text-center text-md-start mt-5\">\n");
      out.write("                    <!-- Grid row -->\n");
      out.write("                    <div class=\"row mt-3\">\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n");
      out.write("                            <!-- Content -->\n");
      out.write("                            <h5 class=\"text-uppercase mb-4\"><i class=\"fas fa-tshirt\"></i>&nbsp;About shop</h5>\n");
      out.write("                            <p>\n");
      out.write("                                Our purpose at Shope is to empower people to lead bold and full lives. \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                We believe that if you look good, you feel good. And when you feel good you can do good for others around you. Shope brings you a wide range of trendy shoes, beautiful scarves, and statement-making jewelry, all at affordable prices to make them accessible to you. \n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("                            <!-- Links -->\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                Products\n");
      out.write("                            </h6>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Shoe</a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Sock</a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Pant</a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Shirt</a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Hat</a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Jacket</a>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Accessories</a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n");
      out.write("                            <!-- Links -->\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                Contact\n");
      out.write("                            </h6>\n");
      out.write("                            <p><i class=\"fas fa-home me-3\"></i>Km29 Đại lộ Thăng Long, huyện Thạch Thất, Hà Nội</p>\n");
      out.write("                            <p>\n");
      out.write("                                <i class=\"fas fa-envelope me-3\"></i>\n");
      out.write("                                shope@gmail.com\n");
      out.write("                            </p>\n");
      out.write("                            <p><i class=\"fas fa-phone me-3\"></i>+84 123456789</p>\n");
      out.write("                            <p><i class=\"fas fa-print me-3\"></i>+84 123456789</p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("                            <!-- Links -->\n");
      out.write("                            <h5 class=\"text-uppercase mb-4\"><i class=\"far fa-clock\"></i>&nbsp;Opening hours</h5>\n");
      out.write("                            <table class=\"table text-white\">\n");
      out.write("                                <tbody class=\"font-weight-normal\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Monday - Thurday:</td>\n");
      out.write("                                        <td>8am - 9pm</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Friday - Satủd:</td>\n");
      out.write("                                        <td>8am - 12pm</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Sunday:</td>\n");
      out.write("                                        <td>9am - 10pm</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid row -->\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Section: Links  -->\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("            <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("                © 2021 Copyright:\n");
      out.write("                <a class=\"text-white\" href=\"#\">SWP391 - GRP1</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Copyright -->\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
