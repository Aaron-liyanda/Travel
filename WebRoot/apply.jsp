<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>创建活动表</title>
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
<div style="margin-top:50px;text-align:center;"><h4><b>申请表</b></h4></div>

<table  border="1" class="table table-striped" style="margin:0px 0px 0px 100px;width:80%;">
    <tr class="info">
        <th>#</th>
        <th>申请人</th>
        <th>联系电话</th>
        <th>邮箱</th>
        <th>申请活动</th> 
    </tr>
    <c:forEach items="${list}" var="apply" varStatus="loop">
    <tr>
    
         <td>${apply.apply_id}</td>
        <td>${list2[loop.count-1].user_name}</td>
        <td>${list2[loop.count-1].user_phone}</td>
        <td>${list2[loop.count-1].user_email}</td>
        <td>${list3[loop.count-1].act_name }</td>
    
    </tr>
      </c:forEach>
    </table>
</body>
</html>
