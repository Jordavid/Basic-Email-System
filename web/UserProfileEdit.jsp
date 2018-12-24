<%-- 
    Document   : UserProfileEdit
    Created on : Dec 30, 2015, 5:02:09 AM
    Author     : JorDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="JavaScript/ValideForm.js"></script>
        <link rel="stylesheet" type="text/css" href="index.css">
        <script src="JavaScript/jquery-2.1.3.min.js"></script>
        <title>Basic Email System | User Profile.</title>
        <script>
            $(document).ready(function (){
                $("input").prop("disabled", true); 
                $("#EditButton").click(function (){
                    $("input").prop("disabled", false);
                });
            });
        </script>
    </head>
    <body>
        <%
            String fistName = (String) session.getAttribute("SessfName");  
            String lastName = (String) session.getAttribute("SesslName");  
            String email = (String) session.getAttribute("sessionlEmail");  
            String password = (String) session.getAttribute("sessPassword");
            String uname = (String) session.getAttribute("sessUname");
            String gender = (String) session.getAttribute("sessGender");
        %>
        <h1>User Profile</h1>
        <form  method="POST" action="UpdateUserProfile">
            <table border="1">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" value="<%=fistName%>" name="fname" id="fname"></td>
                    </tr>
                <tr>
                    <td>Last Name</td>  
                    <td><input type="text" value="<%=lastName%>" name="lname" ></td>
                </tr>
                    <td>Username</td>
                    <td><input type="text" name="uname" value="<%=uname%>" disabled="disabled"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="<%=email%>" disabled="disabled"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="text" value="<%=gender%>" disabled></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" value="<%=password%>" name="password1"></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td><input type="password" value="<%=password%>" name="password2"></td>
                </tr>
                <tr><button type="button" id="EditButton" name="EditButton">Edit</button></tr>
            <tr><td colspan="2" style="text-align: center;"><input type="submit" value="Save" onclick="return SignUpCheck(this);"></td></tr>
            </table>
        </form>
    </body>
</html>
