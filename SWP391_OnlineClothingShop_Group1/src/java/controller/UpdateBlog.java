/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBContext.BlogDAO;
import DBContext.CategoryDAO;
import DBContext.UserDAO;
import entity.Users;
import entity.Blog;
import entity.Category;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thong
 */
@WebServlet(name = "UpdateBlog", urlPatterns = {"/UpdateBlog"})
public class UpdateBlog extends HttpServlet {

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
        try {
            //Get ID cua Blog tu JSP
            String id = request.getParameter("BlogID");
            BlogDAO BlogDAO = new BlogDAO();
            Blog blog=BlogDAO.getBlogByID(Integer.parseInt(id));
            request.setAttribute("id", blog.getId());
            request.setAttribute("author", blog.getAuthor());
            request.setAttribute("title", blog.getTitle());
            request.setAttribute("content", blog.getContent());
            request.setAttribute("imageLink", blog.getImageLink());
            request.getRequestDispatcher("UpdateBlog.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("Error.jsp");
        }
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
        try {
            //Step 1: get data from jsp
            String title = request.getParameter("title"); //Get by name
            String content = request.getParameter("content");           
            String imageLink = request.getParameter("imageLink");
            String author = request.getParameter("author");
            String id = request.getParameter("id");
            //Step 2: set data to ProductDAO
            BlogDAO dao = new BlogDAO();
            dao.update(author, title, content, imageLink, id);
            dao = new BlogDAO();
            ArrayList<Blog> blogList = dao.getAllBlogs();
            request.setAttribute("blogList", blogList);
            request.getRequestDispatcher("ManageBlog.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendRedirect("error.jsp");
        }
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

