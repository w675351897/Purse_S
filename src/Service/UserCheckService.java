package Service;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月20日 下午11:20:57 

* 类说明 

*/

import java.util.List;

import com.alibaba.fastjson.JSON;

import Dao.UserCheckDao;
import Domain.UserCheck;

public class UserCheckService {
	private UserCheckDao userCheckDao = new UserCheckDao();
	
	public List<UserCheck> searchUser(){
		try {
			 List<UserCheck> userCheckList = userCheckDao.searchUser();
			System.out.println("get User = "+JSON.toJSONString(userCheckList));
			return userCheckList;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DB access error In UserCheckService.");
			return null;
		}
		
	}
}
