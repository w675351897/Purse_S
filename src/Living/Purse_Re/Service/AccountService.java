package Living.Purse_Re.Service;

import java.util.List;

import org.apache.log4j.Logger;

import Living.Purse_Re.Dao.AccountDao;
import Living.Purse_Re.Domain.Account;
import Living.Purse_Re.Domain.AccountVO;
import Living.Purse_Re.Domain.PageVO;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午7:46:54 

* 类说明 

*/
public class AccountService {
	private Logger log = Logger.getLogger(getClass());
	
	AccountDao accountDao = new AccountDao();
	
	public List<Account> query() {
		// TODO Auto-generated method stub
		try {
			return accountDao.query();
		}catch(Exception e) {
			log.error(e.getMessage());
			return null;
		}	
	}
	public PageVO<Account> query(AccountVO accountVO,int page, int n) {
		// TODO Auto-generated method stub
		PageVO<Account> pageVO = null;
		try {
			pageVO = new PageVO<Account>();
			//设置每页记录数量
			pageVO.setRecordOfPage(n);
			
			//获取总记录数量
			int recordCount = accountDao.queryCount(accountVO);
			pageVO.setRecordCount(recordCount);
			
			//计算总页数
			int pageCount = ((recordCount-1)/n)+1;
			pageVO.setPageCount(pageCount);
			
			//设置当前页
			if(page < 1)
				page = 1;
			
			if(page > pageCount)
				page = pageCount;
			
			pageVO.setPage(page);
			
			List<Account> accountList = accountDao.query(accountVO,page,n);
			
			pageVO.setList(accountList);
			
			return pageVO;
			
		}catch(Exception e) {
			log.error(e.getMessage());
			return null;
		}	
	}


}
