package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Basic Email System | Home page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/ValideForm.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\">\n");
      out.write("        <script src=\"JavaScript/jquery-2.1.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function loadNewMessageForm(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"newMessageForm.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        function loadInbox(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"inbox.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        \n");
      out.write("        function loadSentMessages(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"sentMessages.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        function loadDraftMessages(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"draft.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        function loadDeletedMessages(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"deletedMessages.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        function loadArchivedMessages(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"archivedMessages.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        \n");
      out.write("        function loadUserProfile(){\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            \n");
      out.write("            xmlhttp.open(\"GET\", \"UserProfileEdit.jsp\", true);\n");
      out.write("            xmlhttp.send();\n");
      out.write("            \n");
      out.write("            xmlhttp.onreadystatechange= function (){\n");
      out.write("                if(xmlhttp.readyState === 4 && xmlhttp.status === 200){\n");
      out.write("                    document.getElementById(\"showMessageBox\").innerHTML=xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        };\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        ");

            String firstName = (String) session.getAttribute("SessfName");
            String lastName = (String) session.getAttribute("SesslName");
        
      out.write("\n");
      out.write("        <div id=\"alHaveAcc\">\n");
      out.write("            <form action=\"index.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"color: #BEC25B;\">Do not forget to ==></td>\n");
      out.write("                    <td><button type=\"submit\" id=\"signInButton\" style=\"font-family: cambria;\" value=\"Log Out\">Log out</button></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"head\" style=\"width: 750px; height: 58px;\"><h1 style=\"text-align: center; margin-top: 0px;\">Basic Email System</h1></div><br>\n");
      out.write("        <div id=\"head\" style=\"width: 750px; height: 58px; font-size: 19px;\"><h1 style=\"text-align: center; margin-top: 0px;\">Welcome ");
      out.print(firstName);
      out.write(' ');
      out.print(lastName);
      out.write("</h1></div>\n");
      out.write("        \n");
      out.write("        <div style=\"width: 250px; height: 500px; margin-top: 20px; float: left; margin-right: 50px;border: solid; border-color: #1F2C39;;\">\n");
      out.write("            <form>\n");
      out.write("                <input id='newMessButton' type=\"button\" value=\"New Message\" onclick=\"loadNewMessageForm()\">\n");
      out.write("            </form> <br>\n");
      out.write("            <form>\n");
      out.write("                <input class=\"MessOptions\" type=\"button\" value=\"Inbox\" onclick=\"loadInbox()\">\n");
      out.write("            </form><br>\n");
      out.write("            <form>\n");
      out.write("                <input class=\"MessOptions\" type=\"button\" value=\"Sent Messages\" onclick=\"loadSentMessages()\">\n");
      out.write("            </form><br>\n");
      out.write("            <form>\n");
      out.write("                <input class=\"MessOptions\" type=\"button\" value=\"Draft\" onclick=\"loadDraftMessages()\">\n");
      out.write("            </form><br>\n");
      out.write("            <form>\n");
      out.write("                <input class=\"MessOptions\" type=\"button\" value=\"Archived message\" onclick=\"loadArchivedMessages()\">\n");
      out.write("            </form><br>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"showMessageBox\" style=\" width: 650px; height: 600px; margin-top: 20px; float: left; margin-left: 30px; border-color: red;border-radius: 10px;\">\n");
      out.write("            <p style=\"font-family: High Tower Text; font-size: 20px;\">Hello <b>Dear</b>, <br> Thank you for selecting our email system service. We really wish you will enjoy it.<br> The System is so easy to use.\n");
      out.write("                        You only need to:</p><br>\n");
      out.write("            <p style=\"font-family: High Tower Text; font-size: 30px; \"><b>Choose one of the options in the left side buttons to see it!</b></p><br><br>\n");
      out.write("            <p style=\"color: green; font-size: 20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MessageSent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div style=\" width: 250px; height: 500px; margin-top: 20px; float: left; border: solid; margin-left:90px; border-color: #1F2C39;\">\n");
      out.write("            <form>\n");
      out.write("                <input class=\"AccOptions\" type=\"button\" value=\"Edit Profile\" onclick=\"loadUserProfile()\">\n");
      out.write("            </form>\n");
      out.write("        </div><br>\n");
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
