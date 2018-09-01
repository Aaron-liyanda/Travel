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
    <title>活动申请页面</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery_dev.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<style type="text/css">
	   * {
	       overflow: hidden;
	   }
	   .main {
	       background: url(images/app_bg.png) no-repeat 100% 100%;
	       height: 700px;
	       width:1024px;
	       margin: 0 auto;
	       text-align: center;
	   }
	   .act_info {
	       position: relative;
           left:150px;
           width:800px;
           right: 150px;
           font-weight:bold;
           font-family:Verdana,Genva,Arial,sans-serif;
	   }
	   h1 {
	      font-style:oblique;
	   }
	   .say {
	      position:relative;
	      right: -280px;
	      top:30px;
	   }
	   #act_msg_acount {
	       box-shadow: 1px 1px 2px #ccc;
	   }
	</style>
  </head> 
<body>
  <div class = "main panel">
    <h1 >活动信息</h1>
    <c:forEach items="${activity2}" var="activity">
		<table class = "table act_info table-striped table-condensed" >
		    <tr>
		    <td>活动名称</td><td>${activity.act_name}</td></tr>
			<tr><td>活动城市</td><td>${activity.act_city}</td></tr>
			<tr><td>活动计划</td><td>${activity.act_desc}</td></tr>
			<tr><td>已参加人数</td><td>${activity.act_apply_amount}</td></tr>
			<tr><td>总人数</td><td> ${activity.act_amount}</td></tr>
			<tr><td>开始日期</td><td>${activity.act_begin_date}</td></tr>
			<tr><td>截止日期</td><td>${activity.act_end_date}</td></tr>
		</table>
		<div><button class = "btn" id="join" name="join" onclick="join(${activity.act_id},${user.id},${activity.act_user_id},${activity.act_apply_amount},${activity.act_amount})">我要参加</button></div>
		<!--  <table border="1">
			<tr><td>发送者</td><td>内容</td><td>日期</td></tr>
			<c:forEach items="${activityMessage}" var="activityMessage">    
		    	<tr><td>${activityMessage.act_msg_fuser}</td>
				<td>${activityMessage.act_msg_content}</td>
				<td>${activityMessage.act_msg_date}</td>	
		   		</tr>
			</c:forEach>
		</table>-->
		<div class = "say">
		    <!--<label for="addMsg" class="">发言</label>  -->
			<textarea type="text" cols="36" rows="6" id="act_msg_acount" name="act_msg_acount" placeholder="请输入回复信息"></textarea>
		    <button id="send" class = "btn btn-danger" onclick="send(${activity.act_id},${user.id})">发言</button>
		    <button id="goback" class = "btn btn-warning" onclick="goback()">返回</button>
	    </div>
	</c:forEach>
  </div>
	<script type="text/javascript">
		function join(act_id,apply_fuser,apply_suser,act_apply_amount,act_amount) {
			if(act_apply_amount<act_amount) {
				
				window.location.href='addActapServlet?apply_suser='+apply_suser+'&apply_fuser='+apply_fuser+'&act_id='+act_id;
			}
		};
		var act_msg_acount = null;
  		setTimeout(function() {
  			act_msg_acount =document.getElementById("act_msg_acount").value;
  		}, 1000)
	  	function send(act_id,act_msg_fuser) {
	  		var act_msg_acount =document.getElementById("act_msg_acount").value;
	  		if(act_msg_acount!="") {
				window.location.href = 'addActMsgServlet?act_id='+act_id+'&act_msg_fuser='+act_msg_fuser+'&act_msg_acount='+act_msg_acount;
				
	  		}
	  	}
	  	function goback() {
	  		window.location.href = 'activity/index.jsp';
	  	}
	  	 
  </script>
  </body>
</html>
