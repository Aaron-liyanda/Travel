<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base href="<%=basePath%>">
    <meta charset="utf-8"> 
    <title>添加页面</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery_dev.js"></script>
	<script src="js/bootstrap.min.js"></script>
		<style>
		*{
			margin: 0;
		    padding: 0;
		    overflow: hidden;
		}
		.main {
		    background: #f6f7f8;
		    height: 800px;
		    width: 100%;
		    overflow: hidden;
		}
		.main-hd {
		    background: white;
		}
		.main-bd {
		    position: relative;
		   
		}
		.main-bd table {
		    position: relative;
		    left: 100px;
		    width: 550px;
		}
		.main-bd table tr td:first-child {
		    width:100px;
		}
		.place select {
			width:100px;	
			height:30px;
			cursor:pointer;
		
		}
	</style>
  </head> 
  
  <body>
          <div class="main">
          
        <div class = "main-bd">
            <form name="addAction" action="addActServlet" method="get" >
                <table class="table">   
                    <tr>
                        <td>活动名称</td>
                        <td> <input type="text" class="" id="act_name" name="act_name" placeholder="请输入活动名称"/></td>
                    </tr>
                    <tr>
                        <td>活动描述</td>
                        <td><textarea class="" cols = "36" rows = "3" id="act_desc" name="act_desc" placeholder="请输入活动描述"></textarea></td>
                    </tr>
                    <tr>
                        <td>旅行城市</td>
                        <td class = "place"> 
                            <select id="province" class = "" onchange="chooseProvince(this)">
								<option value="1">请选择省</option>
							</select>
							<select id="city" onChange="chooseCity(this)">
								<option value="1">请选择市</option>
							</select>
							<select id="area" onchange="aa()">
								<option value="1">请选择区</option>
							</select>
							 <input type="text" class="" id="act_city" name="act_city" placeholder=""/>
                       </td>
                    </tr>
                    <tr>
                        <td>人数上限</td>
                        <td><input type="text" class="" id="act_amount" name="act_amount" placeholder=""/></td>
                    </tr>
                    
                    <tr>
                        <td>已参加人数</td>
                        <td><input type="text" class="" id="act_apply_amount" name="act_apply_amount" placeholder=""/></td>
                    </tr>
                    <tr>
                        <td> 截止日期</td>
                        <td>
                            <select name='year' id='year' style='height: 20px;margin-top: 5px;margin-left: 10px'>   
                               <option value="2018">2018</option>
                               <option value="2019">2019</option>       
                            </select><a>年</a>
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
                            </select><a>日</a>
                          </td>
                      </tr>
                  </table>
                  <center>
                      <div class="alert-foot">
                          <button id = "submit-btn" class = "btn btn-danger">提交</button>
                          <button id = "reset-btn" class="btn btn-warning ">重置</button>
                          <br/>
                          <span>提交后显示所有活动区</span>
                      </div>
                  </center>
            </form>
        </div>
    </div>
    <script src="js/jquery_dev.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src = "js/addAct.js"></script>
  </body>
</html>