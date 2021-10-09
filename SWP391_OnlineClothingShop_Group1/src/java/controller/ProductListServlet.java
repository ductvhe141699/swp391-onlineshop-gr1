/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author SAKURA
 */
public class ProductListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        CategoryDAO cdao = new CategoryDAO();
        List<Category> categorys = cdao.list();
        request.setAttribute("categorys", categorys);
        BrandDAO bdao= new BrandDAO();
        List<Brand> brands = bdao.list();
        request.setAttribute("brands", brands);
//        NAV
        ProductDAO pdao=new ProductDAO();
        int page=Integer.parseInt(request.getParameter("page"));
        String query=request.getParameter("query");
        int subcategory=Integer.parseInt(request.getParameter("sibcategory"));
        int brand=Integer.parseInt(request.getParameter("brand"));
        int price=Integer.parseInt(request.getParameter("price"));
        int sortType=Integer.parseInt(request.getParameter("sortType"));
        int sortMode=Integer.parseInt(request.getParameter("sortMode"));
        
        request.setAttribute("page",page);
        request.setAttribute("query", query.replace(' ', '+'));
        request.setAttribute("subcategory", subcategory);
        request.setAttribute("brand", brand);
        request.setAttribute("price", price);
        request.setAttribute("sortType", sortType);
        request.setAttribute("sortMode", sortMode);
        
        List<Product> products=pdao.listQuery(st, sm, c, b,search);
        int maxp= (int) Math.ceil( (products.size()*1.0 )/8);
        request.setAttribute("maxp", maxp);
        List<Product> display = new ArrayList<>();
        for(int i=8*(p-1);i<8*p ;i++)
            if(i<products.size())
                display.add(products.get(i));
        request.setAttribute("products", display);
        request.getRequestDispatcher("productlist.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
