<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>未出行行程</title>
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
<div style="margin-top:50px;text-align:center;"><h4><b>未出行活动表</b></h4></div>


<table  border="1" class="table table-hover" style="margin:0px 0px 0px 80px;width:80%;">
    <tr class="info">
        <th>#</th>
        <th>活动名称</th>
        
        <th>活动描述</th>
        <th>所在城市</th>
        <th>活动人数</th>
        <th>已申请人数</th>
        <th>创建日期</th>
        <th>截止日期</th>
    </tr>
    <c:forEach items="${list}" var ="activity" varStatus="loop">
    <tr>
        <td>${activity.act_id}</td>
        <td>${ activity.act_name}</td>
        <td>${ activity.act_desc}</td>
        <td>${activity.act_city }</td>
        <td>${ activity.act_amount}</td>
        <td>${activity.act_apply_amount }</td>
        <td>${activity.act_begin_date}</td>
        <td>${activity.act_end_date}</td>
        
    </tr>
    </c:forEach>
</table>

</body>
</html>
