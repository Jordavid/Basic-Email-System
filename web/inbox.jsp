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
        <h1>Your Inbox!</h1>
        <%
            String email = (String)session.getAttribute("sessionlEmail");
            
            String query = "SELECT title, body, sender, dateTime FROM message WHERE reciever = ?";
            PreparedStatement myPsmt = myCon.prepareStatement(query);
            myPsmt.setString(1, email);
            ResultSet myRs = myPsmt.executeQuery();
            %>
        <table border="1">
            <thead>
                    <th colspan="4" align="center">Inbox</th>
                    </thead>
                    <th>Title</th>
                    <th>Body</th>
                    <th>From</th>
                    <th>Date</th>
            <%
                while(myRs.next()){%>
            <tr align='center'>
                <td><%out.println(myRs.getString("title"));%></td>
                <td><%out.println(myRs.getString("body"));%></td>
                <td><%out.println(myRs.getString("sender"));%></td>
                <td><%out.println(myRs.getString("dateTime"));%></td>
                <td><form action="DeleteMessage">
                        <button>Delete</button>
                    </form>
                </td>
                <%
                    String messageBody = myRs.getString("body");
                    String sendEmail = myRs.getString("sender");
                    String messTitle = myRs.getString("title");
                %>
                <td>
                    <form action="forwardMessageFom.jsp" method="get">
                        <input type="hidden" name="messBody" value="<%=messageBody%>">
                        <input type="hidden" name="messTitle" value="<%=messTitle%>">
                        <input type="submit" value="Forward">
                    </form>
                </td>
                <td>
                    <form action="ReplyMessageForm.jsp" method="get">
                        <input type="hidden" name="messBody" value="<%=messageBody%>">
                        <input type="hidden" name="sendEmail" value="<%=sendEmail%>">
                        <input type="hidden" name="messTitle" value="<%=messTitle%>">
                        <input type="submit" value="Reply">
                    </form>
                </td>
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
