<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>景点信息</title>
<style type="text/css">

#main-photo-body{
	width:100%;
	height:400px;
}
#main-photo{
	width:58%;
	height:85%;
	margin-left:20px;
	margin-top:25px;
	display:inline-block;
	float:left;
}
#right-1{
	width:35%;
	height:41%;
	margin-top:25px;
	margin-left:6px;
	display:inline-block;
	float:left;
	
}
#right-2{
	width:35%;
	height:41%;
	margin-left:6px;
	margin-top:7px;
	float:left;
}
#pic-1{
	width:100%;
	height:100%;
}
#pic-2{
	width:100%;
	height:100%;
}
#pic-3{
	width:100%;
	height:100%;
}
#main-sen-msg{
	width:100%;
	height:250px;
	padding-bottom:0px;
}
#sen-connection{
	position:relitive;
	width:100%;
	height:80px;
	margin-top:20px;

}
#myRemark{
    width:94%;
    height:200px;
    margin-left:15px;
    margin-right:15px;

}
</style>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript">
$(document).ready(function(e) {
	//验证输入框
    $("#rbtn").click(function(){
    	var regex=/^\s*$/g;                                                                                               
    	var a=$("#re_con").val();                                                                                              
        var bool=regex.test(a);  
    	if(bool){
    	alert("输入不能为空");
    	}
    	
    });
  
	//评论
	$("#rbtn").click(function(){
    		var content=$("#re_con").val();
    		$("#kk").load("feelServlet",{content:content,id:${senic.sen_id}},function(){
    			 location.reload([true]);
    		});
    		
	});
	$("#rkk").click(function(){ 
	  window.location.href='userLogin.jsp';		
		});
	
	
	});
	
	
	

</script>
</head>
<body>

<div id="main-photo-body">
 <div id="main-photo">
 <img src="${first_pic}" id="pic-1">
</div>

 <div id="right-1"><img src="${second_pic}" id="pic-2"></div>
 <div id="right-2"><img src="${third_pic}" id="pic-3"></div>

</div>
 <div id="main-sen-msg"><p style="text-indent:2em;margin-left:10px;;font-size:18px;">${senic.sen_desc}</p>
<hr/>
 <div id="sen-connection">
 <p style="margin-left:15px;display:inline;float:left;">景区联系电话：${senic.sen_phone}</p><p style="margin-left:200px;float:left">位置：</p>
 <p style="float:left">${pro_name}</p>
 <p style="float:left">${senic.sen_city}</p>
 <p style="margin-left:15px; color:#390;clear:both;display:inline;float:left;"><b>推荐>></b></p>
 <p style="float:left;margin-left:30px;"><a href="#" style="text-decoration:none;">${trip.trip_name}</a></p>
 <p style="float:left;margin-left:30px;">咨询电话：</p>
 <p style="float:left;">${trip.trip_phone}</p>
 <p style="float:left;margin-left:40px;">地址：</p>
 <p style="float:left;">${trip.trip_addr}</p>
 <p style="float:left;margin-left:40px;">邮箱：</p>
 <p style="float:left;">${trip.trip_email}</p>
 </div>
 
 					<c:choose>
					<c:when test="${empty user }">
					<div id="myRemark" >
    <div class="input-group">
       <input type="text" class="form-control" id="re_con" placeholder="我要评论" aria-describedby="basic-addon2">
       <span class="input-group-btn">
       <button class="btn btn-success" id="rkk" type="button">发表</button>
    </span>
    </div>	
					</c:when>
					<c:otherwise>
						<div id="myRemark" >
    <div class="input-group">
       <input type="text" class="form-control" id="re_con" placeholder="我要评论" aria-describedby="basic-addon2">
       <span class="input-group-btn">
       <button class="btn btn-success" id="rbtn" type="button">发表</button>
    </span>
    </div>
					</c:otherwise>
					</c:choose>
 
 
 
 
 
 
 
 
 
     <div id="kk"></div>
 </div>
 </div>

</body>
</html>