<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>风景主页</title>
<style type="text/css">
@import url("css/mainSenicCss.css");
</style>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
   $(document).ready(function(e){ 
		
	      $("#remark").css("color","black");
		  $("#hot").css("color","black");
	      $("#about").css("color","green");
	    
	      <%
	     int id= Integer.parseInt(request.getParameter("id"));
	      %>
	  
	      var id=${param.id};
	      $("#showBody").load("mainSenicServlet",{id:id},function(){
	    	 
			});
	          $("#about").click(function(){  
	          $('#showBody').html(" ");
		      $("#remark").css("color","black");
			  $("#hot").css("color","black");
		      $("#about").css("color","green");
			  $("#showBody").load("mainSenicServlet",{id:id},function(){
				  location.reload([true]);
					});
	   });
	    $("#remark").click(function(){
	         $('#showBody').html(" ");
	    	 $("#about").css("color","black");
			 $("#hot").css("color","black");
	    	 $("#remark").css("color","green");
	    	 $("#showBody").load("senReServlet",{id:id},function(){
	    		
			  });
	     });
	    
	   

   });
  </script>
  <!--缩放-->
  <script type="text/javascript">
	$(function  () {
		function resi() {
			var html = document.querySelector("html");
			var wW = document.body.clientWidth || document.documentElement.clientWidth;
			var maxW = 640;
			var minW = 320;
			if (wW > maxW) wW = maxW;
			var ratio = wW / minW;
			html.style.fontSize = 50 * ratio + "px"
		}
		window.addEventListener("DOMContentLoaded", function() {
			var bodys = document.querySelector("body").style;
			bodys.opacity = "1";
			bodys.filter = "alpha(opacity=100)";
			resi()
		});
		window.addEventListener("resize", resi);
 
	});		
	</script>
</head>
<body>
<nav class="navbar navbar-inverse">
 <div id="wrap" >
					<ul>
					<c:choose>
					<c:when test="${empty user }">
						<li class="active"><a href="index.jsp">Home</a></li>
						<li><a href="userLogin.jsp">组团吧</a></li>
						<li><a href="http://www.baidu.com/">旅游服务</a></li>
						<li><a href="userLogin.jsp">个人主页</a></li>
						<li><a href="userLogin.jsp">登录/注册</a></li>
					</c:when>
					<c:otherwise>
						<li class="active"><a href="index.jsp">Home</a></li>
						<li><a href="activity/index.jsp">组团吧</a></li>
						<li><a href="http://www.baidu.com/">旅游服务</a></li>
						<li><a href="home.jsp">个人主页</a></li>
						<li><a href="loginOutServlet">注销</a></li>
					</c:otherwise>
					</c:choose>
						
					
						
					</ul>
 
	
    <div id="clear"> </div>		
 </div>
</nav>  

<div id="mainBody" class="container">
 <div id="senicInfo">
   <div id="senic-addr">${pro_name}>>${senic.sen_city}>>${senic.sen_name}</div><br/>
   <div id="senic-name">${senic.sen_name}</div>
   <hr>
   <div id="sen-choose">
      <ul id="son-choose">
        <li ><a id="about" >概况</a></li>
        <li ><a id="remark" >景点点评</a></li>
            
      </ul>
   </div>
 </div>
 </div>
 <div id="big-body">
 <div id="showBody"></div>
 </div>






</div>


<div class="footer">
			<div class="wrap">
			<div class="footer-grids">
				<div >
					<h3></h3>
					<p></p>
				</div>
				
				<div >
					<h3></h3>
					<ul>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
					</ul>
				</div>
				<div >
					<h3></h3>
					<ul>
						<li><a href="#"></a></li>
						<li><a href="#"> </a></li>
						<li><a href="#"></a></li>
						<li><a href="#"> </a></li>
					</ul>
				</div>
				<div >
					<h3></h3>
					<p></p>
					<div >
						<p></p>
						<p></p>
						<p><a  href="#"></a></p>
					</div>
				</div>
				<div > </div>
			</div>
			</div>
		</div>
		<!---End-footer---->
	
	

</body>
</html>