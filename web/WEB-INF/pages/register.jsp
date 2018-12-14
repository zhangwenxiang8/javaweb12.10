<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/12
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="doRegister" method="post">    <%--握手链接名: register--%>
    用户名:<input type="text" name="username">
    <br>
    密码: <input type="password" name="pwd">
    <br>
    确认密码: <input type="password" name="pwds">
    <br>
    手机: <<input type="text" name="tele">
    <br>
    <input type="submit" value="注册">
</form>
</body>
</html>
