<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
	<head>
		<script src ="./js/mui.js"></script>
		<script src ="./js/userlogin.js" type="text/javascript" charset="utf-8"></script>
		<script src ="./js/jquery-1.7.2.min.js" type="text/javascript" charset="utf-8"></script>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="./css/mui.css" rel="stylesheet" />
		<style>
			.mui-content-padded {
				margin-top: 25px;
			}
			.mui-btn {
				padding: 10px;
			}
			#form{
				width:300px;
				height:160px;
				position:relative;
				left:50%;
				top:50%;
				margin-left:-150px;
				margin-top:-80px;
						  }
		</style>
	</head>

	<body>
<!-- 		<script src="./js/userlogin.js"></script> -->
		<script type="text/javascript">
			mui.init()
		</script>
		<header class="mui-bar mui-bar-nav">
			<h1 class="mui-title">用户登录</h1>
		</header>
		<br/>
		<br/>
		<br/>
		<form method="get" class="mui-input-group">
		    <div class="mui-input-row">
		        <label>用户名</label>
		    <input type="text" name="username" id="username"  class="mui-input-clear" placeholder="请输入用户名">
		    </div>
		    <div class="mui-input-row">
		        <label>密码</label>
		        <input id="password" type="password" class="mui-input-password" placeholder="请输入密码">
		    </div>
			
		    <div class="mui-button-row">
		    
		    <!-- <button type="button" id="btn_login" class="mui-btn mui-btn-primary" onclick="login();" >验证</button> -->
			<button id="loginbutton" name="loginbutton" type="button" class="mui-btn mui-btn-block mui-btn-primary" onclick="login();">登录</button>
		    <br/>
		    <br/>
		    <br/>
		    </div>
			<form margin='auto'>
			<div align="center" class="mui-content-padded">
				<div class="link-area">
					<a id='reg' onclick="reg()" >注册账号</a> 
				</div>
			</div>
			</form>
		</form>
		
	</body>

</html>
