package Living.Purse_Re.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import Living.Purse_Re.Domain.Account;
import Living.Purse_Re.Domain.AccountType;
import Living.Purse_Re.util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月21日 上午9:22:41 

* 类说明 

*/
public class AccountTypeDao {
	private Logger log = Logger.getLogger(getClass());
	
	public List<Account> selectALL() throws SQLException{		
		return null;	
	}

	public void add(AccountType accountType)throws SQLException{
		String sql = "insert into accounttype(typeName) values(?)";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		pstat.setString(1, accountType.getTypeName());
		pstat.executeUpdate();
	}
	public void delete(int id) throws SQLException {
		log.info("测试log4j,删除id为"+id);
		String sql = "delete from accounttype where id = ?";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		pstat.setInt(1,id);
		pstat.executeUpdate();
	}
	public void update(AccountType accountType)throws SQLException{
		String sql = "update foodtype set typeName = ? where id = ?";
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		pstat.setString(1, accountType.getTypeName());
		pstat.setInt(2,accountType.getTypeId());
		
		pstat.executeUpdate();
	}
	public List<AccountType> query() throws SQLException {
		List<AccountType> accountTypeList = new ArrayList<AccountType>();
		String sql = "select id," + 
				"typeName" +
				" from foodtype";		
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery(sql);	
		while(rs.next()) {
			AccountType accountType = new AccountType();
			accountType.setTypeId(rs.getInt("id"));
			accountType.setTypeName(rs.getString("typeName"));
			accountTypeList.add(accountType);
		}
		return accountTypeList;
	}
	public AccountType findById(int id) throws SQLException {
		
		String sql = "select id,typeName from accounttype where id=?";		
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setInt(1,id);
		ResultSet rs = pstat.executeQuery();
		AccountType accountType = null;
		while (rs.next()) {
			accountType = new AccountType();
			accountType.setTypeId(rs.getInt("id"));
			accountType.setTypeName(rs.getString("typeName"));;
		}
		return accountType;
	}
	public List<AccountType> query(String keywood) throws SQLException {
		List<AccountType> accountTypeList = new ArrayList<AccountType>();
		String sql = "select id," + 
				"typeName" +
				" from accountType where typeName like ?";		
		
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, "%"+keywood+"%");
		ResultSet rs = pstat.executeQuery();
		
		while(rs.next()) {
			AccountType accountType = new  AccountType();
			accountType.setTypeId(rs.getInt("id"));
			accountType.setTypeName(rs.getString("typeName"));
			accountTypeList.add(accountType);
		}			
		return accountTypeList;
	}
}
