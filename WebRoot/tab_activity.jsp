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
<h2>景点列表</h2>


<table cellpadding="0" cellspacing="0">

<tr>
<th>活动名称</th>
<th>活动所在城市</th>
<th>活动申请人数</th>
<th>活动限制人数</th>
<th>活动开始时间</th>
<th>活动结束时间</th>
<th>活动描述</th>
<th>操作</th>
</tr>

<c:if test="${activityList != null }">
	<c:forEach items="${activityList }" var="activity">
		<tr>
			<td>${activity.act_name }</td>
			<td>${activity.act_city }</td>
			<td>${activity.act_apply_amount }</td>
			<td>${activity.act_amount }</td>
			<td>${activity.act_begin_date }</td>
			<td>${activity.act_end_date }</td>
			<td>${activity.act_desc }</td>
			<td><a href="deteleActivity?actId=${activity.act_id }" >删除</a></td>
		</tr>
	</c:forEach>
</c:if>

</table>


<p class="msg">共找到${activityList.size() }条景点信息</p>
</div>
</div>
<!-- /MainForm -->

</body>
</html>