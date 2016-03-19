<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<base href="<%=basePath%>">
<title>车辆详细信息</title>
<%@ include file="header.html"%>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div class="container">
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">车辆信息</div>
			<div class="panel-body">
				<ul class="list-group ">
					<li class="list-group-item row"><span class=" col-md-4 ">车牌号：</span>
						<span class="col-md-8 form-control" disabled>${carInfo.carno}</span>
						<span class=" col-md-4  ">车长：</span> <span
						class=" col-md-8 form-control" disabled>${carInfo.vehidelength}</span>
						<span class=" col-md-4  ">车宽：</span> <span
						class=" col-md-8 form-control" disabled>${carInfo.vehidewidth}</span>
						<span class=" col-md-4  ">车高：</span> <span
						class=" col-md-8 form-control" disabled>${carInfo.vehideheight}</span>
						<span class=" col-md-4  ">载重吨：</span> <span
						class=" col-md-8 form-control" disabled>${carInfo.vehidemounted}</span>
						<span class=" col-md-4  ">电子标签：</span> <span
						class=" col-md-8 form-control" disabled>${carInfo.electiontag}</span>
						<span class=" col-md-4  ">状态：</span> <span
						class=" col-md-8 form-control" disabled>${carInfo.carStatus==0?'启用':'未启用'}</span>
					</li>
				</ul>
			</div>
		</div>
	</div>
</body>
<%@ include file="footer.html"%>
</html>
