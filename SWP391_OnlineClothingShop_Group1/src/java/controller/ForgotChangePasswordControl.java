/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBContext.UserDAO;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class ForgotChangePasswordControl extends HttpServlet {

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
        try{
            // Get the account from session
            HttpSession session = request.getSession();
            int userID = (int) session.getAttribute("userID");

            // Get new password and repeat of new password           
            String newPassword = request.getParameter("new-pass");
            String repeatNewPassword = request.getParameter("repeat-new-pass");
            UserDAO dao = new UserDAO();

            // Get the account from database
            Users a = dao.getUsersByID(String.valueOf(userID));

            if (newPassword.equals(repeatNewPassword)) {
                // User enter new password and re-enter new pasword correctly
                // => Do update
                dao.updatePassword(String.valueOf(userID), newPassword);
                // Redirect to profile, notify successful 
                request.setAttribute("message", "Changed password successfully!");
                request.getRequestDispatcher("ProfileControl").forward(request, response);

            } else {
                // User enter old password, new password and re-enter new pasword incorrect
                // => No update
                request.setAttribute("message", "Fail to change password");
                request.setAttribute("compare", "CorrectCode.");
                // Redirect to form to do again
                request.getRequestDispatcher("ResetPassword.jsp").forward(request, response);
            }

        } catch (Exception e) {
            response.sendRedirect("error.html");
        }
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
