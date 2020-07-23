package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Domain.UserCheck;
import Service.UserCheckService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月20日 下午11:29:31 

* 类说明 

*/
@WebServlet("/UserCheck")
public class UserCheckController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset="+"utf-8");
	
		

		String name = request.getParameter("name");
		
		System.out.println("xxxxxxxxxxxxxxx"+name);
		
		UserCheckService userCheckService = new UserCheckService();
		List<UserCheck> userCheckList = userCheckService.searchUser();
		System.out.println("get UserCheckService Message ["+JSON.toJSONString(userCheckList));
		
		request.setAttribute("userCheckList", userCheckList);

		request.getRequestDispatcher("/adminIndex.jsp?name="+name).forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
