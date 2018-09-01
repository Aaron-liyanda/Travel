<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Activity,servlet.GetActServlet2"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
  <base href="<%=basePath%>">
    <meta charset="utf-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/activ.css">
    <title>活动主页</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery_dev.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
	
	$(document).ready(function(e){
      $("#card-main").load("getActServlet1",{},function(){
		});
		$("#home").click(function() {
		//返回主页
		   window.location.href = "./index.jsp";
		});
		$("#liOne").click(function(){
			$("#card-main").html("");
			$("#card-main").load("getActServlet1",{},function(){
				
			});
		});
		$("#liTwo").click(function(){
			$("#card-main").html("");
			$("#card-main").load("activity/addAct.jsp",{},function(){
				
			});
		});
		$("#liThree").click(function(){
			$("#card-main").html("");
			$("#card-main").load("activityServlet",{},function(){
				
			});
		});
		$("#liFour").click(function(){
			$("#card-main").html("");
			$("#card-main").load("applyServlet",{},function(){
				
			});
		});	
	});
	
	
	
	</script>
  </head> 
<body>

    <div class="l-sidebar">
       <div class="sx-logo-box">
           <a href="###" title="组团吧" class="sx-logo"></a>
        </div>
       <!--列表区-->
       <div class="sx-activity">
           <div class="sx-activity-title">组团吧</div>
           <ul class="sx-activity-list">
               <li id = "home" >
                   <a href="###" class="sx-activity-item">Home</a>
               </li>
               <li id = "liOne">
                    <a href="###" id = "aOne" class="sx-activity-item">所有活动</a>
                </li>
                <li id = "liTwo">
                    <a href="###" class="sx-activity-item">创建活动</a>
                </li>
                <li id = "liThree">
                    <a href="###" class="sx-activity-item">我的活动</a>
                </li>
                <li id = "liFour">
                    <a href="###" class="sx-activity-item">我的申请</a>
                </li>
           </ul>
       </div>
    </div>
    <div class="r-content">
        <div class="top">
            <div class="user-info">
                <div class = "user-info__item">
                    <span class = "sx-icon sx-icon--ppl"></span>
                    <span class = "user-info__txt">用户:${user.user_name}</span>
                </div>
            </div>
        </div>
        <div class="main">
            <div class="main__hd">
                   <div class="sx-search">
                    <div class="search__main">
                        <input type="text" placeholder="搜索活动..."/>
                        <i class="sx-icon"></i>       
                    </div>
                    <button class="sx-search__btn">搜索</button>   
                </div>
            </div>
            <div class="main__bd">
                <div class="sx-card-main" id = "card-main">
                  
                </div>
            </div>
        </div>
    </div>
    <script src="js/act.js"></script>
  </body>
</html>
