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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>SHOPE</title>\n");
      out.write("        <!--CSS-->\n");
      out.write("        <link href=\"css/AboutShope.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <!--ICON-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"resources/favicon.ico\" type=\"image/x-icon\">\n");
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
      out.write("                        Product</a></li>\n");
      out.write("                <li><a href=\"Recruitment.jsp\">Recruitment</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"heading-main-box\">\n");
      out.write("                    <h1 class=\"titles\">Vietnamese people<br>use Vietnamese goods.<br>So join with us</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("                        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Giới thiệu</h1>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <p>\n");
      out.write("                    Shope Store ra đời từ 2012, khởi đầu ở một cửa hàng nhỏ trên phố Lò Đúc. \n");
      out.write("                    Shope Store những ngày đầu được gây dựng bởi 3 chàng trai trẻ tuổi, \n");
      out.write("                    ôm trong mình hoài bão thay đổi xu hướng thời trang Việt Nam.\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            <p>\n");
      out.write("                Bằng đam mê với vest và bằng những cố gắng bền bỉ trong từng giây phút, \n");
      out.write("                Shope Store đã tiên phong trong ngành thời trang, thay đổi tư duy khách hàng, \n");
      out.write("                trở thành thương hiệu Việt Nam lớn nhất trong thị phần vest may sẵn, là thương hiệu uy tín về đồ Âu cho nam giới\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            <p>\n");
      out.write("                <img src=\"resources/gioithieu.jpg\" \n");
      out.write("                     style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("            </p>\n");
      out.write("            <h2 style=\"text-align: center;\">5 lý do nên mua sản phẩm ở shope store</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Copyright -->\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            © 2021 Copyright:\n");
      out.write("            <a class=\"text-white\" href=\"#\">SWP391 - GRP1</a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Copyright -->\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
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
