/**
 * 
 */
package Domain;
/** 
* @author 作者 Living: 
* @version 创建时间：2019年12月24日 上午10:28:25 
* @Description
*/
public class NeoAccount {
	private Integer Account_Id;
	private String Account_UId;
	private String Account_Type;
	private String Account_Price;
	private String Account_PL;
	private String Account_Date;
	private String DeleteSatuts;
	/**
	 * @return the account_Id
	 */
	public Integer getAccount_Id() {
		return Account_Id;
	}
	/**
	 * @param account_Id the account_Id to set
	 */
	public void setAccount_Id(Integer account_Id) {
		Account_Id = account_Id;
	}
	/**
	 * @return the account_UId
	 */
	public String getAccount_UId() {
		return Account_UId;
	}
	/**
	 * @param account_UId the account_UId to set
	 */
	public void setAccount_UId(String account_UId) {
		Account_UId = account_UId;
	}
	/**
	 * @return the account_Type
	 */
	public String getAccount_Type() {
		return Account_Type;
	}
	/**
	 * @param account_Type the account_Type to set
	 */
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	/**
	 * @return the account_Price
	 */
	public String getAccount_Price() {
		return Account_Price;
	}
	/**
	 * @param account_Price the account_Price to set
	 */
	public void setAccount_Price(String account_Price) {
		Account_Price = account_Price;
	}
	/**
	 * @return the account_PL
	 */
	public String getAccount_PL() {
		return Account_PL;
	}
	/**
	 * @param account_PL the account_PL to set
	 */
	public void setAccount_PL(String account_PL) {
		Account_PL = account_PL;
	}
	/**
	 * @return the account_Date
	 */
	public String getAccount_Date() {
		return Account_Date;
	}
	/**
	 * @param account_Date the account_Date to set
	 */
	public void setAccount_Date(String account_Date) {
		Account_Date = account_Date;
	}
	/**
	 * @return the deleteSatuts
	 */
	public String getDeleteSatuts() {
		return DeleteSatuts;
	}
	/**
	 * @param deleteSatuts the deleteSatuts to set
	 */
	public void setDeleteSatuts(String deleteSatuts) {
		DeleteSatuts = deleteSatuts;
	}

}
