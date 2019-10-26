package listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;

import Living.Purse_Re.Domain.AccountType;
import Living.Purse_Re.Service.AccountTypeService;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月22日 上午9:27:52 

* 类说明 

*/
@WebListener
public class contextListener {
	private Logger log = Logger.getLogger(getClass());
    /**
     * Default constructor. 
     */
    public contextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	//加载性别定义
    	AccountTypeService	accountTypeService = new AccountTypeService();
    	List<AccountType> accountTypeList = accountTypeService.query();
    	ServletContext app = sce.getServletContext();
    	app.setAttribute("accountTypeList",accountTypeList);
    	log.info("context初始化菜系信息"+JSON.toJSONString(accountTypeList));    	
    }

}
