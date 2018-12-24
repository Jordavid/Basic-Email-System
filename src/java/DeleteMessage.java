/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(name = "DeleteMessage", urlPatterns = {"/DeleteMessage"})
public class DeleteMessage extends HttpServlet {

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
            HttpSession session = request.getSession();
            int rowAffected = 0;
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "jdbc:mySql://localhost:3306/simplemail";
            String userName = "root";
            String PassWord = "david1fci";
            
            Connection con;
            try {
                con = DriverManager.getConnection(url, userName, PassWord);
                
                String getId = "SELECT messageId FROM message";
                PreparedStatement prS = con.prepareStatement(getId);
                
                int messageID = 0;
                ResultSet rs = prS.executeQuery();
                while(rs.next()){
                    messageID = rs.getInt("messageId");
                }
                String query = "DELETE FROM message WHERE messageId = ?";
                PreparedStatement Pstmt = con.prepareStatement(query);
                Pstmt.setInt(1, messageID);
                
                rowAffected += Pstmt.executeUpdate();
                
                if(rowAffected == 1){
                    request.setAttribute("MessageSent", "Deleted!");
                    request.getRequestDispatcher("home.jsp").forward(request, response);
                }
                else{
                    System.out.println("Problem with Connecting to Database! Please Try again!");
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Error " + cnfe);
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
