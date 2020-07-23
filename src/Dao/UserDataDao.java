package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Domain.Account;
import Util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年12月19日 下午4:54:10 

* 类说明 

*/
public class UserDataDao {
	public List<Account> searchAccountData(String name)throws SQLException{
		
		List<Account> accountList = new ArrayList<Account>();
		
		String sql = "select * from Account_"+name;
//		String sql = "select * from Account_"+name+"order by Account_Id DESC";
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		System.out.println("三板斧就绪");
		while (rs.next()) {
			System.out.println("开始赋值，并循环。");
			Account account = new Account();
			account.setAccount_Id(rs.getInt("Account_Id"));
//			System.out.println(rs.getInt("Account_Id"));
//			account.setAccount_UId(rs.getString("Account_Uid"));
//			System.out.println(rs.getString("Account_UId"));
			account.setAccount_TypeId(rs.getString("Account_TypeId"));
//			System.out.println(rs.getString("Account_TypeId"));
			account.setAccount_Price(rs.getString("Account_Price"));
//			System.out.println(rs.getString("Account_Price"));
			account.setAccount_PL(rs.getString("Account_PL"));
//			System.out.println(rs.getString("Account_PL"));
			account.setAccount_Date(rs.getString("Account_Date"));
//			System.out.println(rs.getString("Account_Date"));
//			account.setDeleteSatuts(rs.getString("DeleteSatuts"));
//			System.out.println(rs.getString("DeleteSatuts"));
			accountList.add(account);
//			System.out.println("赋值成功");
		}
		return accountList;
	}
}
