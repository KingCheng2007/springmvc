<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<base href="<%=basePath%>">
<title>首页</title>
<%@ include file="header.html"%>
</head>

<body>
	<%@ include file="nav.jsp"%>
	<div class="container"></div>
	<%@ include file="footer.html"%>
</body>

</html>
