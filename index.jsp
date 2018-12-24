<%-- 
    Document   : index
    Created on : Dec 13, 2015, 2:27:07 PM
    Author     : JorDavid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Easy Email System | Welcome page</title>
        <link rel="shortcut icon" href="iconmail.ico">
        <script type="text/javascript" src="JavaScript/ValideForm.js"></script>
        <link rel="stylesheet" type="text/css" href="index.css">
        <script src="JavaScript/jquery-2.1.3.min.js"></script>
        <script>
            $(document).ready(function (){
                $("#login").hide();
                $("#signInButton").click(function (){
                   $("#login").toggle(200);
               });
            });
        </script>
    </head>
    <body>
        <%
            session.invalidate();
        %>
        <div id="alHaveAcc">
            I already have an account ==>
            <button id="signInButton" style="font-family: cambria;">Sign In</button>
        </div>
        <div id="login">
            <form action="SignIn" method="post" onsubmit="return LoginCheck(this)">
            <center>
            <table border="1" cellpadding="5" cellspacing="2">
                <tbody>
                    <tr>
                        <td>Email</td>
                        <td><input type="email" name="lEmail" placeholder="abcd@domain"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="lPass"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Login"></td>
                    </tr>
                </tbody>
            </table>
            </center>
                <p style="color: red;">${errorMsg}</p>
        </form>
            <br>
        </div>
        <div id="head" style="width: 750px; height: 58px;"><h1 style="text-align: center; margin-top: 0px;">Welcome to Easy Email System</h1></div>
        <div class="Description">
            
            <p style="font-family: Lucida Bright;">This is you best web page to have a full control of your Mail Account.<br>
               We provide the following services and functionalities:</p>
            <ul style="font-family: Lucida Bright;">
                <li>Send Email to a single destination.</li>
                <li>Send Email to multiple destinations.</li>
                <li>Receive Email.</li>
                <li>Edit User Profile.</li>
                <li>View, Reply, Forward, Delete, and Archive messages.</li>
                <li>Very Personalized and Custom Page.</li>
            </ul>
        </div><br><br>
        <p style="font-family: Lucida Bright;">You only need to Sign Up and Enjoy our service or click on <b>Sign In</b> button above if you already have an account.</p>
        <div id="signUp">
            <form action="SignUpUser" method="post" onsubmit="return SignUpCheck(this);">
            <center>
                <p style="color: chartreuse; font-size: 20px;">${successMsg}</p>
            <table border="1" cellpadding="5" cellspacing="2">
                <thead>
                    <tr>
                        <th colspan="2" align="center">Sign Up here</th>
                    </tr>
                </thead
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fname" placeholder="first name"></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" placeholder="last name"></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="uname" placeholder="username"></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="email" name="email" placeholder="abcd@domain"></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>Male<input type="radio" name="gender" id="male" value="male">
                            Female<input type="radio" name="gender" id="female" value="female"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password1" id="pass1"></td>
                    </tr>
                    <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" name="password2"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Sign up"></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
        </div>
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
