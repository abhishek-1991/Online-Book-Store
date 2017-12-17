<%-- 
    Document   : welcome
    Created on : Nov 12, 2011, 4:15:21 PM
    Author     : Vaibhav
--%>
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body background="siteBackground.jpg"><pre><font color="black"><p align="right"> <a href="logout.jsp">logout</a>||<a href="">Contact Us</a></font> </pre>
        <h1><center><font size="7" face="arial narrow"> MyKart</font></center></h1>
        <br>
        <%HttpSession hs=request.getSession(false);%>
        <%
            if(hs == null)
                {
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);
                }
        %>
        <h3>Welcome <%=hs.getAttribute("UserName")%></h3>
        <table width="100%" >
            <tbody>
                <tr>
                    <td width="25%" height="500" valign="top">
                        <ul type="disc">
             <br>
              <br>
              <h3>Categories in Books</h3>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=arts">Arts, Photography and Design </a></li>
            <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=biography">Biographies & Autobiographies </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=computer">Computers & Internet</a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=educational">Educational and Professional </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=health">Health and Fitness </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=history">History and Politics </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=literature">Literature & Fiction</a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=philosophy">Philosophy </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=science">Science & Technology </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/welcome.jsp?cate=sports">Sports and Games </a></li>
             <br>

        </ul>
                    </td>
                    <td width="80%" align="left" valign="top">
        <% String c=request.getParameter("cate");%>
        <% if(c==null)
               {c="arts";}         %>
        <%! String p;%>
        <%
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
        %>

        <%  int i=0;
            try{
                Connection con;
                Statement stmt;
                ResultSet rs;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:aks");
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from books where category='"+c+"'");
        %>
        <h3>Books listed in <u><b><%=p%></b></u> Category:</h3>
         <br>
         <table border="0" cellspacing="2" align="left" align="top">
                <%while(rs.next()&& i<=10)
                {
                    String isbn=rs.getString(1);
                    out.println("<tr>");
                    out.println("<td><b>"+rs.getString(2)+"</b></td>");
                    out.println("<td align=\"right\"> By: "+rs.getString(3)+"</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<td><img src=\""+rs.getString(6)+"\" width=100 height=100/></td>");
                    out.println("<td>"+rs.getString(7)+"</td>");
                out.println("</tr>");
                out.println("<tr>");
                    out.println("<td><form method='post' action=\"\">");
                    out.println("<input type=\"hidden\" name=\"product\" value=\""+isbn+"\">");
                    out.println("<input type=\"submit\" value=\"Add To Cart\" name=\"add\"/></td>");
                    out.println("<td>Price:"+rs.getString(4)+"&nbsp;&nbsp;&nbsp;&nbsp;ISBN:"+isbn+"</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><br></td>");
                out.println("</tr>");
                i++;
                }}catch(Exception e)
                        {out.println("Exception");}
                 %>



        </table></td>
            </tbody>
        </table>
    </body>
</html>
