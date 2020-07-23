/**
 * 
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Domain.Account;
import Domain.Insert;
import Domain.NeoAccount;
import Util.DBUtils;


/** 
* @author 作者 Living: 
* @version 创建时间：2019年12月24日 上午10:10:18 
* @Description
*/
public class AccountDao {
	
	public List<NeoAccount> searchAccount(String account_Date,String userName)throws SQLException{
		List<NeoAccount> accountList = new  ArrayList<NeoAccount>();
		
		String sql = "select * from Account_"+userName+"where";
		if(account_Date == null|| ("".equals(account_Date.trim()))) {
			return null;
		}
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while(rs.next()) {
			NeoAccount neo = new NeoAccount();
			neo.setAccount_Date(rs.getString("Account_Date"));
			accountList.add(neo);
		}
		return accountList;
	}
	public void insertAccount(Insert insert)throws SQLException{
//		 String Account_UId;
//		 String Account_Type;
//		 String Account_Price;
//		 String Account_PL;
//		 String Account_Date;
//		 String DeleteSatuts;
		
		System.out.println(insert.getName());
		System.out.println(insert.getAccount_Type());
		System.out.println(insert.getAccount_Price());
		System.out.println(insert.getAccount_PL());
		System.out.println(insert.getAccount_Date());
		 
		 String sql = "INSERT INTO Account_"+insert.getName()+"(Account_TypeId,Account_Price,Account_PL,Account_Date) values(?,?,?,?)";
		 
		 
		 System.out.println(sql);
		 
		 Connection conn = DBUtils.getConnection();
		 PreparedStatement pstat = conn.prepareStatement(sql);
		 
		 pstat.setString(1, insert.getAccount_Type());
		 pstat.setString(2, insert.getAccount_Price());
		 pstat.setString(3, insert.getAccount_PL());
		 pstat.setString(4, insert.getAccount_Date());
		 
		 System.out.println("准备插入数据库");
		 pstat.executeUpdate();
		 
		 System.out.println("Update success"+JSON.toJSONString(insert));
	}
}
