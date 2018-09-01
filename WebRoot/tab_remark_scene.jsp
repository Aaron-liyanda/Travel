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
<h2>景点留言</h2>


<table cellpadding="0" cellspacing="0">

<tr>
<th>留言景点</th>
<th>留言内容</th>
<th>留言日期</th>
<th>留言用户</th>
<th>操作</th>
</tr>	

<c:if test="${son_re_list != null }">
	<c:forEach items="${son_re_list }" var="son_re">
		<tr>
			<td>${son_re.son_re_to }</td>
			<td>${son_re.son_re_content }</td>
			<td>${son_re.son_re_date }</td>
			<td>${son_re.son_re_my }</td>
			<td><a href="deleteSceneRemark?son_re_id=${son_re.son_re_id }" >删除</a></td>
		</tr>
	</c:forEach>
</c:if>


</table>


<p class="msg">共找到${son_re_list.size() }条景点评论信息</p>
</div>
</div>
<!-- /MainForm -->

</body>
</html>