package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Domain.Result;
import Domain.User;
import Service.UserService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月13日 下午4:58:23 

* 类说明 

*/
@WebServlet("/userLogin")
public class UserLoginController  extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("UserLoginController获取用户名："+username+"获取密码："+password);
		
		UserService userService = new UserService();
		
		List<User> userList = userService.searchUser(username);

		System.out.println("get service message ["+ JSON.toJSONString(userList));
	
		Result result = new Result();
		
		if(userList == null) {
			result.setSuccess("false");
			result.setErrMessage("Not REgisted|该用户不存在");
		}else if(
				userList.get(0).getUser_Password().equals(password)
				) {
			result.setSuccess("true");
			result.setErrMessage("欢迎登录"+username);
			result.setSkip("/user.jsp");
		}else {
			result.setSuccess("false");
			result.setErrMessage("PSWError|用户名密码错误");
		}
		response.getWriter().write(JSON.toJSONString(result));
		response.getWriter().flush();
		response.getWriter().close();
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);
	}
}
