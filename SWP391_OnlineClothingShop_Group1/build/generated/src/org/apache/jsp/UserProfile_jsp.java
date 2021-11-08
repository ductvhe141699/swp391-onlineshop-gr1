package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>SHOPE</title>\r\n");
      out.write("        <!--Boostrap-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("            crossorigin=\"anonymous\"\r\n");
      out.write("            />\r\n");
      out.write("        <!--Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <!--Fontawesome-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("        <!--CSS-->\r\n");
      out.write("        <link href=\"css/UserProfile.css\" rel=\"stylesheet\" type=\"text/css\"/> \r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\" />-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/queries.css\" />-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/queries.css\">\r\n");
      out.write("        <!--ICON-->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"resources/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"row m-0 p-0\">\r\n");
      out.write("                <span id=\"promo\" class=\"d-lg-block d-none\">\r\n");
      out.write("                    <marquee style=\"width: 100%\" behavior=\"scroll\" direction=\"left\"><i style=\"color: white\">Get 10% SALE by using special discount code \"CHEERSLUV\"</i></marquee>\r\n");
      out.write("                </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("                <!-- LOGO -->\r\n");
      out.write("                <a class=\"navbar-brand col-lg-2 offset-lg-2 logo\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">\r\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/SHOPE-logos_transparent.png\"> </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \r\n");
      out.write("                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" \r\n");
      out.write("                        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                        <li class=\"nav-item active\">\r\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" \r\n");
      out.write("                               href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0\">Product</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#part-1\">Contacts Us</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0\" method=\"get\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"page\" value=\"1\"/>\r\n");
      out.write("                        <input name=\"query\" class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search here...\" aria-label=\"Search\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"subcategory\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"brand\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"price\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"sortType\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"sortMode\" value=\"0\"/>\r\n");
      out.write("                        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"row m-0 p-0\">\r\n");
      out.write("                <span id=\"promo\" class=\"d-lg-block d-none\">\r\n");
      out.write("                    <marquee style=\"width: 100%\" behavior=\"scroll\" direction=\"left\"><i>Get 10% SALE by using special discount code \"CHEERSLUV\"</i></marquee>\r\n");
      out.write("                </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("                <!-- LOGO -->\r\n");
      out.write("                <a class=\"navbar-brand col-lg-2 offset-lg-2 logo\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">\r\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/SHOPE-logos_transparent.png\"> </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \r\n");
      out.write("                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" \r\n");
      out.write("                        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                        <li class=\"nav-item active\">\r\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" \r\n");
      out.write("                               href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0\">Product</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#footer\">Contacts Us</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0\" method=\"get\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"page\" value=\"1\"/>\r\n");
      out.write("                        <input name=\"query\" class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search here...\" aria-label=\"Search\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"subcategory\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"brand\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"price\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"sortType\" value=\"0\"/>\r\n");
      out.write("                        <input type=\"hidden\" name=\"sortMode\" value=\"0\"/>\r\n");
      out.write("                        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3 border-right\">\r\n");
      out.write("                    <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" src=\"resources/img/user_no-frame.png\" width=\"90\"><span class=\"font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><span class=\"text-black-50\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><span>Viet Nam</span></div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-5 border-right\">\r\n");
      out.write("                    <div class=\"p-3 py-5\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                            <h6 class=\"text-right\">Your profile</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-2\">\r\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Name</label><input type=\"text\" class=\"form-control\" placeholder=\"first name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled></div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-3\">\r\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Your Number ID</label><input type=\"text\" class=\"form-control\" placeholder=\"headline\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled></div>\r\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Your Current Password</label><input type=\"text\" class=\"form-control\" placeholder=\"headline\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled></div>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-3\">\r\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Country</label><input type=\"text\" class=\"form-control\" placeholder=\"country\" value=\"Viet Nam\" disabled></div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"changepass\" style=\"width: 300px\"\r\n");
      out.write("                           class=\"mt-5 text-center btn btn-primary profile-button\" type=\"button\">Change your password\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <a href=\"viewOrder?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 300px\"\r\n");
      out.write("                           class=\"mt-5 text-center btn btn-primary profile-button\" type=\"button\">View your orders\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"p-3 py-5\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center experience\"><span>About us</span><span class=\"border px-3 p-1 add-experience\"><i class=\"fa fa-plus\"></i>&nbsp;Get more information</span></div>\r\n");
      out.write("                        <div class=\"d-flex flex-row mt-3 exp-container\"><img src=\"https://i.imgur.com/azSfBM3.png\" width=\"45\" height=\"45\">\r\n");
      out.write("                            <div class=\"work-experience ml-1\"><span class=\"font-weight-bold d-block\">SHOPE</span><span class=\"d-block text-black-50 labels\">Twitter Inc.</span><span class=\"d-block text-black-50 labels\">March,2017 - May 2020</span></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"d-flex flex-row mt-3 exp-container\"><img src=\"https://img.icons8.com/color/100/000000/facebook.png\" width=\"45\" height=\"45\">\r\n");
      out.write("                            <div class=\"work-experience ml-1\"><span class=\"font-weight-bold d-block\">SHOPE</span><span class=\"d-block text-black-50 labels\">Facebook Inc.</span><span class=\"d-block text-black-50 labels\">March,2017 - May 2020</span></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"d-flex flex-row mt-3 exp-container\"><img src=\"https://img.icons8.com/color/50/000000/google-logo.png\" width=\"45\" height=\"45\">\r\n");
      out.write("                            <div class=\"work-experience ml-1\"><span class=\"font-weight-bold d-block\">SHOPE</span><span class=\"d-block text-black-50 labels\">Google Inc.</span><span class=\"d-block text-black-50 labels\">March,2017 - May 2020</span></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"text-white text-lg-start\" style=\"background-color: #23242a;\" id=\"part-1\">\r\n");
      out.write("            <!-- Section: Social media -->\r\n");
      out.write("            <section\r\n");
      out.write("                class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\"\r\n");
      out.write("                >\r\n");
      out.write("                <!-- Left -->\r\n");
      out.write("                <div class=\"me-5 d-none d-lg-block\">\r\n");
      out.write("                    <span>Get connected with us on social networks:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Left -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Right -->\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\r\n");
      out.write("                        <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\r\n");
      out.write("                        <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\r\n");
      out.write("                        <i class=\"fab fa-google\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\r\n");
      out.write("                        <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\r\n");
      out.write("                        <i class=\"fab fa-linkedin\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"\" class=\"me-4 text-reset\">\r\n");
      out.write("                        <i class=\"fab fa-github\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Right -->\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- Section: Social media -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Section: Links  -->\r\n");
      out.write("            <section class=\"\">\r\n");
      out.write("                <div class=\"container text-center text-md-start mt-5\">\r\n");
      out.write("                    <!-- Grid row -->\r\n");
      out.write("                    <div class=\"row mt-3\">\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("                        <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\r\n");
      out.write("                            <!-- Content -->\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-4\"><i class=\"fas fa-tshirt\"></i>&nbsp;About shop</h5>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                Our purpose at Shope is to empower people to lead bold and full lives. \r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                            <p>\r\n");
      out.write("                                We believe that if you look good, you feel good. And when you feel good you can do good for others around you. Shope brings you a wide range of trendy shoes, beautiful scarves, and statement-making jewelry, all at affordable prices to make them accessible to you. \r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("                        <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("                            <!-- Links -->\r\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("                                Products\r\n");
      out.write("                            </h6>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Shoe</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Sock</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Pant</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Shirt</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Hat</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Jacket</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <a href=\"#!\" class=\"text-reset\">Accessories</a>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("                        <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\r\n");
      out.write("                            <!-- Links -->\r\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("                                Contact\r\n");
      out.write("                            </h6>\r\n");
      out.write("                            <p><i class=\"fas fa-home me-3\"></i>Km29 Đại lộ Thăng Long, huyện Thạch Thất, Hà Nội</p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <i class=\"fas fa-envelope me-3\"></i>\r\n");
      out.write("                                shope@gmail.com\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p><i class=\"fas fa-phone me-3\"></i>+84 123456789</p>\r\n");
      out.write("                            <p><i class=\"fas fa-print me-3\"></i>+84 123456789</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("                        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("                            <!-- Links -->\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-4\"><i class=\"far fa-clock\"></i>&nbsp;Opening hours</h5>\r\n");
      out.write("                            <table class=\"table text-white\">\r\n");
      out.write("                                <tbody class=\"font-weight-normal\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Monday - Thurday:</td>\r\n");
      out.write("                                        <td>8am - 9pm</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Friday - Satủd:</td>\r\n");
      out.write("                                        <td>8am - 12pm</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>Sunday:</td>\r\n");
      out.write("                                        <td>9am - 10pm</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Grid column -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Grid row -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- Section: Links  -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Copyright -->\r\n");
      out.write("            <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\r\n");
      out.write("                © 2021 Copyright:\r\n");
      out.write("                <a class=\"text-white\" href=\"#\">SWP391 - GRP1</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Copyright -->\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.roleID==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <div class=\"col-md-12\"><label class=\"labels\">Current Role</label><input type=\"text\" class=\"form-control\" placeholder=\"education\" value=\"Admin\" disabled></div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.roleID==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <div class=\"col-md-12\"><label class=\"labels\">Current Role</label><input type=\"text\" class=\"form-control\" placeholder=\"education\" value=\"Seller\" disabled></div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.roleID==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <div class=\"col-md-12\"><label class=\"labels\">Current Role</label><input type=\"text\" class=\"form-control\" placeholder=\"education\" value=\"Customer\" disabled></div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }
}
