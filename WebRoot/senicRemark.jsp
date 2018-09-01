<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>景点评论</title>
<style type="text/css">
#remark-body{
	width:100%;
	height:auto;
	padding:0px;
}
#remark-msg{
	margin:0;
	width:100%;
	height:800px;	
}
#remark-user{
	width:96%;
	margin-left:10px;
	height:auto;
}
#remark-amount{
	width:100%;
	height:30px;
	
}
#remark-pic{
	width:5%;
	height:60px;
	clear:both;
	display:inline;
	float:left;
}
#remark-u-info{
	width:90%;
	height:45px;

	float:left;
	margin-left:15px;
	margin-top:8px;
	text-align:left;
	padding-top:8px;
	font-size:18px;
	color:#60F;
	font-family:KaiTi;
}
#pic{
	width:100%;
	height:100%;
}
#re-content{
  width:100%;
  height:auto;
  padding:10px 10px 0px 70px;
  color:#6B6B6B;
  font-family:STXinwei;
  font-size:18px;
  
}
#re-re{
	width:100%;
	height:auto;
	margin-bottom:0px;
	margin-top:-13px;
}
#re-hit{
	width:100%;
	height:auto;
	clear:both;
	padding-left:70px;
    margin-top:-15px;
	line-height:30px;
	
	
}
</style>
</head>

<body>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>


  <div id="remark-body" class="container">
  <div id="remark-msg">
   <div id="kong"></div>
    <div id="remark-amount">
    <p style="margin-left:15px;font-size:22px;display:inline;float:left;">共有</p>
    <p style="float:left;font-size:22px;">${amount}条评论</p>
  
    </div>
    
    <c:forEach items="${remarkList}" var="xname" varStatus="loop">
    <div id="remark-user">
       <div id="remark-pic" >
        <a  href="#"> <img src="${uList[loop.count-1].user_photo}"  class="img-circle" id="pic"></a>
       </div>
       <div id="remark-u-info">
          <p style="clear:both;display:inline;float:left;">${uList[loop.count-1].user_name}<a href="#" style="text-decoration:none;"></a></p>
          <p style="float:left;margin-left:600px;color:#616161;font-size:16px;">
          <fmt:formatDate value="${xname.pla_re_date}" pattern="yyyy-MM-dd HH:mm:ss"/>    
          </p>
       </div>
       <div id="re-content" style="clear:both;">
          <span>${xname.pla_re_content}</span>
		  <hr style="margin-top:5px;">
		  
		  <c:choose>
		  <c:when test="${empty sonList[loop.count-1]}">
		  </c:when>
		  
		  <c:otherwise>
          <div id="re-re">
          <p style="display:inline;float:left;color:#616161;font-size:16px;margin-top:2px;">
          <fmt:formatDate value="${sonList[loop.count-1].son_re_date}" pattern="yyyy-MM-dd HH:mm:ss"/>
          </p>
		  <p style="float:left;font-family:KaiTi;margin-left:10px;color:#5650D8;">${reUList[loop.count-1].user_name}</p>
          <p style="float:left; font-family:KaiTi;">回复</p>
          <p style="float:left;color:#5650D8;font-family:KaiTi;">${uList[loop.count-1].user_name}</p>
          <p style="float:left;color:#000;font-family:KaiTi;">${sonList[loop.count-1].son_re_content}</p>
          </div>
          </c:otherwise>
           </c:choose>
         </div>        
     <c:choose>
	<c:when test="${empty user }">
 
            <div id="re-hit">
          <input class="btn btn-success btn-xs" type="button" id="hui${xname.pla_re_id}" value="回复" style="margin-left:100px;"/>
          <a href="javascript:void()" id="zkk${xname.pla_re_id}" style="margin-left:600px;">赞<span class="glyphicon glyphicon-thumbs-up"></span></a><a id="dz${xname.pla_re_id}" style="color:black;">${xname.pla_re_mark}</a>
       </div>
       
       

		<div class="input-group" id="aa${xname.pla_re_id}">
       <input type="text" class="form-control" id="con${xname.pla_re_id}" placeholder="我要回复" aria-describedby="basic-addon2">
       <span class="input-group-btn">
       <button class="btn btn-success" id="fkk${xname.pla_re_id}" type="button">发表</button>
       </div>
	</c:when>
	<c:otherwise>

       <div id="re-hit">
          <input class="btn btn-success btn-xs" type="button" id="hui${xname.pla_re_id}" value="回复" style="margin-left:100px;"/>
          <a href="javascript:void()" id="zan${xname.pla_re_id}" style="margin-left:600px;">赞<span class="glyphicon glyphicon-thumbs-up"></span></a><a id="dz${xname.pla_re_id}" style="color:black;">${xname.pla_re_mark}</a>
       </div>
       
       

		<div class="input-group" id="aa${xname.pla_re_id}">
       <input type="text" class="form-control" id="con${xname.pla_re_id}" placeholder="我要回复" aria-describedby="basic-addon2">
       <span class="input-group-btn">
       <button class="btn btn-success" id="fa${xname.pla_re_id}" type="button">发表</button>
       </div>	
					</c:otherwise>
					</c:choose>
    </div>
    <script type="text/javascript">  
   $(document).ready(function(e) {
	    $("#aa${xname.pla_re_id}").hide();
		$("#hui${xname.pla_re_id}").click(function (){
			$("#aa${xname.pla_re_id}").toggle("false");
		});

		$("#fa${xname.pla_re_id}").click(function(){
			
			var con=$("#con${xname.pla_re_id}").val();
			var uid=${uList[loop.count-1].id};
		$("#kong").load("faServlet",{content:con,uId:uid},function(){
			window.location.reload();
			
		});
		});
		$("#fkk${xname.pla_re_id}").click(function(){
			window.location.href='userLogin.jsp';

		});
		
		//点赞
		var az=0;
		$("#zan${xname.pla_re_id}").click(function(){
				var bool=az %2;
				if(bool==0){
					
					$("#dz${xname.pla_re_id}").html(" ");
					var count=${xname.pla_re_mark+1};
					var pla_re_id=${xname.pla_re_id};
					var usId=${uList[loop.count-1].id};
					$("#dz${xname.pla_re_id}").load("zanServlet",{count:count,pla_re_id:pla_re_id,usId:usId},function(){
					});
				}
				if(bool==1){
					$("#dz${xname.pla_re_id}").html(" ");
					var count=${xname.pla_re_mark};
					var pla_re_id=${xname.pla_re_id};
					var usId=${uList[loop.count-1].id};
					$("#dz${xname.pla_re_id}").load("zanServlet",{count:count,pla_re_id:pla_re_id,usId:usId},function(){	
					});
					}
				az=az+1;
		}); 	
		   
		$("#zkk${xname.pla_re_id}").click(function(){
			window.location.href='userLogin.jsp';
	});
	
  });
</script>
    </c:forEach>

  </div>
  </div>
</body>
</html>