<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
		<title>注册界面</title>
		<link rel="stylesheet" href="css/reset_register.css" />
		<link rel="stylesheet" href="css/common_register.css" />
		<link rel="stylesheet" href="css/font-awesome.min_register.css" />
		
		<!-- 验证两次密码是否相同 -->
		<script type="text/javascript">
		function submit_form(){
			var ps1 = document.getElementById("ps1").value;
			var ps2 = document.getElementById("ps2").value;
			var name1 = document.getElementById("name1").value;
			
			if(ps1 == ps2 && name1 != "" && name1.length < 9 && name1 != undefined && ps1 != "" && ps1 != undefined && ps1.length >= 3 && ps1.length < 9){
		        alert("注册信息！");
		    	return true;
			}else{
				alert("注册信息错误！");
				return false;
			}
	                               
    }
	</script>
	
	<script type="text/javascript">
		function verify(){
			$(function(){
				if($("input[name='username']").val() == "" || $("input[name='username']").val() == null){
					//$("input[name='username']").after($("#username_test")); 
					//$("input[name='username']").val("用户名不能为空");
				}
			});
		}
	</script>
		
	</head>
	<body>
		<div class="wrap login_wrap">
			<div class="content">
				
				<div class="logo"></div>
				
				<div class="login_box">	
					
					<div class="login_form">
						<div class="login_title">
							注册
						</div>
						<form action="userRegister" method="post" id = "ll" onSubmit="return submit_form()">
							
							<div class="form_text_ipt">
								<input name="username" type="text" placeholder="用户名（长度八位以内）" id="name1" >
							</div>
							<div class="ececk_warning"><span>用户名不能为空</span></div>
							<div class="form_text_ipt">
								<input name="password" type="password" placeholder="密码（长度三到八位）" id="ps1" >
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div>
							<div class="form_text_ipt">
								<input name="repassword" type="password" placeholder="确认密码" id="ps2">
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div>
							<div class="form_text_ipt">
								<input name="phone" type="text" placeholder="手机号(选填)">
							</div>
							<div class="ececk_warning"><span>手机号不能为空</span></div>
							
							<div class="form_btn">
								<button  >注册</button>
							</div>
							
							<div class="form_reg_btn">
								<span>已有帐号？</span><a href="userLogin.jsp">马上登录</a>
							</div>
						</form>
						<div class="other_login">
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="js/jquery.min.js" ></script>
		<script type="text/javascript" src="js/common.js" ></script>
	</body>
</html>
