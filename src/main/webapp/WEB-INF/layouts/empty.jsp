<%--
  Created by IntelliJ IDEA.
  User: jihoonlee
  Date: 2017. 12. 31.
  Time: 오후 4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:getAsString name="title"/></title>
    <link href="<c:url value='/assets/css/bootstrap.css' />" rel="stylesheet"/>

    <link href="<c:url value='${pageContext.request.contextPath}/assets/css/app.css' />" rel="stylesheet"/>
</head>


<body>

<section id="login-content">
    <tiles:insertAttribute name="body"/>
</section>

</body>
</html>