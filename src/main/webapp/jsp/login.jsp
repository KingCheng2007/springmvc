<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	session="true"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"; %>
<!DOCTYPE html>
<html lang="zh">
  <head>
    <base href="<%=basePath%>">
    <title>唐山曹妃甸实业矿石港务有限公司</title>
	<%@ include file="header.html"%>
  </head>
  
<body style="text-align:center;" topmargin="0" leftmargin="0">
	<div class="container center-block" style="display:none;">

		<form class="form-signin" role="form" method="post" action="customerUser/doLogin">
			<h3 class="form-signin-heading" style="color:white">
				<img class="img-circle" height="30px" src="image/logo.png">唐山曹妃甸实业矿石港务有限公司
			</h3>
			<div class="form-group"
				style="background-color: #f5f5f5; padding:10px;border-radius: 4px 4px 4px 4px;">
				<div class="input-group">

					<span class="input-group-addon"><img
						src="image/icon_user.png" style="height:20px;width:20px" alt="...">
					</span> <input type="text" name="userName" class="form-control"
						placeholder="用户名" required autofocus>
				</div>
				<br>
				<div class="input-group">
					<span class="input-group-addon"><img
						src="image/icon_psw.png" style="height:20px;width:20px" alt="...">
					</span> <input type="password" name="password" class="form-control"
						placeholder="密码" required>
				</div>
			</div>
			<button class="btn btn-lg btn-primary btn-block btn-warning"
				type="submit">登录</button>
		</form>
		<p class="text-center">版权所有：唐山曹妃甸实业矿石港务有限公司 主办单位：技设部</p>
	</div>
	<%@ include file="footer.html"%>
</body>
<style type="text/css">
	body {
		background-color: #1d7ad9;
	}
	</style>
<script type="text/javascript">
		$(function() {
			var h = $(document).height() - $(".container").height();
			$("body").css("padding-top", h / 2);
			$(".container").show();
		});
</script>
</html>