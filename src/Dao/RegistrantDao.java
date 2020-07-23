package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

import Domain.Registrant;
import Util.DBUtils;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年11月29日 下午4:29:34 

* 类说明 

*/
public class RegistrantDao {
	public List<Registrant> searchRegistrant(String registrantname) throws SQLException {
		List<Registrant> registrantList = new ArrayList<Registrant>();
		String sql = "select User_Name from User where ";
		
		System.out.println("Name ====="+registrantname);
		if(registrantname == null||("".equals(registrantname.trim()))) {
			System.out.println("NULL Reg in RegistrantDao.java");
			return null;
		}
		sql = sql +"User_Name ='"+registrantname+"'";
		System.out.println(sql);
	
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		
		while(rs.next()) {
			Registrant registrant = new Registrant();
			registrant.setRegistrantName(rs.getString("User_Name"));
			registrantList.add(registrant);
		}
		return registrantList;
	}
	public void insertUser(Registrant registrant) throws SQLException {
		String sql = "INSERT INTO User(User_Name,User_Password) values(?,?)";
		System.out.println("显示创建用户语句:"+sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, registrant.getRegistrantName());
		pstat.setString(2, registrant.getRegistrantPass());
		
		pstat.executeUpdate();
		System.out.println("更新成功"+JSON.toJSONString(registrant));
	}
	public void creatUser(Registrant registrant)throws SQLException {
		String sql = "CREATE TABLE `Account_"+registrant.getRegistrantName()+"`"+
				"(" + 
				" `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID'," + 
				" `Account_Uid` varchar(255) DEFAULT NULL," + 
				" `Account_TypeId` varchar(255) DEFAULT NULL COMMENT '交易种类'," + 
				" `Account_Price` varchar(255) NOT NULL," + 
				" `Account_PL` varchar(255) NOT NULL DEFAULT '1' COMMENT 'Statement of profit or loss'," + 
				" `Account_Date` varchar(255) NOT NULL," + 
				" `DeleteStauts` varchar(255) DEFAULT NULL COMMENT '删除状态'," + 
				" PRIMARY KEY (`Account_Id`)"
				+ ")";
		System.out.println(sql);
		
		Connection conn = DBUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.executeUpdate();
		
		System.out.println("创建表单成功 Account_"+registrant.getRegistrantName());
	}
}
