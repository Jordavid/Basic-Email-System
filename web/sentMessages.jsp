<%-- 
    Document   : inbox
    Created on : Dec 30, 2015, 6:54:59 AM
    Author     : JorDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/simplemail";
    String userName = "root";
    String password = "david1fci";
    Connection myCon = DriverManager.getConnection(url,userName, password);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your Sent Messages!</h1>
        <%
            String email = (String)session.getAttribute("sessionlEmail");
            
            String query = "SELECT title, body, reciever, dateTime FROM message WHERE sender = ?";
            PreparedStatement myPsmt = myCon.prepareStatement(query);
            myPsmt.setString(1, email);
            ResultSet myRs = myPsmt.executeQuery();
            %>
        <table border="1">
            <thead>
                    <th colspan="4" align="center">Sent Messages</th>
                    </thead>
                    <th>Title</th>
                    <th>Body</th>
                    <th>TO</th>
                    <th>Date</th>
            <%
                while(myRs.next()){%>
            <tr align='center'>
                <td><%out.println(myRs.getString("title"));%></td>
                <td><%out.println(myRs.getString("body"));%></td>
                <td><%out.println(myRs.getString("reciever"));%></td>
                <td><%out.println(myRs.getString("dateTime"));%></td>
            </tr>
               <%
                }
        %>
        </table>
        <%
            myRs.close();
            myPsmt.close();
            myCon.close();
        %>
    </body>
</html>
