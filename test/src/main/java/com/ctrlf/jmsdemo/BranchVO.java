package com.ctrlf.jmsdemo;

import java.io.Serializable;

public class BranchVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int buId;
	private int partyid;
	private String companyname;
	private int servicename;
	private int contractorid;
	
	//Added for JMS impl
	private String Month;
	private String Year;

	public int getBuId() {
		return buId;
	}
	public void setBuId(int buId) {
		this.buId = buId;
	}
	public int getPartyid() {
		return partyid;
	}
	public void setPartyid(int partyid) {
		this.partyid = partyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getServicename() {
		return servicename;
	}
	public void setServicename(int servicename) {
		this.servicename = servicename;
	}
	public int getContractorid() {
		return contractorid;
	}
	public void setContractorid(int contractorid) {
		this.contractorid = contractorid;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	@Override
	public String toString() {
		return "BranchVO [buId=" + buId + ", partyid=" + partyid + ", companyname=" + companyname + ", servicename="
				+ servicename + ", contractorid=" + contractorid + ", Month=" + Month + ", Year=" + Year + "]";
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
}
