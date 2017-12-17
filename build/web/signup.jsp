<%-- 
    Document   : signup
    Created on : Nov 12, 2011, 12:37:19 PM
    Author     : Vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>
    </head>
    <body background="siteBackground.jpg">
        <h1><center><font size="7" face="arial narrow"> MyKart</font></center></h1>
        <br>
        <h2><center>Sign Up</center></h2>
        <form name="frm" method="POST" action="signsave.jsp">
            <center><table border="0" cellpadding="5" cellspacing="5">
                <tbody>
                    <tr>
                        <td>* Name :</td>
                        <td><input type="text" name="name" value="" size="25" /></td>
                    </tr>
                    <tr>
                        <td>* E-mail :</td>
                        <td><input type="text" name="uname" value="" size="25" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;&nbsp;Gender :</td>
                        <td><input type="radio" name="gender" value="male" checked="checked" />Male&nbsp;&nbsp;<input type="radio" name="gender" value="female" checked="checked" />Female</td>
                    </tr>
                    <tr>
                        <td>&nbsp;&nbsp;Date of Birth :</td>
                        <td><input type="text" name="date" value="" size="25" />&nbsp;&nbsp;&nbsp;(dd-mm-yyyy)</td>
                    </tr>
                    <tr>
                        <td valign="top">* Address :</td>
                        <td><textarea name="address" rows="3" cols="30">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td>* City :</td>
                        <td><input type="text" name="city" value="" size="25" /></td>
                    </tr>
                    <tr>
                        <td>* Country :</td>
                        <td><input type="text" name="country" value="" size="25" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;&nbsp;Phone No. :</td>
                        <td><input type="text" name="phno" value="" size="25" /></td>
                    </tr>
                    <tr>
                        <td>* Password :</td>
                        <td><input type="password" name="pass" value="" size="25" />&nbsp;&nbsp;(Minimum 5 characters)</td>
                    </tr>
                    <tr>
                        <td>* Confirm Password :</td>
                        <td><input type="password" name="cpass" value="" size="25" /></td>
                    </tr>
                    <tr>
                        <td align="right"><input type="submit" value="Submit" name="Submit" onclick="return valid()"/></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" name="Reset" /></td>
                    </tr>
                </tbody>
            </table></center>

        </form>
        <center><i>Fields marked with * are mandatory.</i></center>
        <script language="Javascript">
            function valid()
            {  
                if(document.frm.name.value=="")
                    {
                        alert("Please enter name!!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                if(document.frm.address.value=="")
                    {
                        alert("Please enter Address!!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                if(document.frm.city.value=="")
                    {
                        alert("Please enter City!!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                  if(document.frm.country.value=="")
                    {
                        alert("Please enter City!!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                  if(document.frm.pass.value.length<"5")
                    {
                        alert("Please enter Address!!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                   if(document.frm.cpass.value.length<="5")
                    {
                        alert("Password length should be greater than 5!!!!");
                        document.frm.pass.focus();
                        return false;
                    }
                   if(document.frm.pass.value!=document.frm.cpass.value)
                    {
                        alert("Password in the password and confirm password are not equal.");
                        return false;
                    }
                    var apos=document.frm.uname.value.indexOf("@");
                    var dotpos=document.frm.uname.value.lastIndexOf(".");
                   if(apos<1||dotpos-apos<2)
                     {
                         alert("Not a valid email Id :");
                         document.frm.uname.focus();
                         return false; 
                     }
                    
                  return true;
            }
            document.form[0].submit();
        </script>
    </body>
</html>
