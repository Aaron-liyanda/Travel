<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>投诉建议</title>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
   function tochange(){
    window.location.href="home.jsp";   
   }
</script>
</head>
<div>
<form action="adviceServlet" method="post">
<textarea class="form-control" name="advice" rows="3" id="advice" style="width:70%;margin-left:100px;margin-top:200px;" placeholder="请输入您所提的意见"></textarea>
<button type="submit" class="btn btn-success" style="margin-left:650px;" onclick="tochange()">提交</button>
</form>
</div>
<body>
</body>
</html>
