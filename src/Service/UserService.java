package Service;

import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Dao.UserDao;
import Domain.User;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月13日 下午10:01:41 

* 类说明 

*/
public class UserService {
	private UserDao userDao = new UserDao();
	
	public List<User> searchUser(String userName){
		try {
			List<User> userList = userDao.searchUser(userName);
			System.out.println("get user = "+ JSON.toJSONString(userList));
			return userList;
		}catch(SQLException e){
			System.out.println("DB access error In UserService.java;");
			return null;
		}
	}
//	public void creatUser(String userName) {
//		try {
//			List<User> userList = userDao.searchUser(userName);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
}
