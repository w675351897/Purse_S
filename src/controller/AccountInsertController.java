/**
 * 
 */
package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Domain.Insert;
import Domain.NeoAccount;
import Domain.Result;
import Service.AccountService;


/** 
* @author 作者 Living: 
* @version 创建时间：2019年12月24日 上午10:02:50 
* @Description
*/
@WebServlet("/accountInsert")
public class AccountInsertController extends HttpServlet{
	
	
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String account_UId = request.getParameter("Account_UId");
		String account_Price = request.getParameter("Account_Pirce");
		String account_Type = request.getParameter("Account_Type");
		String account_PL = request.getParameter("Account_PL");
		String account_Date = request.getParameter("Account_Date");
		
		String userName = request.getParameter("name");
		
		System.out.println("get Message from browse"
//				+"["+account_UId+"]"
				+"["+account_Type+"]"
				+"["+account_Price+"]"
				+"["+account_PL+"]"
				+"["+account_Date+"]"
				+"["+userName+"]");
		
		Insert insert = new Insert();
		
		insert.setAccount_Date(account_Date);
		insert.setAccount_PL(account_PL);
		insert.setAccount_Price(account_Price);
		insert.setAccount_Type(account_Type);
		insert.setName(userName);
		
		AccountService  accountService = new AccountService();
		
		accountService.insertAccount(insert);
		response.sendRedirect("/Purse_RE_Shame/UserData?name=" + userName);
		
		
//		request.getRequestDispatcher("/userMain.jsp?name="+userName).forward(request, response);
		
		
//		List<NeoAccount> accountList = accountService.searchAccount(account_Date, userName);
		
//		Result result = new Result();
		
//		if(accountList == null) {
//			result.setSuccess("false");
//			result.setErrMessage("not null|填写不能为空");
//		}else if(accountList.size() == 0 ) {
//			result.setSuccess("true");	
//			result.setErrMessage("enten succerssed|录入成功");
//			//跳转目标需要修改
//			//已经完善
//			request.getRequestDispatcher("/userMain.jsp?name="+userName).forward(request, response);
////			result.setSkip("/userMain.jsp?name"=+name).forward(request, response);
//		}else {
//			result.setSuccess("false");
//			result.setErrMessage("had entened|已经存在");
//		}
//		response.getWriter().write(JSON.toJSONString(result));
//		response.getWriter().flush();
//		response.getWriter().close();
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
