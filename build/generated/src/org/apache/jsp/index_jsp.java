package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MyKart</title>\n");
      out.write("         <script language=\"Java Script\">\n");
      out.write("            function valid()\n");
      out.write("            {\n");
      out.write("                if(document.frm.name.value=\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter your name!!!\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                if(document.frm.pass.value.length<5)\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter your name!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                 return true;\n");
      out.write("            }\n");
      out.write("            document.form[0].submit();\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"siteBackground.jpg\"><pre><p align=\"right\"><a href=\"\">Home</a> | <a href=\"\">Contact Us</a> </pre>\n");
      out.write("        <pre><p align=\"right\"><a href=\"\">Login</a> | <a href=\"\">Signup</a></p></pre>\n");
      out.write("        <h1><center><font size=\"7\" face=\"arial narrow\"> MyKart</font></center></h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"25%\" valign=\"top\">\n");
      out.write("        <ul type=\"disc\">\n");
      out.write("             <br>\n");
      out.write("              <br>\n");
      out.write("              <h3>Categories in Books</h3>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=arts\" target=\"_blank\">Arts, Photography and Design </a></li>\n");
      out.write("            <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=biography\" target=\"_blank\">Biographies & Autobiographies </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=computer\" target=\"_blank\">Computers & Internet</a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=educational\" target=\"_blank\">Educational and Professional </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=health\" target=\"_blank\">Health and Fitness </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=history\" target=\"_blank\">History and Politics </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=literature\" target=\"_blank\">Literature & Fiction</a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=philosophy\" target=\"_blank\">Philosophy </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=science\" target=\"_blank\">Science & Technology </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=sports\" target=\"_blank\">Sports and Games </a></li>\n");
      out.write("             <br>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"15%\" align=\"right\" valign=\"top\">\n");
      out.write("                    \n");
      out.write("                    <form name=\"frm\" action=\"login.java\" method=\"POST\">\n");
      out.write("                        <table cellpadding=\"3\" align=\"right\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th></th>\n");
      out.write("                            <th align=\"left\" fontsize=\"6\"><strong>Login</strong></th>\n");
      out.write("                            </thead>\n");
      out.write("                            <tr align=\"right\">\n");
      out.write("                                <td>UserID :</td>\n");
      out.write("                                <td><input type=\"text\" name=\"name\" value=\"\" size=\"20\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr align=\"right\">\n");
      out.write("                                <td>Password :</td>\n");
      out.write("                                <td><input type=\"password\" name=\"pass\" value=\"\" size=\"20\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr align=\"right\">\n");
      out.write("                                <td></td>\n");
      out.write("                                <td align=\"left\"><input type=\"submit\" value=\"Submit\" name=\"Submit\" onclick=\"return valid()\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td align=\"left\"><a href=\"signup.jsp\">SignIn</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
