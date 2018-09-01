<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>修改个人信息</title>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<style>
    input:invalid{
      border:2px solid red;
    }
     .yanzheng{
      display:none;
      color:red;
    }
  </style>
</head>

<body>
<div style="width:600px;height:auto;margin:20px 0px 0px 100px;">
<form action="userServlet" method="post" enctype="multipart/form-data" onsubmit="return check(this)">
  <div class="form-group">
    <label >用户名</label>
    <input type="text" class="form-control" id="userName" name="userName" placeholder="少于十个字符" >
    <span id="nameValid" class="yanzheng">请输入合法用户名！</span>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">密码</label>
    <input type="password" class="form-control" id="userPwd" name="userPwd" placeholder="输入4到6位密码">
    <span id="userPwdValid" class="yanzheng">请输入合法密码！</span>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">手机号</label>
    <input type="text" class="form-control" id="userPhone" name="userPhone" placeholder="输入正确手机号码">
    <span id="userPhoneValid" class="yanzheng">请输入合法手机号</span>
  </div>
   <div class="form-group">
   <select id="province" class = "" onchange="chooseProvince(this)">
	<option value="1">请选择省</option>
		</select>
	<select id="city" onChange="chooseCity(this)">
	    <option value="1">请选择市</option>
	</select>
	<select id="area" onChange="aa()">
		<option value="1">请选择区</option>
	</select>
		<input type="text" id="act_city" name="act_city"/>
   </div>
    <div class="form-group">
    <label for="exampleInputPassword1">邮箱</label>
    <input type="email" class="form-control" id="userEmail" name="userEmail" placeholder="输入正确邮箱">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">QQ</label>
    <input type="text" class="form-control" id="userQQ" name="userQQ" placeholder="输入正确手机号码">
  </div>
  
           <div id='age'>                                      
			<div style=' line-height: 29px;'>出生日期:</div>                                                   
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
            <option value="12">12月</option>
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
  
  <div class="form-group" style="margin-top:20px;">
    <label for="exampleInputFile">上传图像</label>
    <input type="file" id="userPhoto" name="userPhoto">
  </div>
  
  <button type="submit" class="btn btn-success">提交</button>
  <button id = "reset-btn" class="btn btn-warning ">重置</button>
</form>
   </div>
    
	<script src = "js/index.js"></script>
	<script src="js/bdtest.js"></script>

</body>
</html>
