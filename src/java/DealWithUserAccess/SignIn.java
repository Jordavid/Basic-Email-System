/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DealWithUserAccess;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
/**
 *
 * @author JorDavid
 */
@WebServlet(name = "SignIn", urlPatterns = {"/SignIn"})
public class SignIn extends HttpServlet {

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
        HttpSession session = request.getSession(true);
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mySql://localhost:3306/simplemail";
            String userName = "root";
            String PassWord = "david1fci";
            
            Connection Con;
            try {
                Con = DriverManager.getConnection(url, userName, PassWord);
            
                String email = request.getParameter("lEmail");
                String password = request.getParameter("lPass");

                PreparedStatement pStmt = Con.prepareStatement("SELECT * FROM user WHERE email = ?  AND Password = ?");
                pStmt.setString(1, email);
                pStmt.setString(2, password);
                ResultSet Rs = pStmt.executeQuery();
                if(Rs.next()){
                    String  id  = Rs.getString("userID");
                    String firtName = Rs.getString("firstName");
                    String lastName = Rs.getString("lastName");
                    String uname = Rs.getString("username");
                    String gender = Rs.getString("gender");
                    session.setAttribute("sessUname", uname);
                    session.setAttribute("sessGender", gender);
                    session.setAttribute("SessfName", firtName);
                    session.setAttribute("SesslName", lastName);
                    session.setAttribute("sessionID", id);
                    session.setAttribute("sessionlEmail", email);
                    session.setAttribute("sessPassword", password);
                    
                    response.sendRedirect("home.jsp");
                }
                else{
                    session.invalidate();
                    request.setAttribute("errorMsg", "Wrong Email or Password");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                Rs.close();
                pStmt.close();
                Con.close();
            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            } 
          
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Error: " + cnfe);
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
