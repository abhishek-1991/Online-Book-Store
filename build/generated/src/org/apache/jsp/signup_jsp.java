package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SignUp</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"siteBackground.jpg\">\n");
      out.write("        <h1><center><font size=\"7\" face=\"arial narrow\"> MyKart</font></center></h1>\n");
      out.write("        <br>\n");
      out.write("        <h2><center>Sign Up</center></h2>\n");
      out.write("        <form name=\"frm\" method=\"POST\" action=\"signsave.jsp\">\n");
      out.write("            <center><table border=\"0\" cellpadding=\"5\" cellspacing=\"5\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>* Name :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>* E-mail :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uname\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;&nbsp;Gender :</td>\n");
      out.write("                        <td><input type=\"radio\" name=\"gender\" value=\"male\" checked=\"checked\" />Male&nbsp;&nbsp;<input type=\"radio\" name=\"gender\" value=\"female\" checked=\"checked\" />Female</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;&nbsp;Date of Birth :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"date\" value=\"\" size=\"25\" />&nbsp;&nbsp;&nbsp;(dd-mm-yyyy)</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td valign=\"top\">* Address :</td>\n");
      out.write("                        <td><textarea name=\"address\" rows=\"3\" cols=\"30\">\n");
      out.write("                            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>* City :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"city\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>* Country :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"country\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;&nbsp;Phone No. :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"phno\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>* Password :</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" size=\"25\" />&nbsp;&nbsp;(Minimum 5 characters)</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>* Confirm Password :</td>\n");
      out.write("                        <td><input type=\"password\" name=\"cpass\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"right\"><input type=\"submit\" value=\"Submit\" name=\"Submit\" onclick=\"return valid()\"/></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"reset\" value=\"Reset\" name=\"Reset\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table></center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <center><i>Fields marked with * are mandatory.</i></center>\n");
      out.write("        <script language=\"Javascript\">\n");
      out.write("            function valid()\n");
      out.write("            {  \n");
      out.write("                if(document.frm.name.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter name!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                if(document.frm.address.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter Address!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                if(document.frm.city.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter City!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                  if(document.frm.country.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter City!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                  if(document.frm.pass.value.length<=\"5\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter Address!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                   if(document.frm.cpass.value.length<=\"5\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Password length should be greater than 5!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                   if(document.frm.pass.value!=document.frm.cpass.value)\n");
      out.write("                    {\n");
      out.write("                        alert(\"Password in the password and confirm password are not equal.\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    var apos=document.frm.uname.value.indexOf(\"@\");\n");
      out.write("                    var dotpos=document.frm.uname.value.lastIndexOf(\".\");\n");
      out.write("                   if(apos<1||dotpos-apos<2)\n");
      out.write("                     {\n");
      out.write("                         alert(\"Not a valid email Id :\");\n");
      out.write("                         document.frm.uname.focus();\n");
      out.write("                         return false; \n");
      out.write("                     }\n");
      out.write("                    \n");
      out.write("                  return true;\n");
      out.write("            }\n");
      out.write("            document.form[0].submit();\n");
      out.write("        </script>\n");
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
