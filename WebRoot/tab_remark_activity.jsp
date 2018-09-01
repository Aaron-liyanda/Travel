<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="js/jquery-1.10.1.min.js"></script>
<script src="js/side.js" type="text/javascript"></script>

</head>

<body>


<!-- MainForm -->
<div id="MainForm">
<div class="form_boxA">
<h2>活动留言</h2>


<table cellpadding="0" cellspacing="0">

<tr>
<th>留言用户</th>
<th>活动ID</th>
<th>留言内容</th>
<th>留言日期</th>
<th>操作</th>
</tr>

<c:if test="${act_mes_list != null }">
	<c:forEach items="${act_mes_list }" var="act_mes">
		<tr>
			<td>${act_mes.act_msg_fuser }</td>
			<td>${act_mes.act_id }</td>
			<td>${act_mes.act_msg_content }</td>
			<td>${act_mes.act_msg_date }</td>
			<td><a href="deleteActivityRemark?act_msg_id=${act_mes.act_msg_id }" >删除</a></td>
		</tr>
	</c:forEach>
</c:if>

</table>


<p class="msg">共找到${act_mes_list.size() }条活动评论信息</p>
</div>
</div>
<!-- /MainForm -->

</body>
</html>