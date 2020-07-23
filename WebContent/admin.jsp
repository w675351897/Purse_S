<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!doctype html>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
	</head>

	<body>
	<%String name=request.getParameter("name"); %>
		<!-- 主界面菜单同时移动 -->
			<!-- 侧滑导航根容器 -->
			<div class="mui-off-canvas-wrap mui-draggable">
				<!-- 主页面容器 -->
				<div class="mui-inner-wrap">
					<!-- 菜单容器 -->
					<aside class="mui-off-canvas-left" id="offCanvasSide">
						<div class="mui-scroll-wrapper">
							<div class="mui-scroll">
								<!-- 菜单具体展示内容 -->
								<a href="login/adminLogin.html">
									您已经登陆，管理员。
								<!-- <img border="0" src="images/purse.png" width="64dp" height="64dp"> -->
								</a>
							
							</div>
							
						</div>
					</aside>
					<!-- 主页面标题 -->
					<header class="mui-bar mui-bar-nav">
						<a class="mui-icon mui-action-menu mui-icon-bars mui-pull-left" href="#offCanvasSide"></a>
						<h1 class="mui-title">欢迎您，管理员</h1>
					</header>
					<nav class="mui-bar mui-bar-tab">
						<a class="mui-tab-item mui-active">
							<span class="mui-icon mui-icon-plus"></span>
							<span class="mui-tab-label">首页</span>
						</a>
						<a class="mui-tab-item">
							<span class="mui-icon mui-icon-bars"></span>
							<span class="mui-tab-label">账目</span>
						</a>
						<a class="mui-tab-item">
							<span class="mui-icon mui-icon-list"></span>
							<span class="mui-tab-label">报表</span>
						</a>
						<a class="mui-tab-item" >
							<span class="mui-icon mui-icon-gear"></span>
							<span class="mui-tab-label">设置</span>
						</a>
					</nav>
					<!-- 主页面内容容器 -->
					<div class="mui-content mui-scroll-wrapper">
						<div class="mui-scroll">
						
							<!-- 主界面具体展示内容 -->
							<!-- <form action="UserCheck" method="get">  -->
							
							<a class="mui-btn" href="/Purse_RE_Shame/UserCheck?name=<%out.print(name);%>">启动管理员权限</a>
								
						</div>
					</div>
			   	 <div class="mui-off-canvas-backdrop"></div>
				</div>
			</div>
		<script src="js/mui.js"></script>
		<script type="text/javascript">
			function jump(){
				window.location.href="/Purse_RE_Shame/UserCheck?name="+<%out.print(name);%>;	
				
			}
			/*mui.init()
			mui(document.body).on('tap', '.mui-btn', function(e) {
			    mui(this).button('loading');
			    setTimeout(function() {
			        mui(this).button('reset');
			    }.bind(this), 2000);
			});*/
		</script>
	</body>

</html>
    