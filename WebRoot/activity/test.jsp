<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    <title></title>
    <meta charset="utf-8">  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head> 
  <body>
 
<table border="1">
	<tr><td>活动名称</td><td>活动描述</td><td>已参加人数</td><td>总人数</td><td>截止日期</td></tr>
	<%
	Object obj = request.getAttribute("userList");
	List<Activity> userList = null;
	if(obj instanceof List){
		userList = (List<Activity>)obj;
	}
	if(userList!=null){
		for(Activity tl:userList)
	{%>
	<tr>
	
	<td><a href="getActServlet2?act_id=<%=tl.getAct_id() %>"><%=tl.getAct_name() %> </a></td>
	<td><%=tl.getAct_desc() %>  </td>
	<td><%=tl.getAct_apply_amount() %> </td>
	<td><%=tl.getAct_amount() %> </td>
	<td><%=tl.getAct_end_date() %></td>
	</tr>
	<%}
	}
	%>
</table>
  </body>
</html>
