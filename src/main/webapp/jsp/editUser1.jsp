<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<%
	String path = request.getContextPath();
%>
<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>编辑用户</h1>
	<form action="/ecmobile/user/updateUser"
		name="userForm" method="post">
		<input type="hidden" name="id" value="${user.id }"> 姓名：<input
			type="text" name="userName" value="${user.userName }"> 年龄：<input
			type="text" name="age" value="${user.age }"> <input
			type="submit" value="编辑">
	</form>
</body>
</html>
