/**
 * 
 */
package Service;

import java.util.List;

import Dao.AccountDao;
import Domain.Insert;
import Domain.NeoAccount;

/** 
* @author 作者 Living: 
* @version 创建时间：2019年12月24日 下午1:38:09 
* @Description
*/
public class AccountService {
	
	
	private AccountDao accountDao = new AccountDao();
	
	public List<NeoAccount> searchAccount(String account_Date,String userName){
		
		try {
			List<NeoAccount> accountList = accountDao.searchAccount(account_Date, userName);
			return accountList;
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			System.out.println("DB access error in AccountService searchAccount");
			return null;
		}
		
	}
	public void insertAccount(Insert insert){
		try {
			accountDao.insertAccount(insert);
//			return insertAccount;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB access error in AccountService insertAccount");
//			return null;
			// TODO: handle exception
		}
	}

}
