<%--
  Created by IntelliJ IDEA.
  User: jihoonlee
  Date: 2017. 12. 22.
  Time: 오후 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>hello login page</title>
</head>
<body>
<form name='f' action='/admin/j_spring_security_check' method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='loginId' id="loginId" value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='loginPassWord' id="loginPassWord"/></td>
        </tr>
        <tr>
            <td><input type='checkbox' name='_spring_security_remember_me'/></td>
            <td>Remember me on this computer.</td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit"/></td>
        </tr>
        <tr>
            <td colspan='2'><input name="reset" type="reset"/></td>
        </tr>
    </table>
</form>

</body>
</html>
