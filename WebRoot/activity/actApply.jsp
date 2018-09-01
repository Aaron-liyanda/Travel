<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Activity,entity.Users,entity.Activity_message, servlet.GetActServlet2,servlet.AddActapServlet"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
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
<script type="text/javascript">
	function accept(apply_id){
	window.location.href='updateActapServlet?apply_id='+apply_id;
	};
		</script>
<jsp:include page="index.jsp"/>
    <table border="1">
		<tr><td>活动</td><td>发送者</td><td>状态</td></tr>
		<c:forEach items="${apply1}" var="apply">    
    	<tr><td>${apply.act_id}</td>
		<td>${apply.apply_fuser}</td>
		<td>${apply.apply_condition}</td>
		<td><div><button id="accept" name="accept" onclick="accept(${apply.apply_id})">接受</button></div></td>	
   		</tr>
		</c:forEach>
	</table>
  </body>
</html>
