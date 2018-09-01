<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Activity,servlet.GetActServlet1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <base href="<%=basePath%>">
    <meta charset="utf-8"> 
    <title>展示所以活动的页面</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/allActinfo.css">
	<script src="../js/jquery_dev.js"></script>
	<script src="../js/bootstrap.min.js"></script>
  </head> 
  
  <body>
    <table  class = "table table-striped">
        <thead>
           <tr>
               <th>活动名称</th><th>活动城市</th><th>已参加人数</th><th>总人数</th><th>截止日期</td>
           </tr>
       </thead>
       <tbody>
       
	<c:forEach items="${activity1}" var="activity">
    <tr>
	 <td><a href="getActServlet2?act_id=${activity.act_id}">${activity.act_name}</a></td>
	 <td>${activity.act_city}</td>
	 <td>${activity.act_apply_amount}</td>
	 <td>${activity.act_amount}</td>
	 <td>${activity.act_end_date}</td>
    </tr>
	</c:forEach>
	</tbody>
	</table>
  </body>
</html>
