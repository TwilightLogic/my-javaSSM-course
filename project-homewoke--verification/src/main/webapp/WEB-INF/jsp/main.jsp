<%--
  Created by IntelliJ IDEA.
  User: logictwilight
  Date: 2023/5/10
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台系统</title>
</head>
<body>
    <li>您好：${ USER_SESSION.username }</li>
    <li><a href="${ pageContext.request.contextPath }/logout">退出</a></li>
    <li><a href="${ pageContext.request.contextPath }/orderinfo">订单信息</a></li>
</body>
</html>
