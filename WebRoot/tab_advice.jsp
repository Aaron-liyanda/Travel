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
<h2>用户建议</h2>


<table cellpadding="0" cellspacing="0">

<tr>
<th>建议日期</th>
<th>建议内容</th>
<th>用户ID</th>
<th>操作</th>
</tr>

<c:if test="${adviceList != null }">
	<c:forEach items="${adviceList }" var="advice">
		<tr>
			<td>${advice.adv_date }</td>
			<td>${advice.adv_content }</td>
			<td>${advice.user_id }</td>
			<td><a href="deleteAdvice?adv_id=${advice.adv_id }" >删除</a></td>
		</tr>
	</c:forEach>
</c:if>

</table>


<p class="msg">共找到${adviceList.size() }条留言信息</p>
</div>
</div>
<!-- /MainForm -->

</body>
</html>
