<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>创建活动</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<script src="../js/jquery_dev.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h1 class="text-center">
						一起来旅行吧！
					</h1>
				</div>
			</div>
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> 
					 <span class="sr-only"></span>
					 <span class="icon-bar"></span>
					 <span class="icon-bar"></span>
					 <span class="icon-bar"></span></button> 
					 <a class="navbar-brand">旅行活动</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="allAct.jsp">所有活动</a></li>
						<li class="action"><a href="addAct.jsp">创建活动</a></li>
						<li><a href="myAct.jsp">我的活动</a></li>
						<li><a href="myApply.jsp">我的申请</a></li>
						<li class="action"><a href="oApply.jsp">请求加入</a></li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">注册</a></li>
						<li><a href="#">登陆</a></li>
					</ul>
				</div>
				
			</nav>
			
		</div>
	</div>
</div>
</body>
</html>