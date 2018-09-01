<%@ page language="java" import=" java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>查看留言</title>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<style type="text/css">
    th{
	text-align:center;
	}
	td{
		text-align:center;
	}
</style>
</head>

<body>
<div style="margin-top:50px;text-align:center;"><h4><b>评论回复表</b></h4></div>

<table  border="1" class="table table-hover" style="margin:0px 0px 0px 100px;width:80%;">
    <tr class="success">
        <th>#</th>
        <th>用户</th>
        <th>回复时间</th>
        <th>回复内容</th>
        
        
    </tr>
    <c:forEach items="${list}" var="son" varStatus="loop">
    <tr>
        <td>${son.son_re_id}</td>
        <td>${list6[loop.count-1].user_name}</td>
        <td>${son.son_re_date}</td>
        <td>${son.son_re_content}</td>
    </tr>
  </c:forEach>
</table>


</body>
</html>
