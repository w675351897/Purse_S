<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
		<style>
			/*点击变蓝色高亮*/
			.mui-table-view-cell.mui-active{
				background-color: #0062CC;
			}
		</style>
		<script src =“ https://unpkg.com/axios/dist/axios.min.js”></script>
		<script src="js/mui.js"></script>
		<script src="js/userMain.js"></script>
		<script type="text/javascript">
			mui.init()
		</script>
	</head>

	<body>
	<%String name=request.getParameter("name"); %>
		<script>
			
		</script>
		<div id="app">
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
										<img border="0" src="images/purse.png"  align="center" width="64dp" height="64dp">
									</div>
								</div>
							</aside>
							<!-- 主页面标题 -->
							<header class="mui-bar mui-bar-nav">
								<a class="mui-icon mui-action-menu mui-icon-bars mui-pull-left" href="#offCanvasSide"></a>
								<h1 class="mui-title">“荷包”用户主页</h1>
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
								<a class="mui-tab-item">
									<span class="mui-icon mui-icon-contact"></span>
									<span class="mui-tab-label">个人中心</span>
								</a>
							</nav>
							<!-- 主页面内容容器 -->
							<div class="mui-content mui-scroll-wrapper">
							
								<div class="mui-scroll">
									<!-- 主界面具体展示内容 -->
										<div id="AccountShowArea" >
										
									<a class="mui-btn" href="/Purse_RE_Shame/UserData?name=<%out.print(name);%>">进入账户</a>
									
								</div>
							 </div>
							</div>
					   	 <div class="mui-off-canvas-backdrop"></div>
						</div>
					</div>
				</div>
			</body>
</html>
