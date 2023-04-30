package com.pershing.ot9.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OAHT_KEEP_OPN")
public class KeepOpen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sequenceNumber;
	
	@Column(name = "ACCT_ID")
	private String acctId;
	
	@Column(name="ACC_TY_CD")
	private String acTypeCd;
	
	@Column(name="CUSIP_ID")
	private String cusipId;
	
	@Column(name="CRT_TS")
	private String crtTs;
	
	@Column(name="UPDT_TS")
	private String updtTs;
	
	@Column(name="UPDT_USR_ID")
	private String updtUsrId;
	
	@Column(name="COM_SYM_ID")
	private String comSymId;
	
	@Column(name="ACCT_CLAS_CD")
	private String acctClasCd;
	
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getAcTypeCd() {
		return acTypeCd;
	}

	public void setAcTypeCd(String acTypeCd) {
		this.acTypeCd = acTypeCd;
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

	public String getAcctClasCd() {
		return acctClasCd;
	}

	public void setAcctClasCd(String acctClasCd) {
		this.acctClasCd = acctClasCd;
	}

	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	

}
