<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<header class="navbar navbar-static-top" id="top" role="banner">
	<div class="container">
		<div class="navbar-header navbar-inverse">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="sign">首页 </a>
		</div>
		<nav class="collapse navbar-collapse" role="navigation">
			<ul class="nav navbar-nav navbar-right nav-stacked">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">查询管理<b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="dreNot/toList">疏港通知</a></li>
						<li><a href="carInfo/toList">在场车查看</a></li>
						<li><a href="pricing.html">合同信息</a></li>
						<li><a href="team.html">费用信息</a></li>
						<li><a href="customerUser/toUserDetail">用户信息</a></li>
						<li><a href="customerUser/toCompanyDetail">公司信息</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">统计管理<b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="services.html">统计信息1</a></li>
						<li><a href="portfolio.html">统计信息2</a></li>
					</ul></li>
				<li><a href="drePla/toList">装车信息</a></li>
				<li><a href="netPre/toList">网上预到</a></li>
			</ul>
		</nav>
	</div>
</header>
