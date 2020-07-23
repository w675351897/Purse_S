package Service;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月29日 下午4:27:50 

* 类说明 

*/

import java.util.List;

import com.alibaba.fastjson.JSON;

import Dao.RegistrantDao;
import Domain.NeoUser;
import Domain.Registrant;

public class RegistrantService {
	private RegistrantDao registrantDao = new RegistrantDao() ;
	
	public List<Registrant> searchRegistrant (String name){
		try {
			List<Registrant> registrantList = registrantDao.searchRegistrant(name);
			System.out.println("获取注册｜get registrant"+JSON.toJSONString(registrantList));
			return registrantList;
		} catch (Exception e) {
			System.out.println("数据库链接失败｜DB access error");
			// TODO: handle exception
			return null;
		}
	}
	
	public void neoUser(NeoUser neoUser) {
		Registrant registrant = new Registrant();
		try {
			registrant.setRegistrantName(neoUser.getRegistrantName());
			registrant.setRegistrantPass(neoUser.getRegistrantPass());
			
			registrantDao.insertUser(registrant);
			registrantDao.creatUser(registrant);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("这里是RegistrantService｜数据库链接失败");
		
			// TODO: handle exception
			return;
		}
	}
}
