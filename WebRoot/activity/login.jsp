<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Activity,servlet.GetActapServlet2"%>
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
	<script type="text/javascript">
	function check()
	{
  		if(form1.user_name.value==""||form1.user_name==null){
    	alert("请输入用户名！");
   	 	return false;
   	 	}
	}
	alert(obj);
	</script>
  </head>
  
  <body>
  	<% Object obj = request.getAttribute("message"); %>
	<form action="userLoginServlet" method="post" name="form1" onsubmit="return check()">
	<h2 align="center"><font color="red"> 用户登陆页面</font></h2>
	<table align="center" border="2">
	<tr><td>用户名：</td><td><input type="text" name="user_name" size="22" onblur="check()"></td>
	</tr>
	<tr><td>密  码：</td><td><input type="password" name="user_pwd" size="22" onblur="check()"></td></tr>
	<tr><td align="center" colspan="2"><input type="submit" value="提交"> <input type="reset" value="重置"></td></tr>
	</table>
	</form>
  </body>

</html>
