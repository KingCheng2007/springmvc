<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<%
	String path = request.getContextPath();
	System.out.println("<><>"+path);
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	System.out.println("<><>"+basePath); 
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
<script type="text/javascript">
	function addUser() {
		var form = document.forms[0];
		form.action = "user/addUser";
		form.method = "post";
		form.submit();
	}
</script>
</head>
<body>
	<h1>添加用户</h1>
	<form action="" name="userForm">
		姓名：<input type="text" name="userName"> 年龄：<input type="text"
			name="age"> <input type="button" value="添加"
			onclick="addUser()">
	</form>
</body>
</html>
