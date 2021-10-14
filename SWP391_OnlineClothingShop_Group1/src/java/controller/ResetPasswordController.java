/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBContext.UserDAO;
import SMTP.GmailAPI;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BEAN
 */
@WebServlet(name = "ResetPasswordController", urlPatterns = {"/ResetPasswordController"})
public class ResetPasswordController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResetPasswordController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ResetPasswordController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        UserDAO d = new UserDAO();
        GmailAPI gmail = new GmailAPI();
        try {
            int numberOfCharactor = 8;
            String email = (String) request.getParameter("email");
            int checkExits = d.checkExitsEmail(email);
            if (checkExits != -1) {

                String fromGmail = "duclee028@gmail.com";
                String password = "duc25092000";
                String newPass = d.RandomPassword(numberOfCharactor);
                d.updatePasswordByEmail(email, newPass);
                String subject = "RESET PASSWORD";
                String message = "This is your new password: " + newPass;

                GmailAPI.send(email, subject, message, fromGmail, password);
                request.setAttribute("alert", "Password changed! Please check your email! ");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        } catch (MessagingException ex) {
            Logger.getLogger(ResetPasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
