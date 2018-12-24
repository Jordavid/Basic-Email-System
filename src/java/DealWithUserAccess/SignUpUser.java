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
@WebServlet(name = "SignUpUser", urlPatterns = {"/SignUpUser"})
public class SignUpUser extends HttpServlet {

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
                
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String uname = request.getParameter("uname");
                String email = request.getParameter("email");
                String gender = request.getParameter("gender");
                String password = request.getParameter("password1");
                
                
                String checkExist = "SELECT email FROM user";
                PreparedStatement Pstmt0 = con.prepareStatement(checkExist);
                ResultSet Rs = Pstmt0.executeQuery();
                int count = 0;
                   while(Rs.next()){
                    for(int i=2; i<100; i++){
                        if(email.equals(Rs.getString(i))){
                            System.out.println("Email Already Exits");
                            response.sendRedirect("index.html");
                            System.out.println(count);
                        }
                    }
            }
                
                String query = "INSERT INTO user VALUES (?,?, ?, ?, ?, ?, ?)";
                PreparedStatement Pstmt = con.prepareStatement(query);
                Pstmt.setNull(1, 0);
                Pstmt.setString(2, fname);
                Pstmt.setString(3, lname);
                Pstmt.setString(4, uname);
                Pstmt.setString(5, email);
                Pstmt.setString(6, gender);
                Pstmt.setString(7, password);
                rowAffected += Pstmt.executeUpdate();
                
                if(rowAffected == 1){
                    session.setAttribute("sessionID", uname);
                    session.setAttribute("sessionfName", fname);
                    session.setAttribute("sessionlName", lname);
                    session.setAttribute("sessionlEmail", email);
                    session.setAttribute("sessionGender", gender);
                    session.setAttribute("sessionPassword", password);
                    //response.sendRedirect("index.jsp");
                    String s = "You Have Successfully Been Recorded! :)"
                            +"   Please Click on Sign In button to Acees Your account!";
                    request.setAttribute("successMsg", s);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
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
