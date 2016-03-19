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
				<li class="active">车辆信息</li>
			</ol>
		</div>
		<form method="post" action="" id="form">
			<input type="hidden" name="paramId" id="paramId" />
		</form>
		<div class="btn-toolbar" role="toolbar" aria-label="..." id="toolbar">
			<div class="btn-group" role="group" aria-label="...">
				<button type="button" class="btn btn-info" id="button">详情</button>
				<button type="button" class="btn btn-info">修改</button>
				<button type="button" class="btn btn-default" name="refresh">刷新</button>
			</div>
			<div class="btn-group" role="group" aria-label="...">
				<button type="button" class="btn btn-default">删除</button>
				<button type="button" class="btn btn-default" name="toggle">切换</button>
			</div>
		</div>
		<table id="table" data-toggle="table" data-url="carInfo/toJson"
			data-search="true" data-show-refresh="true" data-show-toggle="true"
			data-show-columns="true" data-row-style="rowStyle" data-flat="true"
			data-pagination="true" data-detail-formatter="detailFormatter"
			data-mobile-responsive="true" data-toolbar="#toolbar">
			<thead>
				<tr>
					<th data-field="state" data-radio="true"></th>
					<th data-field="carno" data-sortable="true" data-halign="center"
						data-align="center">车牌号</th>
					<th data-field="vehidelength" data-sortable="true"
						data-halign="center" data-align="center">车长</th>
					<th data-field="vehidewidth" data-sortable="true"
						data-halign="center" data-align="center">车宽度</th>
					<th data-field="vehideheight" data-sortable="true"
						data-halign="center" data-align="center">车高度</th>
					<th data-field="vehidemounted" data-sortable="true"
						data-halign="center" data-align="center">载重吨</th>
					<th data-field="electiontag" data-sortable="true"
						data-halign="center" data-align="center">电子标签</th>
					<th data-field="carStatus" data-sortable="true"
						data-halign="center" data-align="center"
						data-formatter="statusFormatter">状态</th>
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
		function statusFormatter(value, row) {
			var forV = value==0?'启用':'未启用';
			var forG = value==0?'glyphicon-ok':' glyphicon-remove';
	        return '<i class="glyphicon ' +forG + '"></i> ' + forV;
	    }
	   
		var $table = $('#table'), $button = $('#button');

		$(function() {
			$button.click(function() {
				$("#paramId").val($table.bootstrapTable('getSelections')[0]['id']);
				$("#form").attr("action","carInfo/toGetCarInfo");
				$("#form").submit();
				//netPre/toList?id=?car=${1 }
				console.info($table.bootstrapTable('getSelections')[0]['id']);
			});

			//$table.bootstrapTable('toggleView');
		});
		function detailFormatter(index, row) {
			var html = [];
			$.each(row, function(key, value) {
				/* var a= $("th[data-field='"+key+"']").find("div[class='th-inner sortable both']").html(); */
					html.push('<p><b>' + key + ':</b> ' + value + '</p>');
			});
			return html.join('');
		}
	</script>
</body>
</html>