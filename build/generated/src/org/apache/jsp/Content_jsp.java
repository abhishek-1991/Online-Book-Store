package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String p;
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
      out.write("    </head>\n");
      out.write("    <body background=\"siteBackground.jpg\"><pre><font color=\"black\"><p align=\"right\"><a href=\"\">Home</a> | <a href=\"\">Contact Us</a></font> </pre>\n");
      out.write("        <h1><center><font size=\"7\" face=\"arial narrow\"> MyKart</font></center></h1>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <table width=\"100%\" >\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"20%\" height=\"500\" valign=\"top\">\n");
      out.write("                        <ul type=\"disc\">\n");
      out.write("             <br>\n");
      out.write("              <br>\n");
      out.write("              <h3>Categories in Books</h3>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=arts\">Arts, Photography and Design </a></li>\n");
      out.write("            <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=biography\">Biographies & Autobiographies </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=computer\">Computers & Internet</a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=educational\">Educational and Professional </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=health\">Health and Fitness </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=history\">History and Politics </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=literature\">Literature & Fiction</a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=philosophy\">Philosophy </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=science\">Science & Technology </a></li>\n");
      out.write("             <br>\n");
      out.write("            <li><a href=\"http://localhost:8080/Online_Book_Store/Content.jsp?cate=sports\">Sports and Games </a></li>\n");
      out.write("             <br>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("                    </td>\n");
      out.write("                    <td width=\"80%\" align=\"left\" valign=\"top\">\n");
      out.write("        ");
 String c=request.getParameter("cate");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            if(c.equals("arts"))
                p="Arts, Photography and Design";
            else{ if(c.equals("biography"))
                    p="Biographies & Autobiographies";
                   else {if(c.equals("computer"))
                            p="Computers & Internet";
                          else {if(c.equals("educational"))
                                  p="Educational and Professional";
                                 else{if(c.equals("health"))
                                        p="Health and Fitness";
                                      else{ if(c.equals("literature"))
                                                p="Literature & Fiction";
                                            else{if(c.equals("philosophy"))
                                                    p="Philosophy";
                                                 else{if(c.equals("science"))
                                                        p="Science & Technology";
                                                       else{if(c.equals("history"))
                                                                p="History and Politics";
                                                            else
                                                                p="Sports and Games";}}}}}}}}
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
  int i=0;
            try{
                Connection con;
                Statement stmt;
                ResultSet rs;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:aks");
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from books where category='"+c+"'");
        
      out.write("\n");
      out.write("         <p align=\"left\" fontsize=\"6\">Books listed in <b>");
      out.print(p);
      out.write("</b> Category:</p>\n");
      out.write("        <table border=\"0\" cellspacing=\"2\" align=\"left\">\n");
      out.write("               \n");
      out.write("                ");
while(rs.next()&& i<=10)
                {   
                    String isbn=rs.getString(1);
                    out.println("<br>");
                    out.println("<tr>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("<td align=\"right\"> By: "+rs.getString(3)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td><img src=\""+rs.getString(6)+"\" width=100 height=100/></td>");
                    out.println("<td>"+rs.getString(7)+"</td>");
                out.println("</tr>");
                out.println("<tr>");
                    out.println("<td><form method='post' action=\"\">");
                    out.println("<input type=\"hidden\" name=\"product\" value=\""+isbn+"\">");
                    out.println("<input type=\"submit\" value=\"Add To Cart\" name=\"add\"/>");
                    out.println("<td>Price:"+rs.getString(4)+"&nbsp;&nbsp;&nbsp;ISBN:"+isbn+"</td>");
                out.println("</tr>");               
                out.println("<tr>");
                out.println("<td><br></td>");
                out.println("</tr>");
                i++;
                }}catch(Exception e)
                        {out.println("Exception");}
                 
      out.write("\n");
      out.write("             \n");
      out.write("         \n");
      out.write("            \n");
      out.write("        </table></td>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
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
