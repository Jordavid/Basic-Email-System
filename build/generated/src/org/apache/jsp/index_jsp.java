package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Easy Email System | Welcome page</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"iconmail.ico\">\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/ValideForm.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\">\n");
      out.write("        <script src=\"JavaScript/jquery-2.1.3.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (){\n");
      out.write("                $(\"#login\").hide();\n");
      out.write("                $(\"#signInButton\").click(function (){\n");
      out.write("                   $(\"#login\").toggle(200);\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            session.invalidate();
        
      out.write("\n");
      out.write("        <div id=\"alHaveAcc\">\n");
      out.write("            I already have an account ==>\n");
      out.write("            <button id=\"signInButton\" style=\"font-family: cambria;\">Sign In</button>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"login\">\n");
      out.write("            <form action=\"SignIn\" method=\"post\" onsubmit=\"return LoginCheck(this)\">\n");
      out.write("            <center>\n");
      out.write("            <table border=\"1\" cellpadding=\"5\" cellspacing=\"2\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"email\" name=\"lEmail\" placeholder=\"abcd@domain\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"lPass\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Login\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("                <p style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        </form>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"head\" style=\"width: 750px; height: 58px;\"><h1 style=\"text-align: center; margin-top: 0px;\">Welcome to Easy Email System</h1></div>\n");
      out.write("        <div class=\"Description\">\n");
      out.write("            \n");
      out.write("            <p style=\"font-family: Lucida Bright;\">This is you best web page to have a full control of your Mail Account.<br>\n");
      out.write("               We provide the following services and functionalities:</p>\n");
      out.write("            <ul style=\"font-family: Lucida Bright;\">\n");
      out.write("                <li>Send Email to a single destination.</li>\n");
      out.write("                <li>Send Email to multiple destinations.</li>\n");
      out.write("                <li>Receive Email.</li>\n");
      out.write("                <li>Edit User Profile.</li>\n");
      out.write("                <li>View, Reply, Forward, Delete, and Archive messages.</li>\n");
      out.write("                <li>Very Personalized and Custom Page.</li>\n");
      out.write("            </ul>\n");
      out.write("        </div><br><br>\n");
      out.write("        <p style=\"font-family: Lucida Bright;\">You only need to Sign Up and Enjoy our service or click on <b>Sign In</b> button above if you already have an account.</p>\n");
      out.write("        <div id=\"signUp\">\n");
      out.write("            <form action=\"SignUpUser\" method=\"post\" onsubmit=\"return SignUpCheck(this);\">\n");
      out.write("            <center>\n");
      out.write("                <p style=\"color: chartreuse; font-size: 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${successMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <table border=\"1\" cellpadding=\"5\" cellspacing=\"2\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\" align=\"center\">Sign Up here</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>First Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" placeholder=\"first name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Last Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"lname\" placeholder=\"last name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uname\" placeholder=\"username\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"email\" name=\"email\" placeholder=\"abcd@domain\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td>Male<input type=\"radio\" name=\"gender\" id=\"male\" value=\"male\">\n");
      out.write("                            Female<input type=\"radio\" name=\"gender\" id=\"female\" value=\"female\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"password1\" id=\"pass1\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Confirm Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"password2\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Sign up\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <footer>\n");
      out.write("                <ul id=\"foot\">\n");
      out.write("                    <li class=\"footLi\"><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    <li class=\"footLi\"><a href=\"#\">FeedBack</a></li>\n");
      out.write("                    <li class=\"footLi\"><a href=\"#\">Site map</a></li>\n");
      out.write("                    <li class=\"footLi\"><a href=\"#\">About Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
