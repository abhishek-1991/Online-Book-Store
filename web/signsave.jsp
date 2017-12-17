
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,sun.jdbc.odbc.*" session="true"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%  Connection con;
          Statement stmt;
            String n=request.getParameter("name");
            String e=request.getParameter("uname");
            String g=request.getParameter("gender");
            String d=request.getParameter("date");
            String a=request.getParameter("address");
            String ci=request.getParameter("city");
            String co=request.getParameter("country");
            String ph=request.getParameter("phno");
            String pa=request.getParameter("pass");
        try {          
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:aks");
                stmt=con.createStatement();
                stmt.executeUpdate("insert into login(name,email,password,address,city,country,phoneno,dob,gender) values('"+n+"','"+e+"','"+pa+"','"+a+"','"+ci+"','"+co+"','"+ph+"','"+d+"','"+g+"')");
                //con.close();
                }
        catch(ClassNotFoundException c)
                {}
        catch(SQLException s)
                {}
            HttpSession hs=request.getSession();
            hs.setAttribute("UserName", n);
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
                %>
       
    </body>
</html>
