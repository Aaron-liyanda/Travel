<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="js/jquery-1.10.1.min.js"></script>
<script src="js/side.js" type="text/javascript"></script>

<script type="text/javascript">
	var upload = "${upload}"; 
	if(upload=="" || upload==undefined ){
		
	}else{
		alert(upload);
	}
</script>

<script type="text/javascript" >
	/**
	 * 三级联动，国->省->城市
	 */
    var pro=[["1","中国内地"],["2","港澳台"]];//最高级   
    var city=[["1","北京","1"],["1","湖南","2"],["1","广东","3"],["1","西藏","4"],
              ["1","陕西","5"],["1","山西","6"],["1","湖北","7"],["1","广西","8"],
              ["1","福建","9"],["1","宁夏","10"],["1","黑龙江","11"],["1","海南","12"],
              ["1","山东","13"],["1","青海","14"],["1","甘肃","15"],["1","内蒙古","16"],
              ["1","云南","17"],["1","重庆","18"],["1","四川","19"],["1","天津","20"],
              ["1","上海","21"],["1","江西","22"],["1","河南","23"],["1","河北","24"],
    ["2","香港特别行政区","13"],["2","澳门特别行政区","14"],["2","台湾","15"]];//省
    var county=[["1","北京市"],
        ["2","长沙市"],["2","岳阳市"],["2","邵阳市"],["2","湘潭市"],["2","张家界"],["2","湘西"],["2","衡阳市"],
        ["2","株洲市"],["2","常德市"],["2","益阳市"],["2","怀化市"],["2","永州市"],["2","郴州市"],
        ["3","广州市"],["3","深圳市"],["3","花都市"],["3","佛山市"],["3","中山市"],["3","惠州市"],["3","湛江市"],["3","韶关市"],
        ["3","梅州市"],["3","汕头市"],
        ["7","武汉市"],["7","黄石市"],["7","十堰市"],["7","襄阳"],["7","鄂州"],["7","荆门"],["7","孝感市"],
        ["7","荆州市"],["7","咸宁市"],["7","随州市"],["7","黄冈市"],
        ["19","成都市"],["19","自贡市"],["19","攀枝花市"],["19","泸州市"],["19","德元市"],["19","广元市"],["19","绵阳市"],
        ["19","内江市"],["19","遂宁市"],["19","乐山市"],["19","宜宾市"],["19","广安市"],
        ["5","西安市"],["5","咸阳市"],["5","商洛市"],["5","延安市"],["5","渭南市"],["5","安康市"],["5","铜川市"],
        ["4","拉萨市"],["4","西藏其他地区"],
        ["13","香港"],["14","澳门"],
    ["15","台中市"],["15","台南市"]];//城市
    $(function(){
//改动最高级,实现了省份、城市联动
        $("#pro").change(function (){
            var pro_citys;
            var city_countys;
            for(var i=0;i<city.length;i++){//循环city比较当前省份id，
//                city_countys="";//清空保存的县，使只保留该城市的县
                if($(this).val()==city[i][0]){//如果城市id==省份id，将该城市加入pro_citys
                    pro_citys+="<option value='"+city[i][2]+"'>"+city[i][1]+"</option>";
                    for(var j=0;j<county.length;j++){//再循环县id比较当前得到的城市id
                        if(city[i][2]==county[j][0]){//如果县id等于城市id，加入city_countys
                            city_countys+="<option>"+county[j][1]+"</option>";
                        }
                    }
                    $("#county").html(city_countys);//将所有县打印
                    var test=$("#county option:checked").text();
                    $("#searchCity").val(test);                  									//test1
                }else if($(this).val()==0){//如果省份点击了-请选择-，则都显示-请选择-
                    pro_citys="<option value='0'>-选择省份-</option>";
                    //city_countys="<option value='0'>-请选择县-</option>";
                    $("#county").html("<option value='0'>-选择城市-</option>");
                }
            }
            $("#city").html(pro_citys);//将所有城市打印
        });
//点击城市联动县
        $("#city").change(function (){
            //alert($(this).val());
            var city_county;
            for(var i=0;i<county.length;i++){
                if($(this).val()==county[i][0]){
                    city_county+="<option>"+county[i][1]+"</option>";
                }
            }
            $("#county").html(city_county);
             var test=$("#county option:checked").text();
                    $("#searchCity").val(test); //test1
        });
        //城市联动
      	$("#county").change(function(){
      		 					var test=$("#county option:checked").text();
                    $("#searchCity").val(test); 
      	});
        
        //开始显示全部地区
        var pro_names="<option value='0'>-内地or其他-</option>";
        for(var i=0;i<pro.length;i++){
            pro_names+="<option value='"+pro[i][0]+"'>"+pro[i][1]+"</option>";
        }
        $("#pro").html(pro_names);
        //开始显示全部省份
        var citys="<option value=''>-选择省份-</option>";
        $("#city").html(citys);
        //设置开始默认城市
        var countys="<option value=''>-想去的城市-</option>";
        $("#county").html(countys);
        
       
    });   
</script>

</head>

<body>

<form action="upLoadImage" method="post" enctype="multipart/form-data">

<!-- Popup -->
<div id="Popup">

<!-- SubPopup -->
<div id="SubPopup">
<script type="text/javascript">
$(function(){
$(".select").each(function(){
var s=$(this);
var z=parseInt(s.css("z-index"));
var dt=$(this).children("dt");
var dd=$(this).children("dd");
var _show=function(){dd.slideDown(200);dt.addClass("cur");s.css("z-index",z+1);};
var _hide=function(){dd.slideUp(200);dt.removeClass("cur");s.css("z-index",z);};
dt.click(function(){dd.is(":hidden")?_show():_hide();});
dd.find("a").click(function(){dt.html($(this).html());_hide();});
$("body").click(function(i){ !$(i.target).parents(".select").first().is(s) ? _hide():"";});})})
</script>
<div class="form_boxC">
<p>"<span class="f_cB">*</span>"号为必填项目</p>

<table cellpadding="0" cellspacing="0">
<tr>
<th width="100">景点名称<span class="f_cB">*</span></th>
<td><div class="txtbox floatL" style="width:100px;"><input name="sen_name" type="text" size="5" value=""></div></td>
</tr>

<tr>
<th width="100">景点联系方式<span class="f_cB">*</span></th>
<td><div class="txtbox floatL" style="width:100px;"><input name="sen_phone" type="text" size="5" value=""></div></td>
</tr>

<!-- 三级联动 -->
<tr>
<th width="100">城市选择<span class="f_cB">*</span></th>
<td>
	<div>
	  	 中国:&nbsp;&nbsp;<select  name="pro" id="pro"></select>
		 省份:&nbsp;&nbsp;	<select  name="city" id="city"></select>
		 城市:&nbsp;&nbsp;	<select  name="county" id="county"></select>
		&nbsp;&nbsp;<input  type="text" id="searchCity"  value="北京市" name="finalCity" onfocus="javascript:if(this.value=='北京市')this.value='';"/>
		&nbsp;
</td>
</tr>

<tr>
<th width="100">图片上传(1)<span class="f_cB">*</span></th>
<td style="width: 200px"><input type="file" name="picture" value="选择图片">
</td>
</tr>
<tr>
<th width="100">图片上传(2)<span class="f_cB">*</span></th>
<td style="width: 200px"><input type="file" name="picture" value="选择图片">
</td>
</tr>
<tr>
<th width="100">图片上传(3)<span class="f_cB">*</span></th>
<td style="width: 200px"><input type="file" name="picture" value="选择图片">
</td>
</tr>

<tr>
<th>景点描述</th>
<td><div class="txtbox"><textarea name="sen_desc" cols="25" rows="5"></textarea></div><p class="f_cB pdg_t5">最多500字</p></td>
</tr>
</table>


</div>
</div>
<!-- SubPopup -->

<div id="BtmBtn">
<div class="btn_boxB floatR mag_l20"><input type="button" value="取消" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
<div class="btn_box floatR"><input type="submit" value="提交" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" ></input></div>
</div>				
</div>

</form>

<!-- /Popup -->
</body>
</html>