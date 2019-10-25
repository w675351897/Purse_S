package Living.Purse_Re.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory;

/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月20日 下午2:42:00 

* 类说明 
* 教程DBUtils仿制品
* 复刻版本

*/
public class DBUtils {
	private static DataSource ds;
	
	static {
		Properties properties = new Properties();
		InputStream is = DBUtils.class.getResourceAsStream("/mysql.properties");
		try {
			properties.load(is);
			ds = BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataSource getDs() {
		return ds;
	}
	public static Connection getConnection(){
		try {
			return ds.getConnection();//从数据源对象获得连接;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("数据库连接失败！");
		}
		
}
	public static void closeConnection(Connection conn){
		try {
			if(conn !=null && ! conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);//接口
		}
	}
}
