<%-- 
    Document   : index
    Created on : Sep 21, 2011, 4:31:20 PM
    Author     : Vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MyKart</title>
        
    </head>
    <body background="siteBackground.jpg"><pre><p align="right"><a href="">Contact Us</a></p></pre>
        <h1><center><font size="7" face="arial narrow"> MyKart</font></center></h1>
        <table>
            <tr>
                <td width="25%" valign="top">
        <ul type="disc">
             <br>
              <br>
              <h3>Categories in Books</h3>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=arts">Arts, Photography and Design </a></li>
            <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=biography">Biographies & Autobiographies </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=computer">Computers & Internet</a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=educational">Educational and Professional </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=health">Health and Fitness </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=history">History and Politics </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=literature">Literature & Fiction</a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=philosophy">Philosophy </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=science">Science & Technology </a></li>
             <br>
            <li><a href="http://localhost:8080/Online_Book_Store/Content.jsp?cate=sports">Sports and Games </a></li>
             <br>
            
        </ul>
                </td>
                <td width="15%" align="right" valign="top">
                    
                    <form name="frm" action="login.jsp" method="POST">
                        <table cellpadding="3" align="right">
                            <thead>
                            <th></th>
                            <th align="left"><strong>Login</strong></th>
                            </thead>
                            <tr align="right">
                                <td>UserID :</td>
                                <td><input type="text" name="name" value="" size="20" /></td>
                            </tr>
                            <tr align="right">
                                <td>Password :</td>
                                <td><input type="password" name="pass" value="" size="20" /></td>
                            </tr>
                            <tr align="right">
                                <td></td>
                                <td align="left"><input type="submit" value="Submit" name="Submit" onclick="return valid()"/></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td align="left"><a href="signup.jsp">SignIn</a></td>
                            </tr>
                        </table>
                    </form>
        </tr>
        </table>
        <script language="JavaScript">
            function valid()
            {
                if(document.frm.name.value=="")
                    {
                        alert("Please enter your name!!!");
                        return false;
                    }
                if(document.frm.pass.value.length<=5)
                    {
                        alert("please enter password!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                 return true;
            }
            document.form[0].submit();
        </script>
    </body>
</html>
