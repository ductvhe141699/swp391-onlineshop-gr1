package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewOrdersHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>SHOPE</title>\n");
      out.write("        <!--Boostrap-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("        <!--Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!--Fontawesome-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <!--CSS-->\n");
      out.write("        <link href=\"css/order.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/queries.css\">\n");
      out.write("        <!--ICON-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"resources/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"row m-0 p-0\">\n");
      out.write("                <span id=\"promo\" class=\"d-lg-block d-none\">\n");
      out.write("                    <marquee style=\"width: 100%\" behavior=\"scroll\" direction=\"left\"><i style=\"color: black\">Get 10% SALE by using special discount code \"CHEERSLUV\"</i></marquee>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <!-- LOGO -->\n");
      out.write("                <a class=\"navbar-brand col-lg-2 offset-lg-2 logo\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/SHOPE-logos_transparent.png\"> </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \n");
      out.write("                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" \n");
      out.write("                        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" \n");
      out.write("                               href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product?page=1&query=&subcategory=0&brand=0&price=0&sortType=0&sortMode=0\">Product</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#part-1\">Contacts Us</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0\" method=\"get\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">\n");
      out.write("                        <input type=\"hidden\" name=\"page\" value=\"1\"/>\n");
      out.write("                        <input name=\"query\" class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search here...\" aria-label=\"Search\">\n");
      out.write("                        <input type=\"hidden\" name=\"subcategory\" value=\"0\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"brand\" value=\"0\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"price\" value=\"0\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"sortType\" value=\"0\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"sortMode\" value=\"0\"/>\n");
      out.write("                        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"d-flex justify-content-center row\">\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <div class=\"rounded p-5\">\n");
      out.write("                        <div class=\"table-responsive table-borderless\">\n");
      out.write("\n");
      out.write("                            <table class=\"table table-striped table-hover table-bordered\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Order #</th>\n");
      out.write("                                        <th>status</th>\n");
      out.write("                                        <th>Total</th>\n");
      out.write("                                        <th>Created</th>\n");
      out.write("                                        <th>Order Information</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody class=\"table-body\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            <br><br>\n");
      out.write("                            <h3 style=\"color:black;\">Total:                                        \n");
      out.write("                                <fmt:formatNumber type = \"number\" maxFractionDigits = \"1\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                VNĐ</h3>\n");
      out.write("                                <br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"text-white text-lg-start\" style=\"background-color: #23242a;\" id=\"part-1\">\n");
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
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("o");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orders}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr class=\"cell-1\">\n");
          out.write("                                            <td>#OR0");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>\n");
          out.write("                                                <span class=\"badge badge-pill badge-info\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td><a href=\"ViewOrderDetails?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"cursor: pointer \">View</a></td>\n");
          out.write("                                        </tr>\n");
          out.write("                                        ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("total");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total + o.totalPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
