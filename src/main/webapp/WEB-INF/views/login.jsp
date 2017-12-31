<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<c:url var="loginUrl" value="/login"/>
<form name="frm" action="${loginUrl}" method="POST">
    <!-- spring security 4.0이상의 버전부터는 CSRF방지 기능이 작동하고 있기 때문에 PATCH, POST, PUT, DELETE 요청에 CSRF 토큰을 포함해야한다 -->
    <!-- 스프링 폼태그를 사용하는 폼 ex: <form ... 은 자동으로 토큰 파라미터가 추가되므로 위 코드가 필요없다-->
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <table>
        <tr>
            <td>Username:</td>
            <td><input type='text' name='email'/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'></td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit">&nbsp;<input name="reset" type="reset"></td>
        </tr>
    </table>
</form>