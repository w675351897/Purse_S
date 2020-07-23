package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Domain.Account;
import Service.UserDataService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月19日 下午5:59:14 

* 类说明 

*/

@WebServlet("/UserData")
public class UserDataController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset="+"utf-8");
		
		String name = request.getParameter("name");
		System.out.println("get message from browse["+name+"]");
		
		UserDataService userDataService = new UserDataService();
		List<Account>accountList = userDataService.searchUserData(name);
		
		request.setAttribute("accountList", accountList);
		//此处添加重定向，需考虑重新加载
		//已完善上一层考虑
		request.getRequestDispatcher("/userMain.jsp?name="+name).forward(request, response);
		
		
	}
}
