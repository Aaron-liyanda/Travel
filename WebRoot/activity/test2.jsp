<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<title>创建活动页面</title>                                                                                                                               
	<meta  http-equiv='Content-Type' content='text/html;charset=utf-8'>                                                                               
	<style type='text/css'>                                                                                                                          
	  div{                                                                                                                                            
	  	                                                                                                                                              
	  }                                                                                                                                               
	 	#userName {                                                                                                                                   
	 		margin: 200px 0px 0px 600px;                                                                                                              
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 		                                                                                                                                          
	 	}                                                                                                                                             
	 	#sex{                                                                                                                                         
            margin: 40px 0px 0px 600px;                                                                                                              
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 		                                                                                                                                          
                                                                                                                                                     
	 	}                                                                                                                                             
		#name {                                                                                                                                       
	 		margin: 22px 0px 0px 600px;                                                                                                               
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 	}                                                                                                                                             
	 	#age {                                                                                                                                        
	 		margin: 35px 0px 0px 600px;                                                                                                               
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 	}                                                                                                                                             
	 	#pwd{                                                                                                                                         
	 		margin: 35px 0px 0px 600px;                                                                                                               
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 	}                                                                                                                                             
	 	#regist {                                                                                                                                     
	 		margin: 35px 0px 0px 600px;                                                                                                               
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 	}        
	 	#photo {                                                                                                                                     
	 		margin: 35px 0px 0px 600px;                                                                                                               
	 		width: 500px;                                                                                                                             
	 		height: 50px;                                                                                                                             
	 	}                                                                                                                                           
	 </style>                                                                                                                                         
	 <script type='text/javascript'>                                                                                                                  
	 	function testUserName() {                                                                                                                     
	 		var regex=/^[0-9a-zA-Z][0-9a-zA-Z]{4,9}$/;                                                                                                
	 		var name=document.getElementById('uname').value;                                                                                          
             var bool=regex.test(name);                                                                                                              
          if (bool) {                                                                                                                                
              document.getElementById('uname_message').innerHTML='<font color=\"green\">合法</font';                                                   
          }                                                                                                                                          
		  else{                                                                                                                                       
		  document.getElementById('uname_message').innerHTML='<font color=\"red\">不合法</font>';                                                        
		  }                                                                                                                                           
		  return bool;                                                                                                                                
	 			}                                                                                                                                     
	function testName() {                                                                                                                             
	 		var regex=/^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$/;                                                                                       
	 		var tname=document.getElementById('cname').value;                                                                                         
             var bool=regex.test(tname);                                                                                                             
          if (bool) {                                                                                                                                
              document.getElementById('name_message').innerHTML='<font color=\"green\">合法</font';                                                    
          }                                                                                                                                          
		  else{                                                                                                                                       
		  document.getElementById('name_message').innerHTML='<font color=\"red\">不合法</font>';                                                         
		  }                                                                                                                                           
		  return bool;                                                                                                                                
	 	}                                                                                                                                             
	                                                                                                                                                  
	                                                                                                                                             
				                                                                                                                                      
		function testPwd() {                                                                                                                          
	 		var regex=/^([a-zA-Z0-9]|[._]){4,9}$/;                                                                                                    
	 		var pwd=document.getElementById('upwd').value;                                                                                            
             var bool=regex.test(pwd);                                                                                                               
          if (bool) {                                                                                                                                
              document.getElementById('upwd_message').innerHTML='<font color=\"green\">合法</font';                                                    
          }                                                                                                                                          
		  else{                                                                                                                                       
		  document.getElementById('upwd_message').innerHTML='<font color=\"red\">不合法</font';                                                          
		  }                                                                                                                                           
		  return bool;                                                                                                                                
	 			}                                                                                                                                     
       function checked(){                                                                                                                           
		                                                                                                                                              
	   if(testUserName()&&testNmae()&&testPwd()){                                                                                          
	         return true;                                                                                                                             
	            }                                                                                                                                     
		else{                                                                                                                                         
			return false;                                                                                                                             
				}                                                                                                                                     
				                                                                                                                                      
	   }                                                                                                                                              
	   function toLogin(){                                                                                                                            
		   location.href='LoginPage.jsp';                                                                                                                 
	   }                                                                                                                                              
	 </script>                                                                                                                                        
</head>                                                                                                                                              
<body>                                                                                                                                               
                                                                                                                                                     
	<form method='post' action='addActServlet' onSubmit='return checked()' enctype="multipart/form-data">                                                                              
		<div id='userName'>                                                                                                                           
			<div style='float: left; line-height: 50px;'>创建者:</div>                                                                                   
			<input type='text' name='act_user_id' id='act_user_id' style='width: 250px; height: 35px;margin-top: 5px' onblur='testUserName()'>                    
			<span id='uname_message'></span>                                                                                                          
		</div> 
		                                                                                                                                                                                                                                                                                     
        <div id='name'>                                                                                                                              
			<div style='float: left; line-height: 50px;'>姓名:</div>                                                                                    
			<input type='text' name='cname' id='cname' style='width: 250px; height: 35px;margin-top: 5px;margin-left: 10px' onblur='testName()'>      
			<span id='name_message'></span>                                                                                                           
		</div>                                                                                                                                        
            <div id='age'>                                                                                                                                
			<div style='float: left; line-height: 29px;'>出生日期:</div>                                                                                    
			<select name='year' id='year' style='height: 20px;margin-top: 5px;margin-left: 10px'>   
            <option value="1980">2018年</option>
            <option value="1980">2019年</option>       
			</select>
            <select id="month" name="month" style='height: 20px;margin-top: 5px;margin-left: 10px'>
            <option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option>
			<option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option>
            <option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option>
            </select><a>月</a>
            <select name="day" id="day" style='height: 20px;margin-top: 5px;margin-left: 10px'>
            <option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option>
            <option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option>
            <option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option>
            <option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option>
			<option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option>
            <option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option>
            <option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option>
            <option value="29">29</option><option value="30">30</option><option value="31">31</option>
           </select>  <a>日</a>             
		</div>                                                                                                             
                                                                                                                                                     
                                                                                                                                                     
		<div id='pwd'>                                                                                                                                
			<div style='float: left; line-height: 50px;'>密码:</div>                                                                                    
			<input type='password' name='password' id='upwd' style='width: 250px; height: 35px;margin-top: 5px;margin-left: 10px' onblur='testPwd()'> 
			<span id='upwd_message'></span>                                                                                                           
		</div>                                                                                                                                        
             
                <div id="photo" >上传图像：<input type="file" name="photo" /></div><br/>                                                                                                                                        
                                                                                                                                                     
        <div id='regist'>                                                                                                                            
        	<input type='submit' name='注册' style='margin-left: 70px;width: 50px;height: 30px'>                                                        
        	<input type='button' value='返回登录' style='margin-left: 80px;line-height: 50px;width: 80px;height: 30px' onClick='toLogin()'>                 
        </div>                                                                                                                                       
                                                                                                                                                     
	</form>                                                                                                                                           

</body>
</html>