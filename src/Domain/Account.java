package Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月28日 下午10:41:25 

* 类说明 

*/
public class Account {
	
	private Integer Account_Id;
	private String Account_Uid;
	private String Account_TypeId;
	private String Account_Price;
	private String Account_PL;
	private String Account_Date;
	private String DeleteSatuts;
	
	
	/**
	 * @return the account_Uid
	 */
	public String getAccount_Uid() {
		return Account_Uid;
	}
	/**
	 * @param account_Uid the account_Uid to set
	 */
	public void setAccount_Uid(String account_Uid) {
		Account_Uid = account_Uid;
	}
	/**
	 * @return the account_TypeId
	 */
	public String getAccount_TypeId() {
		return Account_TypeId;
	}
	/**
	 * @param account_TypeId the account_TypeId to set
	 */
	public void setAccount_TypeId(String account_TypeId) {
		Account_TypeId = account_TypeId;
	}
	public Integer getAccount_Id() {
		return Account_Id;
	}
	public void setAccount_Id(Integer account_Id) {
		Account_Id = account_Id;
	}
	
	public String getAccount_Price() {
		return Account_Price;
	}
	public void setAccount_Price(String account_Price) {
		Account_Price = account_Price;
	}
	public String getAccount_PL() {
		return Account_PL;
	}
	public void setAccount_PL(String account_PL) {
		Account_PL = account_PL;
	}
	public String getAccount_Date() {
		return Account_Date;
	}
	public void setAccount_Date(String account_Date) {
		Account_Date = account_Date;
	}
	public String getDeleteSatuts() {
		return DeleteSatuts;
	}
	public void setDeleteSatuts(String deleteSatuts) {
		DeleteSatuts = deleteSatuts;
	}
	
	
	

}
