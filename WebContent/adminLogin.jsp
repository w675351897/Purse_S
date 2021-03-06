<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
			<script src ="./js/adminlogin.js" type="text/javascript" charset="utf-8"></script>
			<script src="./js/jquery-1.7.2.min.js" type="text/javascript" charset="utf-8"></script>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="./css/mui.css" rel="stylesheet" />
	</head>
	<body>
	<div id="">	
		<header class="mui-bar mui-bar-nav">
			<h1 class="mui-title">管理员登陆</h1>
		</header>
	</div>
		<br/>
		<br/>		
		<form action="./js/login.js" id="loginform" name="loginform" method="post"class="mui-input-group">
		    <div class="mui-input-row">
		        <label>用户名</label>
		    <input  type="text" name="username" id="username" class="mui-input-clear" placeholder="请输入管理员账户">
		    </div>
		    <div class="mui-input-row">
		        <label>密码</label>
		        <input type="password" name="password" id="password" class="mui-input-password" placeholder="请输入密码">
		    </div>
		    <div class="mui-button-row">
		        <button type="button" id="btn_login" class="mui-btn mui-btn-primary" onclick="login();" >验证</button>
				<br /><br />
		        <button type="button" id="btn_call" class="mui-btn mui-btn-danger" onclick="CallAdmin()">联系超级管理员</button>
		    </div>
			<br /><br /><br />
			<div align = "center">您若遗失相应权限账户信息，<br/>请联系本系统超级管理员。</div>
		</form>
		<script src="./js/mui.js"></script>
		<script type="text/javascript">
			mui.init()
		</script>
	</body>

</html>
