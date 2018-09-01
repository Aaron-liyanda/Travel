<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Activity,entity.Users,entity.Apply,servlet.GetActServlet2,servlet.AddActapServlet"%>
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
		<tr><td>活动</td><td>接受者</td><td>状态</td></tr>
		<c:forEach items="${apply2}" var="apply">    
    	<tr><td>${apply.act_id}</td>
		<td>${apply.apply_suser}</td>
		<td>${apply.apply_condition}</td>	
   		</tr>
		</c:forEach>
	</table>
  </body>
</html>
