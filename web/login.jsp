<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%try {  String uname=request.getParameter("name");
                String pass=request.getParameter("pass");
                String name="";
                int flag=0;
                Connection con;
                Statement stmt;
                ResultSet rs;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:aks");
                stmt=con.createStatement();
                rs=stmt.executeQuery("select name,email,password from login");
                while(rs.next())
                {   
                    if(uname.equals(rs.getString(2))&&pass.equals(rs.getString(3)))
                    {   flag=1;
                        name=rs.getString(1)+"\t";
                        break;
                    }
                }
                if(flag==1)
                {
                    HttpSession hs=request.getSession();
                    hs.setAttribute("UserName", name);
                    RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
                    rd.forward(request, response);
                }
                else
                {
                   RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);
                }

        }
        catch(ClassNotFoundException e)
        {}
        catch(SQLException s)
        {} %>
    </body>
</html>
