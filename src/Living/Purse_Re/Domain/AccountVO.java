package Living.Purse_Re.Domain;
/** 

* @author 作者 Living（王立伟）: 

* @version 创建时间：2019年10月24日 上午10:09:18 

* 类说明 

*/
public class AccountVO {
	
	private double Account_Price;
	private Integer Account_Uid;
	private String Account_Date;
	private Integer DeleteStauts;
	private Integer Account_PL;//statement of profit or loss
	private Integer TypeId;
	private String TypeName;
	private Double priceBegin;
	private Double priceEnd;
	private String DateBegin;
	private String DateEnd;
	
	public Integer getTypeId() {
		return TypeId;
	}
	public void setTypeId(Integer typeId) {
		TypeId = typeId;
	}
	public String getTypeName() {
		return TypeName;
	}
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
	public double getAccount_Price() {
		return Account_Price;
	}
	public void setAccount_Price(double account_Price) {
		Account_Price = account_Price;
	}
	public Integer getAccount_Uid() {
		return Account_Uid;
	}
	public void setAccount_Uid(Integer account_Uid) {
		Account_Uid = account_Uid;
	}
	public String getAccount_Date() {
		return Account_Date;
	}
	public void setAccount_Date(String account_Date) {
		Account_Date = account_Date;
	}
	public Integer getDeleteStauts() {
		return DeleteStauts;
	}
	public void setDeleteStauts(Integer deleteStauts) {
		DeleteStauts = deleteStauts;
	}
	public Integer getAccount_PL() {
		return Account_PL;
	}
	public void setAccount_PL(Integer account_PL) {
		Account_PL = account_PL;
	}
	public Double getPriceBegin() {
		return priceBegin;
	}
	public void setPriceBegin(Double priceBegin) {
		this.priceBegin = priceBegin;
	}
	public Double getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(Double priceEnd) {
		this.priceEnd = priceEnd;
	}
	public String getDateBegin() {
		return DateBegin;
	}
	public void setDateBegin(String dateBegin) {
		DateBegin = dateBegin;
	}
	public String getDateEnd() {
		return DateEnd;
	}
	public void setDateEnd(String dateEnd) {
		DateEnd = dateEnd;
	}
}
