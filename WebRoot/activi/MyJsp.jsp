<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form method='post' action='registTest' onSubmit='return checked()' enctype="multipart/form-data">                                                                              
		<div id='userName'>                                                                                                                           
			<div style='float: left; line-height: 50px;'>用户名:</div>                                                                                   
			<input type='text' name='uname' id='uname' style='width: 250px; height: 35px;margin-top: 5px' onblur='testUserName()'>                    
			<span id='uname_message'></span>                                                                                                          
		</div>                                                                                                                                        
                                                                                                                                                     
		<div id='sex'>                                                                                                                                
			性别:<input type='radio' id='csex' name='csex' value='男' checked>男                                                                          
			<input type='radio' name='csex' value='女' >女                                                                                              
		</div>                                                                                                                                        
                                                                                                                                                     
                                                                                                                                                     
        <div id='name'>                                                                                                                              
			<div style='float: left; line-height: 50px;'>姓名:</div>                                                                                    
			<input type='text' name='cname' id='cname' style='width: 250px; height: 35px;margin-top: 5px;margin-left: 10px' onblur='testName()'>      
			<span id='name_message'></span>                                                                                                           
		</div>                                                                                                                                        
           <div id='age'>                                                                                                                                
			<div style='float: left; line-height: 29px;'>出生日期:</div>                                                                                    
			<select name='year' id='year' style='height: 20px;margin-top: 5px;margin-left: 10px'>  
            <option value="1980">1980年</option>  
            <option value="1980">1981年</option>
            <option value="1980">1982年</option>
            <option value="1980">1983年</option>
            <option value="1980">1984年</option>
            <option value="1980">1985年</option>
            <option value="1980">1986年</option>
            <option value="1980">1987年</option>
            <option value="1980">1988年</option>
            <option value="1980">1989年</option>
            <option value="1980">1990年</option>
            <option value="1980">1991年</option>
            <option value="1980">1992年</option>
            <option value="1980">1993年</option>
            <option value="1980">1994年</option>
            <option value="1980">1995年</option>
            <option value="1980">1996年</option>
            <option value="1980">1997年</option>
            <option value="1980">1998年</option>
            <option value="1980">1999年</option>
            <option value="1980">2000年</option>      
			</select>
            
            <select id="month" name="month" style='height: 20px;margin-top: 5px;margin-left: 10px'>
            <option value="1">1月</option>
            <option value="2">2月</option>
            <option value="3">3月</option>
            <option value="4">4月</option>
            <option value="5">5月</option>
            <option value="6">6月</option>
            <option value="7">7月</option>
            <option value="8">8月</option>
            <option value="9">9月</option>
            <option value="10">10月</option>
            <option value="11">11月</option>
            <option value="12">12</option>
            </select>
           <select name="day" id="day" style='height: 20px;margin-top: 5px;margin-left: 10px'>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
            <option value="24">24</option>
            <option value="25">25</option>
            <option value="26">26</option>
            <option value="27">27</option>
            <option value="28">28</option>
            <option value="29">29</option>
            <option value="30">30</option>
            <option value="31">31</option>
           
           </select>               
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

