<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="js/jquery-1.10.1.min.js"></script>
<script src="js/side.js" type="text/javascript"></script>

</head>

<body>


<!-- MainForm -->
<div id="MainForm">
<div class="form_boxA">
<h2>用户信息列表</h2>


<table cellpadding="0" cellspacing="0">

<tr>
<th>姓名</th>
<th>电话</th>
<th>email</th>
<th>生日</th>
<th>QQ</th>
<th>地址</th>
</tr>


<c:if test="${userList != null }">
	<c:forEach items="${userList }" var="users">
		<tr>
			<td>${users.user_name }</td>
			<td>${users.user_phone }</td>
			<td>${users.user_email }</td>
			<td>${users.user_birthday }</td>
			<td>${users.user_qq }</td>
			<td>${users.user_address }</td>
		</tr>
	</c:forEach>
</c:if>

<!-- 
<c:forEach items="${userList }" var="user">
	<td>${user.id }</td>
	<td>销售部</td>
	<td>2017</td>
	<td>张三</td>
	<td>12500.00</td>
	<td>12500.00</td>
	<td>12500.00</td>
	<td>审核通过</td>
<td><a href="#">查看</a> | <a href="#">删除</a></td>
</tr>
</c:forEach>
 -->

</table>


<p class="msg">共找到${userList.size() }条用户信息</p>
</div>
</div>
<!-- /MainForm -->

</body>
</html>
