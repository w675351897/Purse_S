package Service;

import java.util.List;

import com.alibaba.fastjson.JSON;

import Dao.UserDataDao;
import Domain.Account;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月19日 下午6:03:10 

* 类说明 

*/
public class UserDataService {
	private UserDataDao userdatadao = new UserDataDao();
	public List<Account> searchUserData(String name){
		try {
			List<Account> accountList = userdatadao.searchAccountData(name);
			System.out.println("get UserData"+JSON.toJSONString(accountList));
			return accountList;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DB access error In UserDataService.");
			return null;
		}
	}
	
}
