/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBContext.LoginDAO;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

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
        //Lấy dữ liệu từ jsp
       String username = request.getParameter("user");
       String password = request.getParameter("pass");
       //Kết nối vs DB
       LoginDAO dao = new LoginDAO();
//       Users u = dao.login(username, password);
//       //Kiểm tra
////       if (!username.equals("user") && !password.equals("pass")) {
//       if(u==null){
//            //login fail -> Đẩy về trang Login.jsp (nhập lại)
//            //Message thông báo Login sai: thay đổi giá trị của biến mess
//           request.setAttribute("mess", "login fail!");
//           //ko thì quay trở lại trang login.jsp
//           //Yêu cầu người dùng Login lại
//           request.getRequestDispatcher("Login.jsp").forward(request, response);
//           
//      }
//          else{
//           HttpSession session = request.getSession();
//           session.setAttribute("acc", u);
//           //request.getRequestDispatcher("home").forward(request, response);
//           response.sendRedirect("Homepage.jsp");
//           
//       }
       
       
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
       String username = request.getParameter("user");
       String password = request.getParameter("pass");
       //Kết nối vs DB
       LoginDAO dao = new LoginDAO();  
      if (!username.equals("user") && !password.equals("pass")) {
            Users u = dao.login(username, password);
            if (u != null) {
                HttpSession ss = request.getSession();
                ss.setAttribute("acc", u); 
                request.getRequestDispatcher("home").forward(request, response);
            } else {
                //login fail -> Đẩy về trang Login.jsp (nhập lại)
//            //Message thông báo Login sai: thay đổi giá trị của biến mess
                request.setAttribute("mess1", "Login Fail");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("mess1", "Login Fail");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
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
