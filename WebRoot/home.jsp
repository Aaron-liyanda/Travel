<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">


<style type="text/css">
A{text-decoration:none}
</style>

<title>我的驴趣-驴趣网个人首页</title>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">

  $(document).ready(function(e) {
	    $("#show").load("activityServlet",{},function(){
			}); 
	    
    $("#cjactivity").click(function(){
    	$("#hd").css("color","black");
    	$("#ck").css("color","black");
    	$("#xg").css("color","black");
    	$("#jy").css("color","black");
        $("#cjactivity").css("color","white");	
    $("#show").load("activityServlet",{},function(){	
		});
  })
  
    $("#hd").click(function(){
    	$("#hd").css("color","white");
    	$("#ck").css("color","black");
    	$("#xg").css("color","black");
    	$("#jy").css("color","black");
        $("#cjactivity").css("color","black");
        $("#show").load("applyServlet",{},function(){
        });
  })
  
    $("#ck").click(function(){
     	$("#hd").css("color","black");
    	$("#ck").css("color","white");
    	$("#xg").css("color","black");
    	$("#jy").css("color","black");
        $("#cjactivity").css("color","black");    	
    $("#show").load("sonRemarkServlet",{},function(){
        });
  })
  
   $("#xg").click(function(){
    	$("#hd").css("color","black");
    	$("#ck").css("color","black");
    	$("#xg").css("color","white");
    	$("#jy").css("color","black");
        $("#cjactivity").css("color","black");	   
  $("#show").load("edit.jsp",{},function(){
  });
  })
  
   $("#jy").click(function(){
    	$("#hd").css("color","black");
    	$("#ck").css("color","black");
    	$("#xg").css("color","black");
    	$("#jy").css("color","white");
        $("#cjactivity").css("color","black");	   
  $("#show").load("advice.jsp",{},function(){
  });
  })
  
  });
 

</script>
<style type="text/css">

  #body{
	  width:100%;
	  height:auto;
	  background:#EFF0F1;
	  
  }
  #head{
	  width:70%;
	  height:100px;
	  line-height:150px;
	  font-size:24px;
	  background:#BAEBCF;
  }
  
  #showBody{
	  width:100%;
	  height:650px;
	  background:#94E29D;
	  }
   #choose{
	   width:300px;
	   height:100%;
	   margin-left:100px;
	   margin-right:100px;
	   display:inline;
	   float:left;
	   background:#9EEDA6;
   }
   #show{
	   width:900px;
	   height:100%;
	   margin:-left:100px;
	   float:left;
   }
	#tochoose li {
		list-style:none;
	cursor:pointer;
	margin-top:70px;
	}
	#tochoose li a {
	text-decoration:none;
	color:#000;
	font-size:24px;
	}
	#tochoose li a:hover {
		background-color:#3FE04A;
	}
	#foot{
		width:100%;
		height:220px;
	}
	#shouye{
	  font-size:25px;
	  text-align:center;
	}
	
	  #wrap{
	
	 text-align:center;
	 width:100%;
	 padding-left:30%;
	 margin:0 auto;
	 background:#323A45;
	 transition:all .2s linear;
	 -moz-transition:all .2s linear;/* firefox */
	 -webkit-transition:all .2s linear; /* safari and chrome */
	 -o-transition:all .2s linear; /* opera */
	 -ms-transition:all .2s linear;
  }
  
 
  
  #wrap ul li{
	display:inline-block;
	cursor:pointer;
	float:left;
  }
  #wrap ul li a{
	font-family: 'Roboto', sans-serif;
	color:#CCC;
	padding: 20px 30px;
	display: block;
	display:inline-block;
	text-decoration:none;
	transition:all .2s linear;
	-moz-transition:all .2s linear;/* firefox */
	-webkit-transition:all .2s linear; /* safari and chrome */
	-o-transition:all .2s linear; /* opera */
	-ms-transition:all .2s linear;
	font-size: 1.2em;
  }
  #wrap li.active a {
	color:#FFF;
	background:#00B895;
  }
  #wrap li a:hover{
	  color:#FFF;
	  background:#00B895;
  }
  
  #clear{clear:both;}
	
	
</style>       
</head>
<body>  
  <div id="body">
 
<nav class="navbar navbar-inverse">
 <div id="wrap" >
					<ul>
					<c:choose>
					<c:when test="${empty user }">
						<li ><a href="index.jsp">Home</a></li>
						<li><a href="userLogin.jsp">组团吧</a></li>
						<li><a href="http://www.baidu.com/">旅游服务</a></li>
						<li class="active"><a href="userLogin.jsp">个人主页</a></li>
						<li><a href="userLogin.jsp">登录/注册</a></li>
					</c:when>
					<c:otherwise>
						<li ><a href="index.jsp">Home</a></li>
						<li><a href="activity/index.jsp">组团吧</a></li>
						<li><a href="http://www.baidu.com/">旅游服务</a></li>
						<li class="active"><a href="home.jsp">个人主页</a></li>
						<li><a href="loginOutServlet">注销</a></li>
					</c:otherwise>
					</c:choose>
						
					
						
					</ul>
 
	
    <div id="clear"> </div>		
 </div>
</nav>  

     </div>
    
     <div id="showBody">
         <div id="choose">
     <div id="shouye">
     
     </div>
            <ul id="tochoose">
            <li><a href="index.jsp" style="text-decoration:none;color:black;">首页</a></li>
              <li><a id="cjactivity">我创建的活动</a></li>
              <li><a id="hd">申请用户表</a></li>
              <li><a id="ck">查看留言信息</a></li>
              <li><a id="xg">修改个人信息</a></li>
              <li><a id="jy">投诉建议</a></li>
            </ul>
         </div>
         <div id="show"  style="background-color:white;">
         
         </div>
     </div>
  
     <div id="foot">
     </div>
  
  </div>

</body>
</html>