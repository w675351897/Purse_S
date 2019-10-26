package Living.Purse_Re.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

//import com.mysql.jdbc.Connection;

import Living.Purse_Re.Domain.Account;
import Living.Purse_Re.Domain.AccountVO;
import Living.Purse_Re.util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午3:45:46 

* 类说明 

*/
public class AccountDao {
private Logger log = Logger.getLogger(getClass());
	
	//查询菜系记录，全部记录返回
	public List<Account>query()throws SQLException{
		List<Account> accountList = new ArrayList<Account>();
		String sql = "select Account_Id,Account_Price,Account_Date,Account_PL," + 
		" from Account"+"";
		
		log.info("账目select查询sql="+sql);
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while(rs.next()) {
			Account account =  new Account();
			account.setAccount_Id(rs.getInt(""));
			account.setAccount_Price(rs.getDouble(""));
			account.setAccount_Date(rs.getString(""));
			account.setAccount_PL(rs.getInt(""));
			accountList.add(account);
		}		
		
		return accountList;
	
	}
	
	public List<Account> query(AccountVO accountVO,int page, int n) throws SQLException {
		List<Account> accountList = new ArrayList<Account>();
		String sql = "select Account_Id,Account_TypeId,Account_Price" + 
				" from Account where 1=1 ";		
		sql = sql + assembleSQL(accountVO);
		sql = sql + " order by id ";
		sql = sql + "limit " + ((page-1)*n) + ","	+ n;	
		log.info("菜名select查询sql="+sql);
		
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while(rs.next()) {
			Account account = new Account();
			account.setAccount_Id(rs.getInt("id"));
			account.setAccount_Date(rs.getString("date"));
			account.setAccountTypeId(rs.getInt("AccountType_id"));
			account.setAccount_Price(rs.getDouble("Account_Price"));
			accountList.add(account);
			
//			Account.setMprice(rs.getDouble("mprice"));
//			Account.setPrice(rs.getDouble("price"));
//			Account.setRemark(rs.getString("remark"));
//			Account.setImg(rs.getString("img"));
//			AccountList.add(Account);
		}		
		
		return accountList;
	}
	//根据入参id，删除对应记录
	public void delete(int id) throws SQLException {
		log.info("测试log4j,删除id为"+id);
		String sql = "delete from Account where id = ?";
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		pstat.setInt(1,id);
		
		pstat.executeUpdate();
	}


	public int queryCount(AccountVO accountVO) throws SQLException{
		String sql = "select  count(*)" + 
				" from Account where 1=1 ";		
		sql = sql + assembleSQL(accountVO);
		log.info("查询记录数sql="+sql);
		
		try {
			Connection conn = DBUtils.getConnection();
			
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	private String assembleSQL(AccountVO accountVO) {
		String sql = "";
		
		if(accountVO.getAccount_Date() 
				!= null && !"".equals(accountVO.getAccount_Date()))
			sql = sql + " and AccountName like '%" +accountVO.getAccount_Date()+"%'";
		
		if(accountVO.getTypeId() != 0)
			sql = sql + " and AccountType_id = " +accountVO.getTypeId();
		
		if(accountVO.getPriceBegin() != null)
			sql = sql + " and price >= " +accountVO.getPriceBegin();
		
		if(accountVO.getPriceEnd() != null)
			sql = sql + " and mprice <= " +accountVO.getPriceEnd();
			
		return sql;
	}
	
}
