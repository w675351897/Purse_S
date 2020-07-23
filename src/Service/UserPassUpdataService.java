package Service;

import Dao.UserPassUpdataDao;
import Domain.UserPassUpdata;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月10日 下午2:59:53 

* 类说明 
* 更新密码服务层
* 非必要内容，可按需添加。

*/
public class UserPassUpdataService {
	public void updata(UserPassUpdata userPassUpdata) {
		// TODO Auto-generated method stub
		try {
			UserPassUpdataDao.updata(userPassUpdata);
		}catch(Exception e) {
			System.out.println("DB access error");
		}	
	}

}
