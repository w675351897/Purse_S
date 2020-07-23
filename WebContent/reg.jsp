<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<!doctype html>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
	</head>

	<body>
		<script src="js/mui.js"></script>
		<script src="js/jquery-1.7.2.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/reg.js"></script>
		<script type="text/javascript">
			mui.init();
			
		</script>
		<!-- 主界面菜单同时移动 -->
			<!-- 侧滑导航根容器 -->
			<div class="mui-off-canvas-wrap mui-draggable">
				<!-- 主页面容器 -->
				<div class="mui-inner-wrap">
					<!-- 菜单容器 -->
					<aside class="mui-off-canvas-left" id="offCanvasSide">
						<div class="mui-scroll-wrapper">
							<div class="mui-scroll" align="center">
								<!-- 菜单具体展示内容 -->
								<a>
									<label onclick="back()">回到主页</label>
									<a/>
							</div>
						</div>
					</aside>
					<!-- 主页面标题 -->
					<header class="mui-bar mui-bar-nav">
						<a class="mui-icon mui-action-menu mui-icon-bars mui-pull-left" href="#offCanvasSide"></a>
						<h1 class="mui-title">注册</h1>
					</header>
					<!-- 主页面内容容器 -->
					<div class="mui-content mui-scroll-wrapper">
						<div class="mui-scroll">
							<!-- 主界面具体展示内容 -->
							<div>
								<form class="mui-input-group">
								    <div class="mui-input-row">
								        <label>用户名</label>
								    <input type="text" class="mui-input-clear" name="username" id="username" placeholder="请输入用户名">
								    </div>
								    <div class="mui-input-row">
								        <label>密&nbsp;&nbsp;码</label>
								        <input type="password" class="mui-input-password" name="password" id="password" placeholder="请输入密码">
								    </div>
									<div class="mui-input-row">
									    <label>确认密码</label>
									    <input type="password" class="mui-input-password" name="repassword" id="repassword" placeholder="请再次输入密码">
									</div>
								    <div class="mui-button-row">
								        <button type="button" class="mui-btn mui-btn-primary" onclick="register();">确认</button>
										<button type="button" class="mui-btn mui-btn-danger" onclick="back()" >取消</button>
								    </div>
								</form>
							</div>
						</div>
					</div>
			   	 <div class="mui-off-canvas-backdrop"></div>
				</div>
			</div>

	</body>

</html>
