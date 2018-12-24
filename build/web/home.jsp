<%-- 
    Document   : home
    Created on : Dec 14, 2015, 10:58:49 AM
    Author     : JorDavid
--%>
<%
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Email System | Home page</title>
        <script type="text/javascript" src="JavaScript/ValideForm.js"></script>
        <link rel="stylesheet" type="text/css" href="index.css">
        <script src="JavaScript/jquery-2.1.3.min.js"></script>
    </head>
    <script type="text/javascript">
        function loadNewMessageForm(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "newMessageForm.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        function loadInbox(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "inbox.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        
        function loadSentMessages(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "sentMessages.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        function loadDraftMessages(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "draft.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        function loadDeletedMessages(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "deletedMessages.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        function loadArchivedMessages(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "archivedMessages.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        
        function loadUserProfile(){
            var xmlhttp = new XMLHttpRequest();
            
            xmlhttp.open("GET", "UserProfileEdit.jsp", true);
            xmlhttp.send();
            
            xmlhttp.onreadystatechange= function (){
                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
                    document.getElementById("showMessageBox").innerHTML=xmlhttp.responseText;
                }
            };
        };
        
    </script>
    <body>
        <%
            String firstName = (String) session.getAttribute("SessfName");
            String lastName = (String) session.getAttribute("SesslName");
        %>
        <div id="alHaveAcc">
            <form action="index.jsp">
                <table>
                    <tr>
                        <td style="color: #BEC25B;">Do not forget to ==></td>
                    <td><button type="submit" id="signInButton" style="font-family: cambria;" value="Log Out">Log out</button></td>
                    </tr>
                </table>
            </form>
        </div>
        
        <div id="head" style="width: 750px; height: 58px;"><h1 style="text-align: center; margin-top: 0px;">Basic Email System</h1></div><br>
        <div id="head" style="width: 750px; height: 58px; font-size: 19px;"><h1 style="text-align: center; margin-top: 0px;">Welcome <%=firstName%> <%=lastName%></h1></div>
        
        <div style="width: 250px; height: 500px; margin-top: 20px; float: left; margin-right: 50px;border: solid; border-color: #1F2C39;;">
            <form>
                <input id='newMessButton' type="button" value="New Message" onclick="loadNewMessageForm()">
            </form> <br>
            <form>
                <input class="MessOptions" type="button" value="Inbox" onclick="loadInbox()">
            </form><br>
            <form>
                <input class="MessOptions" type="button" value="Sent Messages" onclick="loadSentMessages()">
            </form><br>
            <form>
                <input class="MessOptions" type="button" value="Draft" onclick="loadDraftMessages()">
            </form><br>
            <form>
                <input class="MessOptions" type="button" value="Archived message" onclick="loadArchivedMessages()">
            </form><br>
        </div>
        
        <div id="showMessageBox" style=" width: 650px; height: 600px; margin-top: 20px; float: left; margin-left: 30px; border-color: red;border-radius: 10px;">
            <p style="font-family: High Tower Text; font-size: 20px;">Hello <b>Dear</b>, <br> Thank you for selecting our email system service. We really wish you will enjoy it.<br> The System is so easy to use.
                        You only need to:</p><br>
            <p style="font-family: High Tower Text; font-size: 30px; "><b>Choose one of the options in the left side buttons to see it!</b></p><br><br>
            <p style="color: green; font-size: 20px;"><b>${MessageSent}</b></p>
        </div>
        
        
        <div style=" width: 250px; height: 500px; margin-top: 20px; float: left; border: solid; margin-left:90px; border-color: #1F2C39;">
            <form>
                <input class="AccOptions" type="button" value="Edit Profile" onclick="loadUserProfile()">
            </form>
        </div><br>
        <div>
            <footer>
                <ul id="foot">
                    <li class="footLi"><a href="#">Contact Us</a></li>
                    <li class="footLi"><a href="#">FeedBack</a></li>
                    <li class="footLi"><a href="#">Site map</a></li>
                    <li class="footLi"><a href="#">About Us</a></li>
                </ul>
            </footer>
        </div>
    </body>
</html>
