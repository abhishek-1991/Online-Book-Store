<%-- 
    Document   : logout
    Created on : Mar 12, 2012, 4:23:47 PM
    Author     : Vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body background="siteBackground.jpg">
        <h1><center><font size="7" face="arial narrow"> MyKart</font></center></h1>
        <%HttpSession hs=request.getSession(false);
            if(hs!=null)
                hs.invalidate();
        %>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        
        
                <h2><center>You have logged out successfully!!!!</center></h2>
                <h4><center>To log in :<a href="index.jsp">CLICK HERE!</a></center></h4>
    </body>
</html>
