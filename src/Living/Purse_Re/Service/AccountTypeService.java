package Living.Purse_Re.Service;

import java.util.List;

import javax.management.Query;

import org.apache.log4j.Logger;

import Living.Purse_Re.Dao.AccountTypeDao;
import Living.Purse_Re.Domain.AccountType;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月22日 上午9:57:11 

* 类说明 

*/
public class AccountTypeService {
	private Logger log = Logger.getLogger(getClass());
	AccountTypeDao accountTypeDao = new AccountTypeDao();
	
	public void add(AccountType accountType) {
		try { 
			accountTypeDao.add(accountType);			
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
		}
	}
	public void delete(int d) {
		try {
			accountTypeDao.delete(d);
		} catch (Exception e) {
			log.error(e.getMessage());
			// TODO: handle exception
		}
	}
	public void update(AccountType accountType) {
		// TODO Auto-generated method stub
		try {
			accountTypeDao.update(accountType);
		}catch(Exception e) {
			log.error(e.getMessage());
		}	
	}
	public List<AccountType> query() {
	// TODO Auto-generated method stub
	try {
		return accountTypeDao.query();
	}catch(Exception e) {
		log.error(e.getMessage());
		return null;
	}		
}
	public AccountType findById(int id) {
		try {
			return accountTypeDao.findById(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
			return null;
		}
	}
	public List<AccountType> query(String keyword) {
		// TODO Auto-generated method stub
		try {
			return accountTypeDao.query(keyword);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
