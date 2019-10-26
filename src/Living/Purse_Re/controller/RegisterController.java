package Living.Purse_Re.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Living.Purse_Re.Domain.Admin;
import Living.Purse_Re.Domain.Result;
import Living.Purse_Re.Domain.User;
import Living.Purse_Re.Service.AdminService;
import Living.Purse_Re.Service.UserService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月23日 上午10:02:21 

* 类说明 

*/
@WebServlet("/userRegister")
public class RegisterController {
	public void doGet(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		
		String Username = request.getParameter("Username");
		String password = request.getParameter("password");
		
		UserService userService = new UserService();
		
		List<User> userList = userService.searchUser(Username);
		System.out.println("get service message ["+ JSON.toJSONString(userList));
		
		Result result = new Result();

		
		if(userList == null) {
			result.setSuccess("true");
			result.setErrMessage("Enable|REgisted|用户名未被占用");
		}else if(userList != null){
			result.setSuccess("false");
			result.setErrMessage("注册失败，该用户名已被占用"+Username);
		}else {
			result.setSuccess("false");
			result.setErrMessage("发生未知错误");
			
		}
		
		response.getWriter().write(JSON.toJSONString(result));
		response.getWriter().flush();
		response.getWriter().close();
		
	}
}
