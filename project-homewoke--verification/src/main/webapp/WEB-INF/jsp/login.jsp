<%--
  Created by IntelliJ IDEA.
  User: logictwilight
  Date: 2023/5/10
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="${ pageContext.request.contextPath }/login" method="post">
        <div>${msg}</div>
        用户名：<input type="text" name="username" /><br />
        密&nbsp;&nbsp;码：<input type="password" name="password" /><br />
        <input type="submit" value="登录" />
    </form>
</body>
</html>
