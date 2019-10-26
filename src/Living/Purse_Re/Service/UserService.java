package Living.Purse_Re.Service;

import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Living.Purse_Re.Dao.AdminDao;
import Living.Purse_Re.Dao.UserDao;
import Living.Purse_Re.Domain.Admin;
import Living.Purse_Re.Domain.User;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午7:46:30 

* 类说明 

*/
public class UserService {
private UserDao userDao = new UserDao();
	
	public List<User> searchUser(String userName){		
		try {
			List<User> userList = userDao.searchUser(userName);
			System.out.println("get admin = "+ JSON.toJSONString(userList));
			return userList;
		}catch(SQLException e) {
			System.out.println("DB access error");
			return null;
		}
	}
}
