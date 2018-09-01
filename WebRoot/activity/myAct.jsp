<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Activity,servlet.GetActServlet3"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8"> 
    <title></title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<script src="../js/jquery_dev.js"></script>
	<script src="../js/bootstrap.min.js"></script>
  </head> 
  
  <body>
  <jsp:include page="index.jsp"/>
    <table border="1">
	<tr><td>活动名称</td><td>活动城市</td><td>已参加人数</td><td>总人数</td><td>截止日期</td></tr>
	<c:forEach items="${activity3}" var="activity">
    <tr>
	 <td><a href="getActServlet2?act_id=${activity.act_id}">${activity.act_name}</a></td>
	 <td>${activity.act_city}</td>
	 <td>${activity.act_apply_amount}</td>
	 <td>${activity.act_amount}</td>
	 <td>${activity.act_end_date}</td>
    </tr>
	</c:forEach>
	</table>
  </body>
</html>
