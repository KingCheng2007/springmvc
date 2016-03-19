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
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function del(id) {
		$.get("user/delUser?id=" + id,
				function(data) {
					if ("success" == data.result) {
						alert("删除成功");
						window.location.reload();
					} else {
						alert("删除失败");
					}
				});
	}
</script>
</head>
<body>
	<h6>
		<a href="user/toAddUser">添加用户</a>
	</h6>
	<table border="1">
		<tbody>
			<tr>
				<th>姓名</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
			<c:if test="${!empty userList }">
				<c:forEach items="${userList }" var="user">
					<tr>
						<td>${user.userName }</td>
						<td>${user.age }</td>
						<td><a href="user/getUser?id=${user.id }">编辑</a> <a
							href="javascript:del('${user.id }')">删除</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>
