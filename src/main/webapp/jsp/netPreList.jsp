<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<base href="<%=basePath%>">
<%@ include file="header.html"%>

<title>唐山曹妃甸实业矿石港务有限公司</title>
</head>

<body>
	<div class="container">
	<%@ include file="nav.jsp"%>
		<div align="left">
			<ol class="breadcrumb">
				<li><a href="sign">首页</a></li>
				<li class="active">网上预到</li>
			</ol>
		</div>
		<table  id="tableId"
				class="table table-hover table-striped table-condensed"
				data-toggle="table" 
				data-url="netPre/toJson" 
				data-search="true"
				data-show-refresh="true"
				data-show-toggle="true"
				data-show-columns="true"
				data-row-style="rowStyle"
				data-flat="true"
				data-pagination="true">
			<thead>
				<tr>
					<th data-field="boatCnName" data-sortable="true" data-halign="center" data-align="center" data-switchable="false">中文船名</th>
					<th data-field="boatEnName" data-sortable="true" data-halign="center" data-align="center" data-switchable="false">英文船名</th>
					<th data-field="hzName" data-sortable="true" data-halign="center" data-align="center">货主名称</th>
					<th data-field="hdName" data-sortable="true" data-halign="center" data-align="center">货代名称</th>
					<th data-field="cdName" data-sortable="true" data-halign="center" data-align="center">船代名称</th>
					<th data-field="mineName" data-sortable="true" data-halign="center" data-align="center">货种</th>
					<th data-field="status" data-sortable="true" data-halign="center" data-align="center">状态</th>
					<th data-field="boatPos" data-sortable="true" data-halign="center" data-align="center">货物位置</th>
				</tr>
			</thead>
		</table>

	</div>

	<%@ include file="footer.html"%>
	<script >
		$('#tableId').bootstrapTable(); // init via javascript

	    $(window).resize(function () {
	        $('#tableId').bootstrapTable('resetView');
	    });
	</script>
</body>
</html>