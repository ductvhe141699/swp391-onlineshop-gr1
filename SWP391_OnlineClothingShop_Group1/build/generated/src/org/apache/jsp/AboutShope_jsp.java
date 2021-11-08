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
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Giới thiệu</h1>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <p>\n");
      out.write("                    Shope Store ra đời từ 2012, khởi đầu ở một cửa hàng nhỏ trên phố Lò Đúc. \n");
      out.write("                    Shope Store những ngày đầu được gây dựng bởi 3 chàng trai trẻ tuổi, \n");
      out.write("                    ôm trong mình hoài bão thay đổi xu hướng thời trang Việt Nam.\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    Bằng đam mê với vest và bằng những cố gắng bền bỉ trong từng giây phút, \n");
      out.write("                    Shope Store đã tiên phong trong ngành thời trang, thay đổi tư duy khách hàng, \n");
      out.write("                    trở thành thương hiệu Việt Nam lớn nhất trong thị phần vest may sẵn, là thương hiệu uy tín về đồ Âu cho nam giới\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"resources/gioithieu.jpg\" \n");
      out.write("                         style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <h2 style=\"text-align: center;\">5 lý do nên mua sản phẩm ở shope store</h2>\n");
      out.write("                <br>\n");
      out.write("                <p><strong>Nhiều size nhất, sát người dùng nhất</strong></p>\n");
      out.write("                <br>\n");
      out.write("                <p>Nếu các thương hiệu khác chỉ có 3 sizes cho khách hàng thì ở Shope Store có đến 5 sizes phù hợp cho người từ 48-85kg. \n");
      out.write("                    Chúng tôi muốn đảm bảo bạn luôn có thể chọn được một chiếc áo mặc vừa với người.</p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"resources/gioithieu2.jpg\" \n");
      out.write("                         style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <h3 style=\"text-align: center;\">Hệ thống hơn 60 cửa hàng toàn quốc</h3>\n");
      out.write("                <br>\n");
      out.write("                <p>Shope Store giờ đây có hệ thống hơn 60 cửa hàng trên 35 tỉnh thành Việt Nam và vẫn đang tiếp tục mở rộng phủ kín Việt Nam. \n");
      out.write("                    Với việc hỗ trợ mua hàng online, khách hàng hoàn toàn có thể sở hữu được trang phục Adam Store một cách dễ dàng.</p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"resources/gioithieu3.jpg\" \n");
      out.write("                         style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <h3 style=\"text-align: center;\">Phom dáng được tối ưu cho người Việt</h3>\n");
      out.write("                <br>\n");
      out.write("                <p>Với tôn chỉ \"Vì khách hàng xứng đáng những điều tốt đẹp nhất\", Shope rất chú trọng đến cảm xúc và trải nghiệm của khách hàng. \n");
      out.write("                    Chúng tôi có những không gian mua hàng xứng tầm, với đội ngũ tư vấn chuyên nghiệp, có gu thẩm mỹ tốt, \n");
      out.write("                    được đào tạo bài bản để giúp khách hàng có sự mua sắm tốt nhất.</p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"resources/gioithieu4.jpg\" \n");
      out.write("                         style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <h3 style=\"text-align: center;\">Dịch vụ chăm sóc tốt nhất</h3>\n");
      out.write("                <br>\n");
      out.write("                <p>Shope Store qua 5 năm đã có hơn 40 lần điều chỉnh các phom dáng thiết kế dựa trên sự phản hồi của khách hàng và ý kiến của các chuyên gia hơn 20 năm kinh nghiệp.\n");
      out.write("                    Chúng tôi đã tạo ra được những mẫu phù hợp nhất cho khách hàng để che dấu đi những nhược điểm của người Việt.</p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"resources/gioithieu5.jpg\" \n");
      out.write("                         style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <h3 style=\"font-weight: 500; text-align: center;\"><strong>Hơn 500,000 khách hàng tin tưởng</strong></h3>\n");
      out.write("                <br>\n");
      out.write("                <p>Chúng tôi đã vinh dự được làm bạn đồng hành với hơn 400.000 chú rể, \n");
      out.write("                    hơn 100.000 các doanh nhân, giám đốc, lãnh đạo cấp cao và hàng nghìn người nổi tiếng \n");
      out.write("                    trên khắp đất nước Việt Nam, và cả nước ngoài.</p>\n");
      out.write("                <br>\n");
      out.write("                <p>\n");
      out.write("                    <img src=\"resources/gioithieu6.jpg\" \n");
      out.write("                         style=\"display: block; margin-left: auto; margin-right: auto;\">\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <h3 style=\"font-weight: 500; text-align: center;\"><strong>Hãy đến thăm chúng tôi</strong></h3>\n");
      out.write("                <br>\n");
      out.write("                <p class=\"map\">\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.4855345740657!2d105.52487561413173!3d21.013249986006784!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2sFPT%20University!5e0!3m2!1sen!2s!4v1636287484694!5m2!1sen!2s\" \n");
      out.write("                            width=\"700\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\"></iframe>\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Copyright -->\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            © 2021 Copyright:\n");
      out.write("            <a class=\"text-white\" href=\"#\">SWP391 - GRP1</a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Copyright -->\n");
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
