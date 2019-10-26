package Living.Purse_Re.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import Living.Purse_Re.Domain.AccountType;
import Living.Purse_Re.Service.AccountTypeService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月21日 上午9:18:42 

* 类说明 

*/
@WebServlet("/AccountTypeFindAll")

public class AccountTypeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(getClass());
	private AccountTypeService accountTypeService = new AccountTypeService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountTypeController () {
        super();
        // TODO Auto-generated constructor stub
    }
	
	private void list(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<AccountType> accountTypeList = accountTypeService.query();
			request.setAttribute("accountTypeList",accountTypeList);
			ServletContext app = request.getServletContext();
			app.setAttribute("accountTypeList", accountTypeList);
			
//			request.getRequestDispatcher("/sys/cuisineList.jsp").forward(request, response);
			request.getRequestDispatcher("/js/accountType.js").forward(request, response);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void doGet(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String method = request.getParameter("method");
		
		if("list".equals(method)) {
			list(request,response);
		}else if("search".equals(method)) {
			String keyword = request.getParameter("keyword");
			List<AccountType> accountTypeList = accountTypeService.query(keyword);
			request.setAttribute("accountTypeList", accountTypeList);
			request.getRequestDispatcher("/js/accountList.js").forward(request, response);
			
			
		}else if("insert".equals(method)) {			
			String name = request.getParameter("name");
			AccountType accountType = new AccountType();
			accountType.setTypeName(name);
			accountTypeService.add(accountType);	
			list(request,response);
		}else if("show".equals(method)) {
			String id = request.getParameter("id");
			log.info("后台编辑操作回去传回id="+id);
			AccountType accountType = accountTypeService.findById(Integer.valueOf(id));	
			request.setAttribute("accountType", accountType);
			
			request.getRequestDispatcher("/sys/accountType.js").forward(request, response);
		
		}else if("update".equals(method)) {			
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			AccountType accountType = new AccountType();
			accountType.setTypeName(name);
			accountType.setTypeId(Integer.valueOf(id));
			accountTypeService.update(accountType);	
			list(request,response);
		}else if("delete".equals(method)) {
			String id = request.getParameter("id");
			log.info("后台编辑操作回去传回id="+id);
			accountTypeService.delete(Integer.valueOf(id));	
			list(request,response);
		}
		
//		AccountTypeService accountTypeService = new AccountTypeService();
//		List<AccountType> accountTypeList = accountTypeService.findById();
		
		
//		GoodsTypeService goodsTypeService = new GoodsTypeService();
//		List<GoodsType> goodsTypeList = goodsTypeService.findAll();
//		request.setAttribute("goodsTypeList", goodsTypeList);
//		request.getRequestDispatcher("/admin/goodstype/show.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	
}
