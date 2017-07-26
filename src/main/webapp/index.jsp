<%--
  Created by IntelliJ IDEA.
  User: 袁浩越
  Date: 2017/7/25 0025
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action='${pageContext.request.contextPath }/login' method="post">
        手机号码：<input type="text" name="phonenumber"/>
        <br>
        密码：<input type="password" name="password"/>
        <br>
        <input type="submit" value="确定">
    </form>
    <br>

    <a href="/toRegister">注册</a>
    <br>
    <a href="/index">asdaksdaskhd</a>

</body>
</html>
