<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<base href="<%=basePath%>">
<title>公司信息</title>
<%@ include file="header.html"%>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div class="container">
		<div align="left">
			<ol class="breadcrumb">
				<li><a href="index.jsp">首页</a>
				<li class="active">查询管理
				<li class="active">公司信息
			</ol>
		</div>
		<ul class="list-group ">
			<li class="list-group-item row"><span class=" col-md-4 ">客户名称：</span><span
				class="col-md-8 form-control" disabled>${company.customerName}</span>
				<span class=" col-md-4  ">客户编号：</span><span
				class=" col-md-8 form-control" disabled>${company.id}</span> <span
				class=" col-md-4  ">客户简称：</span><input class="col-md-8 form-control"
				value="${company.customerShortname}"> <span
				class=" col-md-4  ">经济性质：</span><input
				class=" col-md-8 form-control" disabled
				value="${company.economyType}"> <span class=" col-md-4  ">所属行业：</span><input
				class=" col-md-8 form-control" value="${company.industry}">
				<span class=" col-md-4  ">联系地址：</span><input
				class=" col-md-8 form-control" value="${company.address}"> <span
				class=" col-md-4  ">联系人：</span><input class=" col-md-8 form-control"
				value="${company.linkman}"> <span class=" col-md-4  ">联系电话：</span><input
				class=" col-md-8 form-control" value="${company.tel}"> <span
				class=" col-md-4  ">手机：</span><input class=" col-md-8 form-control"
				value="${company.mobile}"> <span class=" col-md-4  ">传真：</span><input
				class=" col-md-8 form-control" value="${company.fax}"> <span
				class=" col-md-4  ">电子邮件：</span><input
				class=" col-md-8 form-control" value="${company.email}"> <span
				class=" col-md-4  ">邮政编码：</span><input
				class=" col-md-8 form-control" value="${company.postcode}">
				<span class=" col-md-4  ">网址：</span><input
				class=" col-md-8 form-control" value="${company.postcode}">
				<span class=" col-md-4  ">法人代表：</span><input
				class=" col-md-8 form-control" value="${company.corporateRep}">
				<span class=" col-md-4  ">注册资金：</span><input
				class=" col-md-8 form-control" value="${company.registerCapital}">
				<span class=" col-md-4  ">营业执照号：</span><input
				class=" col-md-8 form-control" value="${company.businessLicence}">
				<span class=" col-md-4  ">纳税登记号：</span><input
				class=" col-md-8 form-control" value="${company.taxReg}"> <span
				class=" col-md-4  ">海关代号：</span><input
				class=" col-md-8 form-control" value="${company.ciqNumber}">
				<span class=" col-md-4  ">银行账号：</span><input
				class=" col-md-8 form-control" value="${company.bankAccount}">
				<span class=" col-md-4  ">开户名称：</span><input
				class=" col-md-8 form-control" value="${company.accountName}">
				<span class=" col-md-4  ">开户银行：</span><input
				class=" col-md-8 form-control" value="${company.bankName}">
				<span class=" col-md-4  ">客户简介：</span><input
				class=" col-md-8 form-control" value="${company.supplierBrief}">
				<span class=" col-md-4  ">备注：</span><input
				class=" col-md-8 form-control" value="${company.remarks}"></li>
		</ul>
	</div>
</body>
<%@ include file="footer.html"%>
</html>
