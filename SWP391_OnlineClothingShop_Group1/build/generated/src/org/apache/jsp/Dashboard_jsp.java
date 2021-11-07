package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\"\r\n");
      out.write("            />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dataTables.bootstrap5.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dashboard.css\" />\r\n");
      out.write("        <title>Dashboard</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- top navigation bar -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <button\r\n");
      out.write("                    class=\"navbar-toggler\"\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    data-bs-toggle=\"offcanvas\"\r\n");
      out.write("                    data-bs-target=\"#sidebar\"\r\n");
      out.write("                    aria-controls=\"offcanvasExample\"\r\n");
      out.write("                    >\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\" data-bs-target=\"#sidebar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a\r\n");
      out.write("                    class=\"navbar-brand me-auto ms-lg-0 ms-3 text-uppercase fw-bold\"\r\n");
      out.write("                    href=\"#\"\r\n");
      out.write("                    >SHOPE</a\r\n");
      out.write("                >\r\n");
      out.write("                <button\r\n");
      out.write("                    class=\"navbar-toggler\"\r\n");
      out.write("                    type=\"button\"\r\n");
      out.write("                    data-bs-toggle=\"collapse\"\r\n");
      out.write("                    data-bs-target=\"#topNavBar\"\r\n");
      out.write("                    aria-controls=\"topNavBar\"\r\n");
      out.write("                    aria-expanded=\"false\"\r\n");
      out.write("                    aria-label=\"Toggle navigation\"\r\n");
      out.write("                    >\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"topNavBar\">\r\n");
      out.write("                    <form class=\"d-flex ms-auto my-3 my-lg-0\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input\r\n");
      out.write("                                class=\"form-control\"\r\n");
      out.write("                                type=\"search\"\r\n");
      out.write("                                placeholder=\"Search\"\r\n");
      out.write("                                aria-label=\"Search\"\r\n");
      out.write("                                />\r\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"submit\">\r\n");
      out.write("                                <i class=\"bi bi-search\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"nav-link dropdown-toggle ms-2\"\r\n");
      out.write("                                href=\"#\"\r\n");
      out.write("                                role=\"button\"\r\n");
      out.write("                                data-bs-toggle=\"dropdown\"\r\n");
      out.write("                                aria-expanded=\"false\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <i class=\"bi bi-person-fill\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-end\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Logout</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- top navigation bar -->\r\n");
      out.write("        <!-- offcanvas -->\r\n");
      out.write("        <div\r\n");
      out.write("            class=\"offcanvas offcanvas-start sidebar-nav bg-dark\"\r\n");
      out.write("            tabindex=\"-1\"\r\n");
      out.write("            id=\"sidebar\"\r\n");
      out.write("            >\r\n");
      out.write("            <div class=\"offcanvas-body p-0\">\r\n");
      out.write("                <nav class=\"navbar-dark\">\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"text-muted small fw-bold text-uppercase px-3\">\r\n");
      out.write("                                CORE\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link px-3 active\">\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-speedometer2\"></i></span>\r\n");
      out.write("                                <span>Home</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"my-4\"><hr class=\"dropdown-divider bg-light\" /></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"text-muted small fw-bold text-uppercase px-3 mb-3\">\r\n");
      out.write("                                Interface\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a\r\n");
      out.write("                                class=\"nav-link px-3 sidebar-link\"\r\n");
      out.write("                                data-bs-toggle=\"collapse\"\r\n");
      out.write("                                href=\"#layouts\"\r\n");
      out.write("                                >\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-layout-split\"></i></span>\r\n");
      out.write("                                <span>Mange Blog</span>\r\n");
      out.write("                                <span class=\"ms-auto\">\r\n");
      out.write("\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link px-3\">\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-book-fill\"></i></span>\r\n");
      out.write("                                <span>Manage Account</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"text-muted small fw-bold text-uppercase px-3 mb-3\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link px-3\">\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-graph-up\"></i></span>\r\n");
      out.write("                                <span>Charts</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link px-3\">\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-table\"></i></span>\r\n");
      out.write("                                <span>Manage Product</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"my-4\"><hr class=\"dropdown-divider bg-light\" /></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link px-3\">\r\n");
      out.write("                                <span class=\"\"><i class=\"\"></i></span>\r\n");
      out.write("                                <span>Notifications</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- offcanvas -->\r\n");
      out.write("        <main class=\"mt-5 pt-3\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <h4>Dashboard</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\r\n");
      out.write("                        <div class=\"card bg-primary text-white h-100\">\r\n");
      out.write("                            <div class=\"card-body py-5\">Primary Card</div>\r\n");
      out.write("                            <div class=\"card-footer d-flex\">\r\n");
      out.write("                                View Details\r\n");
      out.write("                                <span class=\"ms-auto\">\r\n");
      out.write("                                    <i class=\"bi bi-chevron-right\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\r\n");
      out.write("                        <div class=\"card bg-warning text-dark h-100\">\r\n");
      out.write("                            <div class=\"card-body py-5\">Warning Card</div>\r\n");
      out.write("                            <div class=\"card-footer d-flex\">\r\n");
      out.write("                                View Details\r\n");
      out.write("                                <span class=\"ms-auto\">\r\n");
      out.write("                                    <i class=\"bi bi-chevron-right\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\r\n");
      out.write("                        <div class=\"card bg-success text-white h-100\">\r\n");
      out.write("                            <div class=\"card-body py-5\">Success Card</div>\r\n");
      out.write("                            <div class=\"card-footer d-flex\">\r\n");
      out.write("                                View Details\r\n");
      out.write("                                <span class=\"ms-auto\">\r\n");
      out.write("                                    <i class=\"bi bi-chevron-right\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\r\n");
      out.write("                        <div class=\"card bg-danger text-white h-100\">\r\n");
      out.write("                            <div class=\"card-body py-5\">Danger Card</div>\r\n");
      out.write("                            <div class=\"card-footer d-flex\">\r\n");
      out.write("                                View Details\r\n");
      out.write("                                <span class=\"ms-auto\">\r\n");
      out.write("                                    <i class=\"bi bi-chevron-right\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <div class=\"card-header\">\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-bar-chart-fill\"></i></span>\r\n");
      out.write("                                Area Chart Example\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <canvas class=\"chart\" width=\"400\" height=\"200\"></canvas>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <div class=\"card-header\">\r\n");
      out.write("                                <span class=\"me-2\"><i class=\"bi bi-bar-chart-fill\"></i></span>\r\n");
      out.write("                                Area Chart Example\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <canvas class=\"chart\" width=\"400\" height=\"200\"></canvas>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12 mb-3\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-header\">\r\n");
      out.write("                                <span><i class=\"bi bi-table me-2\"></i></span> Data Table\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"table-responsive\">\r\n");
      out.write("                                    <table id=\"example\"  class=\"table table-striped data-table\"  style=\"width: 100%\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>ID</th>\r\n");
      out.write("                                                <th>Product Name</th>\r\n");
      out.write("                                                <th>Product price</th>\r\n");
      out.write("                                                <th>Status</th>\r\n");
      out.write("                                                <th>Date</th>>\r\n");
      out.write("                                                <th>Action</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        <script src=\"./js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js@3.0.2/dist/chart.min.js\"></script>\r\n");
      out.write("        <script src=\"./js/jquery-3.5.1.js\"></script>\r\n");
      out.write("        <script src=\"./js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"./js/dataTables.bootstrap5.min.js\"></script>\r\n");
      out.write("        <script src=\"./js/script1.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("o");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOrder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                             <tr>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td><a href=\"#\">Delete </a> <a href=\"#\">view</a></td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                        ");
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
}
