<%-- 
    Document   : testMessage
    Created on : Dec 27, 2015, 5:22:54 PM
    Author     : JorDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Email System | Thank you for your Registration.</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String sessId = (String) session.getAttribute("sessionID");
            String sessfName = (String) session.getAttribute("sessionfName");
            String sesslName = (String) session.getAttribute("sessionlName");
        %>
        <h1>Thank you for <b>Signing Up</b>. Please Click <a href="home.jsp" style="text-decoration: none; color: gold;">here</a> to go to your <b>home</b> page.</h1>
    </body>
</html>
