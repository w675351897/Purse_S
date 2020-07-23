<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
	</head>

	<body>
		<script src="./js/mui.js"></script>
		<script src="./js/index.js"></script>
		<script type="text/javascript">
			mui.init();
			// mui.openWindow({
			// 	url:/login/userloging.html
			// })
			
		</script>
		
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
									<button type="button" class="mui-btn mui-btn-danger" onclick="adminLogin()">管理员登陆</button>
							</div>
							
						</div>
					</aside>
					<!-- 主页面标题 -->
					<header class="mui-bar mui-bar-nav">
						<a class="mui-icon mui-action-menu mui-icon-bars mui-pull-left" href="#offCanvasSide"></a>
						<h1 class="mui-title">欢迎使用“荷包”</h1>
					</header>

					<!-- 主页面内容容器 -->
					<div class="mui-content mui-scroll-wrapper">
						<div class="mui-scroll">
							<!-- 主界面具体展示内容 -->
							<div class="mui-input-row mui-input-range">
							</div>
								
							<form align="center">
								<img src="images/purse.png" align="center" alt="如若出现此语句,则代表logo资源出错;">
							</form>
							<br />
							<br />
							<br />
							<div>
								<form align="center">
									<button type="button" class="mui-btn mui-btn-primary" onclick="userLogin()">登陆</button>
									
									<button type="button" class="mui-btn mui-btn-warning" onclick="reg()">注册</button>
								</form>
							</div>
						</div>
					</div>
			   	 <div class="mui-off-canvas-backdrop"></div>
				</div>
			</div>
		
	</body>

</html>
