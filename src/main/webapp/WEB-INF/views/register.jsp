<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/26 0026
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

    <form:form action='/register' method="post" modelAttribute="user">
        用户名：<form:input path="username"/><form:errors path="username"/>
        <br>
        手机号码：<form:input path="phonenumber"/><form:errors path="phonenumber"/>
        <br>
        密码：<form:password path="password"/><form:errors path="password"/>
        <br>
        <input type="submit" value="确定">
    </form:form>

</body>
</html>
