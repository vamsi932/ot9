package com.pershing.ot9.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class KeepOpenModel {
	
	
	@NotBlank(message="Account number required")
	@Size(min = 10, max = 10, message="Account number should be 10 digit")
	private String accountNumber;
	private String cusipId;
	private String crtTs;
	private String updtTs;
	private String updtUsrId;
	private String comSymId;
	private String expiryDate;
	private String strikePrice;
	@Size(min=1, max=1, message = "SoftDelete should not more than 1 character")
	@Pattern(regexp = "(Y|y|N|n)", message="SoftDelete is invalid value")
	private String softDelete;
	private String enteredBy;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCusipId() {
		return cusipId;
	}
	public void setCusipId(String cusipId) {
		this.cusipId = cusipId;
	}
	public String getCrtTs() {
		return crtTs;
	}
	public void setCrtTs(String crtTs) {
		this.crtTs = crtTs;
	}
	public String getUpdtTs() {
		return updtTs;
	}
	public void setUpdtTs(String updtTs) {
		this.updtTs = updtTs;
	}
	public String getUpdtUsrId() {
		return updtUsrId;
	}
	public void setUpdtUsrId(String updtUsrId) {
		this.updtUsrId = updtUsrId;
	}
	public String getComSymId() {
		return comSymId;
	}
	public void setComSymId(String comSymId) {
		this.comSymId = comSymId;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getStrikePrice() {
		return strikePrice;
	}
	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}
	public String getSoftDelete() {
		return softDelete;
	}
	public void setSoftDelete(String softDelete) {
		this.softDelete = softDelete;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	
	
	
	

}
