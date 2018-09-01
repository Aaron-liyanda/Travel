<%@page import="entity.Users"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<head>
<title>Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />	
<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/responsiveslides.css">
<script src="js/jquery_dev.js"></script>
<script src="js/jquery.min.js"></script>
<script src="js/responsiveslides.min.js"></script>
<script>	   
			    $(function () {
			      // Slideshow 1
			      $("#slider1").responsiveSlides({
			        maxwidth: 2500,
			        speed: 600
			      });
			});
</script>	
</head>
<body>
		<!---start--顶--->
			<div class="header">
				<div class="wrap" >
				<div class="logo" >
					<!--<a href="index.html"><img src="images/logo.png" title="logo" /></a>-->
					<a href="index.html"><img src="images/logo2.png" title="logo" height="40" width="80"/></a>
				</div>
				<div class="top-nav">
					<ul>
					<c:choose>
					<c:when test="${empty user }">
						<li class="active"><a href="index.jsp">Home</a></li>
						<li><a href="userLogin.jsp">组团吧</a></li>
						<li><a href="http://www.baidu.com/">旅游服务</a></li>
						<li><a href="userLogin.jsp">个人主页</a></li>
						<li><a href="userLogin.jsp">登录/注册</a></li>
					</c:when>
					<c:otherwise>
						<li class="active"><a href="index.jsp">Home</a></li>
						<li><a href="activity/index.jsp">组团吧</a></li>
						<li><a href="http://www.baidu.com/">旅游服务</a></li>
						<li><a href="home.jsp">个人主页</a></li>
						<li><a href="home.jsp">欢迎您：${user.user_name }</a></li>
						<li><a href="loginOutServlet">注销</a></li>
					</c:otherwise>
					</c:choose>
						
					
						
					</ul>
				</div>
				<div class="clear"> </div>
			</div>
		</div>
			<!---End-header---->			
		<!--start-image-slider--->
					<div class="image-slider">
						<!-- Slideshow 1 -->
					    <ul class="rslides" id="slider1">
					      <li><img src="images/slider4.jpg" alt=""></li>
					      <li><img src="images/slider2.jpg" alt=""></li>
					      <li><img src="images/slider3.jpg" alt=""></li>
					      <li><img src="images/slider1.jpg" alt=""></li>
						   </ul>
						 <!-- Slideshow 2 -->
					</div>
			<!--End-image-slider---->
		<!---End-wrap---->
		<div class="clear"> </div>		
		<!---start-content--内容-》欢迎语-》景点信息-->
		<div class="content">
			    <div class="content_top">
			    	<div class="wrap">
						<h1><a href="#">欢迎您的访问</a></h1>
						<p>驴趣旅游交友网站为旅行者提供原创实用的全国游旅行介绍和旅游指南、旅行社区和问答交流平台 </p>
						<span><a class="learnmore" href="#">LEARN MORE</a></span>
					</div>
			    </div>			  
			    <div class="sanjiliandong">
			    <br>
			    <font size="5">
			    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    	选择想去的城市:&nbsp;</font>	
			    			<select style="width:130px;font-size:20px;" name="pro" id="pro"></select>
						 <font size="5">省份:&nbsp;</font>	<select style="width:130px;font-size:20px;" name="city" id="city"></select>
						 <font size="5">城市:&nbsp;</font>	<select style="width:130px;font-size:20px;" name="county" id="county"></select>
						&nbsp;&nbsp;<input style="width:119px;font-size:20px;" type="text" id="searchCity"  value="北京市" name="searchCity" onfocus="javascript:if(this.value=='北京市')this.value='';"/>
						&nbsp;<input  style="width:119px;font-size:20px;" type="submit" value="查询城市" id="searchByCity"/>	
									
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
    ["3","广州市"],["3","深圳市"],["3","花都市"],["3","佛山市"],
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
        var citys="<option value='0'>-选择省份-</option>";
        $("#city").html(citys);
        //设置开始默认城市
        var countys="<option value='0'>-想去的城市-</option>";
        $("#county").html(countys);
        
       
    });   
			</script>

			</div>
			<script>
			$("#searchByCity").click(function(){
				var url="${pageContext.request.contextPath}/searchSenicByCityNameServlet?time="+new Date().getTime();
				var searchCityName=$("#searchCity").val();
				var sendDate={
						"cityName":searchCityName,		
				};
				$("#chang").load(url,sendDate,function(backDate,textStatus,xml){
				});	
			});			
			</script>			
			<script type="text/javascript">
			$(document).ready(function(e){ 
				var url="${pageContext.request.contextPath}/searchSenicByCityNameServlet?time="+new Date().getTime();
				var searchCityName=$("#searchCity").val();
				var sendDate={
						"cityName":searchCityName		
				};
				$("#chang").load(url,sendDate,function(backDate,textStatus,xml){					
				});
			   });
			</script>
			<!-- ajax动态更换的div部分1 -->			
			<div class="content-grids" >
				<div class="wrap">
				<div id="chang">
				 <div class="grid">
					<a href="/toShowServlet?id=31"><img src="images/sanxia1.jpg" title="三峡风光" /></a>
					<h3>长江三峡</h3>
					<p>看三峡经水路游三峡最为理想。一般提及游三峡，在没有特别指明其它游览方式的情况下，即为乘船游。一行水路，山好水好，景色奇骏，奇观异景，生态良好，物种丰富，满足你的猎奇心</p>
					<a class="button" href="/toShowServlet?id=31">More</a>
				</div>	
				</div>	
				<div class="clear"> </div>			
		 </div>
		 </div>
		 	<div class="specials-heading" >
						<h3>驴友推荐景点</h3>
					</div>
					<div id="searchDiv">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<font size="5">输入景点:</font><input style="width:130px;font-size:20px;" type="text" name="searchSenic" id="searchSenic" value="橘子洲"onfocus="javascript:if(this.value=='橘子洲')this.value='';"/>
	<input style="width:130px;font-size:20px;" type="submit" value="查询景点" id="searchBySenic"/>
	</div>
		 	<div class="content-grids"  >
				<div class="wrap">
				<!-- ajax动态更换的div部分2 -->	
				<div id="chang2">
					<div class="special-grid">
							<img src="images/grids-img3.jpg" title="image-name" />
							<a href="#">大雁塔</a>
							<p>大雁塔，历史的宝贵文化遗址，古香古色。</p>
						</div>
						</div>			
				<div class="clear"> </div>
			</div>
		 </div>		
			<div class="specials">	
	<script>
		$("#searchBySenic").click(function(){
		var url=
		"${pageContext.request.contextPath}/searchSenicByNameServlet?time="+new Date().getTime();//更新请求
		var senicName=$("#searchSenic").val();
		var sendDate={
				"senicName":senicName,		
		};
		$("#chang2").load(url,sendDate,function(backDate,textStatus,xml){
		});			
	});
	</script>
	<script type="text/javascript">
			$(document).ready(function(e){ 
				var url="${pageContext.request.contextPath}/searchSenicByNameServlet?time="+new Date().getTime();
				var senicName=$("#searchSenic").val();
				var sendDate={
						"senicName":senicName		
				};
				$("#chang2").load(url,sendDate,function(backDate,textStatus,xml){					
				});
			   });
			</script>
				<div class="wrap" >			
					<div class="specials-heading" >
						<h3>热门景点信息</h3>
					</div>
					<div class="specials-grids">						
						 <div class="grid">
					<a href="${pageContext.request.contextPath}/toShowServlet?id=29"><img src="images/sanya3.jpg" title="海南三亚胜景" /></a>
					<h3>海南三亚风情</h3>
					<p>中国空气质量最好的城市，拥有中国最美的海湾：三亚湾，也是中国最大最佳潜水基地。南方的旅游胜地。来一场舒心的旅途</p>
					<a class="button" href="${pageContext.request.contextPath}/toShowServlet?id=29">More</a>
				</div>
				<div class="grid">
					<a href="${pageContext.request.contextPath}/toShowServlet?id=30"><img src="images/xihu1.jpg" title="西湖美景" /></a>
					<h3>杭州西湖</h3>
					<p>东南形胜，三吴都会，钱塘自古繁华。烟柳画桥，风帘翠幕，参差十万人家。云树绕堤沙，怒涛卷霜雪，天堑无涯。市列珠玑，户盈罗绮，竞豪奢。
　　重湖叠巘清嘉，有三秋桂子，十里荷花。羌管弄晴，菱歌泛夜，嘻嘻钓叟莲娃。千骑拥高牙，乘醉听箫鼓，吟赏烟霞。异日图将好景，归去凤池夸。</p>
					<a class="button" href="${pageContext.request.contextPath}/toShowServlet?id=30">More</a>
				</div>	
				<div class="grid last-grid">
				<a href="${pageContext.request.contextPath}/toShowServlet?id=31"><img src="images/sanxia1.jpg" title="三峡风光" /></a>
					<h3>长江三峡</h3>
					<p>看三峡经水路游三峡最为理想。一般提及游三峡，在没有特别指明其它游览方式的情况下，即为乘船游。一行水路，山好水好，景色奇骏，奇观异景，生态良好，物种丰富，满足你的猎奇心</p>
					<a class="button" href="${pageContext.request.contextPath}/toShowServlet?id=31">More</a>
					
				</div>	
						<div class="clear"></div>
					</div>
			    </div>			    
			</div>	
			<div class="testmonials">
				<div class="wrap">
					<div class="testmonial-grid">
						<h3>旅行最好的部分，就是沿途的朋友</h3>
						<p>&#34;
					 无论你是一个新手背包客
					 还是一个经验丰富的旅行者，
					所有的旅行者都会赞同，
					旅行中最好的部分，
					就是你沿途中认识的朋友。
					我们在旅行途中探索新的生活方式，
					体验不同的文化，学习不同的生活方式。
					毫无疑问，在这些新奇的经历中
					所创造的纽带将会持续一生。
					用心去享受沿途的风景时，不要忘了收获的那些友谊。
					真正的旅行，从来不是一堆照片的堆砌和满足内心小小的虚荣，
					正因如此，旅行并不仅仅是去看风景，更难得的是旅行之前的期待、旅行进行时的感动和旅行归来时的回味无穷。&#34;</p>
						<a href="#">have a good trip</a>
					</div>
				</div>
			</div>
		</div>
		<!---End-content---->
		<div class="clear"> </div>		
		<!---start-footer---->
		<div class="footer">
			<div class="wrap">
			<div class="footer-grids">
				<div class="footer-grid">
					<h3>驴趣简介</h3>
					<p>驴趣旅游交友网站为旅行者提供原创实用的全国游旅行介绍和旅游指南、旅行社区和问答交流平台</p>
				</div>				
				<div class="footer-grid">
					<h3>帮助中心</h3>
					<ul>
						<li><a href="https://www.baidu.com/s?wd=%E6%80%8E%E4%BB%AC%E7%94%A8%E6%97%85%E6%B8%B8%E7%BD%91%E7%AB%99&rsv_spt=1&rsv_iqid=0xfbb853dc0004d6df&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=98012088_5_dg&oq=%25E6%2580%258E%25E4%25B9%2588%25E7%2594%25A8%25E7%25BD%2591%25E7%25AB%2599&inputT=1160&rsv_t=d577LqNitEQxJBJROB4n9PlymyU%2F8EJ3FSM7FlyKd4K0OKLzytlbVB59fLGZh55jnFZ1Pw&rsv_sug3=24&rsv_pq=eff1505d00051c77&rsv_sug1=15&rsv_sug7=100&rsv_sug2=0&rsv_sug4=1888" >新手指南</a></li>
						<li><a href="https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&ch=1&tn=98012088_5_dg&wd=%E6%9C%AC%E7%BD%91%E7%AB%99%E4%BF%9D%E7%95%99%E6%89%80%E6%9C%89%E8%A7%A3%E9%87%8A%E6%9D%83&oq=%25E4%25BF%259D%25E7%2595%2599%25E6%2589%2580%25E6%259C%2589%25E8%25A7%25A3%25E9%2587%258A%25E6%259D%2583&rsv_pq=a5bf42a400064940&rsv_t=32769r75M%2BNFMkg00LJtbPsCetnIDaH91uqrRPvSGoBx%2BDKSb8aAYzKzPTUGzDGsXTFmAg&rqlang=cn&rsv_enter=1&rsv_sug3=11&rsv_sug1=1&rsv_sug7=100&rsv_sug2=0&inputT=2373&rsv_sug4=3120">免责声明</a></li>
						<li><a href="http://www.elong.com/">旅行工具</a></li>
						<li><a href="https://map.baidu.com/">网站地图</a></li>
					</ul>
				</div>
				<div class="footer-grid">
					<h3>最新资讯</h3>
					<ul>
						<li><a href="http://www.ctrip.com/">携程</a></li>
						<li><a href="https://www.qunar.com/">去哪儿 </a></li>
						<li><a href="http://www.mafengwo.cn/">马蜂窝</a></li>
						<li><a href="https://lvyou.baidu.com/">百度旅游</a></li>
					</ul>
				</div>
				<div class="footer-grid footer-lastgrid">
					<h3></h3>
					<p></p>
					<div class="footer-grid-address">
						<p></p>
						<p></p>
						<p><a class="email-link" href="#"></a></p>
					</div>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
		</div>
		<!---End-footer---->
		<div class="clear"> </div>
</body>
</html>
