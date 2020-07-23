package Service;

import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Dao.AdminDao;
import Domain.Admin;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月8日 下午2:26:08 

* 类说明 

*/
public class AdminService {
	private AdminDao adminDao = new AdminDao();
	public List<Admin> searchAdmin(String userName){		
		try {
			List<Admin> adminList = adminDao.searchAdmin(userName);
			System.out.println("get admin = "+ JSON.toJSONString(adminList));
			return adminList;
		}catch(SQLException e) {
			System.out.println("DB access error in AdminService.java");
			return null;
		}
	}
}
