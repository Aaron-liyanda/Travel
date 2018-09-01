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

<script type="text/javascript">
    function deleteScene(id) {
            window.location.href="deleteScene?senId="+id;
    }
</script>

</head>

<body>


<!-- MainForm -->
<div id="MainForm">
<div class="form_boxA">
<h2>景点列表</h2>


<table cellpadding="0" cellspacing="0" width="10%, 10%, 50%, 20%,*">

<tr>
<th>景点名称</th>
<th>景点所在城市</th>
<th style="width:60%;">景点描述</th>
<th>景点联系方式</th>
<th>操作</th>
</tr>


<c:if test="${senList != null }">
	<c:forEach items="${senList }" var="sen">
		<tr >
			<td>${sen.sen_name }</td>
			<td>${sen.sen_city }</td>
			<td style="line-height: 20px">${sen.sen_desc }</td>
			<td>${sen.sen_phone }</td>
			<td><a href="deleteScene?senId=${sen.sen_id}">删除</a></td>
		</tr>
	</c:forEach>
</c:if>

</table>


<p class="msg">共找到${senList.size() }条景点信息</p>
</div>
</div>
<!-- /MainForm -->

</body>
</html>