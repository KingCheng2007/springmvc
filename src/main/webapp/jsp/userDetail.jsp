<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	session="true"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<base href="<%=basePath%>">
<title>用户信息</title>
<%@ include file="header.html"%>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div align="center" class="container">
		<div align="left">
			<ol class="breadcrumb">
				<li><a href="ecmobile/index.jsp">首页</a></li>
				<li class="active">查询管理</li>
				<li class="active">用户信息</li>
			</ol>
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">用户名</span>
			<input type="text" class="form-control" id="regedname"
				aria-describedby="basic-addon1" value="${customerUser.userName}">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">原始密码</span>
			<input type="text" class="form-control" id="regedpwd"
				aria-describedby="basic-addon1" value="${customerUser.password}">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">新密码</span>
			<input type="text" class="form-control" id="regedrepwd"
				aria-describedby="basic-addon1">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">确认新密码</span>
			<input type="text" class="form-control" id="regednrepwd"
				aria-describedby="basic-addon1">
		</div>
		<div style="border: 1px">&nbsp;</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">公司名称</span>
			<input type="text" class="form-control" id="regednrepwd"
				aria-describedby="basic-addon1" value="${crmCustomer.customerName}">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">公司邮箱</span>
			<input type="text" class="form-control" id="regednrepwd"
				aria-describedby="basic-addon1" value="${customerUser.userMail}">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">联系人</span>
			<input type="text" class="form-control" id="regednrepwd"
				aria-describedby="basic-addon1" value="${customerUser.linkName}">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">联系电话</span>
			<input type="text" class="form-control" id="regednrepwd"
				aria-describedby="basic-addon1" value="${customerUser.linkTel}">
		</div>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1" style="width: 95px">短信验证</span>
			<input type="text" class="form-control" id="regednrepwd"
				aria-describedby="basic-addon1" value="${customerUser.linkTel}">
		</div>
	</div>
</body>
<%@ include file="footer.html"%>
</html>
