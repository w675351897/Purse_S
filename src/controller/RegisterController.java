package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Domain.NeoUser;
import Domain.Registrant;
import Domain.Result;
import Domain.User;
import Service.RegistrantService;
import Service.UserService;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月13日 下午4:02:12 

* 类说明 
* 注册控制类

*/
@WebServlet("/userRegister")
public class RegisterController extends HttpServlet {
	public void doGet(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		
		String UserName = request.getParameter("username");
		String Password = request.getParameter("password");
		
		System.out.println("Message From Browse UserName:_"+UserName+"Password_:"+Password);
		
//		UserService userService = new UserService();
		RegistrantService registrantService = new RegistrantService();
//		List<User> userList = userService.searchUser(UserName);
		List<Registrant> registrantList = registrantService.searchRegistrant(UserName);
		
		System.out.println("Service Message"+JSON.toJSONString(registrantList));
		NeoUser neoUser = new NeoUser();
		neoUser.setRegistrantName(String.valueOf(UserName));
		neoUser.setRegistrantPass(String.valueOf(Password));
		
		Result result = new Result();
		if(registrantList == null) {
			result.setSuccess("false");
			result.setErrMessage("Not Null｜填写为空");
		}else if (registrantList.size() == 0) {
			result.setSuccess("success");
			result.setErrMessage("Register Success|用户注册成功");
			
			result.setSkip("/userLogin.jsp");
			
			registrantService.neoUser(neoUser);
		}else {
			result.setSuccess("false");
			result.setErrMessage("Was Regitered|此用户名已被注册");
		}
		response.getWriter().write(JSON.toJSONString(result));
		response.getWriter().flush();
		response.getWriter().close();
	}
}
