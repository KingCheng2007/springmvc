<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
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
				<li class="active">装车计划</li>
			</ol>
		</div>
		<table class="table table-hover table-striped table-condensed"
			data-toggle="table" data-url="drePla/toJson" data-search="true"
			data-show-refresh="true" data-show-toggle="true"
			data-show-columns="true" data-row-style="rowStyle" data-flat="true"
			data-pagination="true" data-mobile-responsive="true">
			<thead>
				<tr>
					<th data-field="pactNo" data-sortable="true" data-halign="center"
						data-align="center">通知单号</th>
					<th data-field="boatName" data-sortable="true" data-halign="center"
						data-align="center">船名</th>
					<th data-field="mineName" data-sortable="true" data-halign="center"
						data-align="center">货种</th>
					<th data-field="hzName" data-sortable="true" data-halign="center"
						data-align="center">货主名称</th>
					<th data-field="hdName" data-sortable="true" data-halign="center"
						data-align="center">货代名称</th>
					<th data-field="pile" data-sortable="true" data-halign="center"
						data-align="center">堆场位置</th>
					<th data-field="sumNum" data-sortable="true" data-halign="center"
						data-align="center">总量</th>
					<th data-field="sumWorkedNum" data-sortable="true"
						data-halign="center" data-align="center">已装车量</th>
					<th data-field="sumRemainNum" data-sortable="true"
						data-halign="center" data-align="center">剩余量</th>
					<th data-field="startTime" data-sortable="true"
						data-halign="center" data-align="center">开始时间</th>
					<th data-field="endTime" data-sortable="true" data-halign="center"
						data-align="center">结束时间</th>
				</tr>
			</thead>
		</table>

	</div>

	<%@ include file="footer.html"%>
	<script>
		/* function rowStyle(row, index) {
			var classes = [ 'warning', 'danger','' ];
			return {
				classes : classes[index % 3]
			};
		} */
	</script>
</body>
</html>