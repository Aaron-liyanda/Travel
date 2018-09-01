<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	
<head>
		<meta charset="utf-8">
		<title>登录界面</title>
		<link rel="stylesheet" href="css/reset_register.css" />
		<link rel="stylesheet" href="css/common_register.css" />
		<link rel="stylesheet" href="css/font-awesome.min_register.css" />
		<script type="text/javascript">
		var message = "${message}";  //域中取值需要加引号
		//对message进行非空判断，判断方法与 普通java写法有区别
		if(message=="" || message==undefined ){
			
		}else{
			alert(message);
		}
		
	</script>
	
	<!-- 负责提交 -->
	<script type="text/javascript">
		function submit_frm(){
	        var frm = document.getElementById("ll");  
	        frm.action = "userLogin";  
	        frm.method = "post";
	        frm.submit();                        
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
							登录
						</div>
						<form action="userLogin" method="post" id="ll">
							
							<div class="form_text_ipt">
								<input name="username" value="" type="text" placeholder="用户名" onblur="verify()">
							</div>
							<div class="ececk_warning" id="username_test"><span>用户名不能为空</span></div>
							<div class="form_text_ipt">
								<input name="password" type="password" placeholder="密码">
							</div>
							<div class="ececk_warning" id="password_test"><span>密码不能为空</span></div>
							<div class="form_check_ipt">
								<div class="left check_left">
									<label><input type="checkbox" name="auto_login" value="1"> 下次自动登录</label>
								</div>
								<div class="right check_right">
								</div>
							</div>
							<div class="form_btn">
								<button  onclick="submit_frm();">登录</button>
							</div>
							<div class="form_reg_btn">
								<span>还没有帐号？</span><a href="userRegister.jsp">马上注册</a>
							</div>
						</form>
						<div class="other_login">
							<div class="left other_left">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="js/jquery.min.js" ></script>
		<script type="text/javascript" src="js/common.js" ></script>
	</body>
</html>
