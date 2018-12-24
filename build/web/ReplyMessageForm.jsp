<%-- 
    Document   : newMessagesForm
    Created on : Dec 27, 2015, 4:34:25 PM
    Author     : JorDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Email System | New message form</title>
        <link rel="stylesheet" type="text/css" href="index.css">
        <script type="text/javascript" src="JavaScript/ValideForm.js"></script>
    </head>
     <%
            String messTitle = request.getParameter("messTitle");
            String senderEmail = request.getParameter("sendEmail");
            String repl = "Re: ";
       %>
    <body>
        <div class="NewMessageForm">
            <h2 style="color: #1F2C39; text-align: center; font-family: cambria; font-size: 40px;">New Message</h2>
            <form method="POST" action="sendMessage" onsubmit="return sendMessageFormCheck(this)" id="newMessForm">
            <table>
                <tr>
                    <td>To</td>
                    <td><input type="email" name="sendTO" value="<%=senderEmail%>"></td>
                </tr>
                <tr>
                    <td>Cc</td>
                    <td><input type="email" name="carCopy" placeholder="abcd@domail"></td>
                </tr>
                <tr>
                    <td>Title</td>
                    <td><input type="text" name="messTitle" value="<%=repl + messTitle%>"></td>
                </tr>
            </table><br>
            <textarea rows="15" cols="62" form="newMessForm" name="messageBody" style="font-size: 17px; font-family: arial;" placeholder="Type here to write your message" ></textarea><br>
                <input type="submit" value="Send">
                <input type="submit" value="Save Draft">
            </form><br>
        </div>
    </body>
</html>
