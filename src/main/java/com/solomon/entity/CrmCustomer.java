package com.solomon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CrmCustomer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CRM_CUSTOMER", schema = "DAVY")
public class CrmCustomer {

	// Fields

	private Long id;
	private String customerName;
	private String linkman;
	private String tel;
	private String fax;
	private String email;
	private String postcode;
	private String economyType;
	private String address;
	private String mobile;
	private String netAddress;
	private String industry;
	private Double registerCapital;
	private String corporateRep;
	private String businessLicence;
	private String taxReg;
	private String ciqNumber;
	private String bankName;
	private String accountName;
	private String bankAccount;
	private String supplierBrief;
	private String remarks;
	private String seaRouteAdvantage;
	private String locusHarbor;
	private String inlandBoat;
	private String overseasBoat;
	private String inlandBoatTon;
	private String overseasBoatTon;
	private String customerShortname;
	private String delstatus;
	private String customerNameEn;
	private Double demos;
	private Double dollar;
	private String hzStatus;
	private String hdStatus;
	private String cdStatus;
	private String cdongStatus;
	private String lxStatus;
	private Long role;

	// Constructors

	/** default constructor */
	public CrmCustomer() {
	}

	/** minimal constructor */
	public CrmCustomer(Long id) {
		this.id = id;
	}

	/** full constructor */
	public CrmCustomer(Long id, String customerName, String linkman, String tel, String fax, String email, String postcode,
			String economyType, String address, String mobile, String netAddress, String industry, Double registerCapital,
			String corporateRep, String businessLicence, String taxReg, String ciqNumber, String bankName, String accountName,
			String bankAccount, String supplierBrief, String remarks, String seaRouteAdvantage, String locusHarbor,
			String inlandBoat, String overseasBoat, String inlandBoatTon, String overseasBoatTon, String customerShortname,
			String delstatus, String customerNameEn, Double demos, Double dollar, String hzStatus, String hdStatus,
			String cdStatus, String cdongStatus, String lxStatus, Long role) {
		this.id = id;
		this.customerName = customerName;
		this.linkman = linkman;
		this.tel = tel;
		this.fax = fax;
		this.email = email;
		this.postcode = postcode;
		this.economyType = economyType;
		this.address = address;
		this.mobile = mobile;
		this.netAddress = netAddress;
		this.industry = industry;
		this.registerCapital = registerCapital;
		this.corporateRep = corporateRep;
		this.businessLicence = businessLicence;
		this.taxReg = taxReg;
		this.ciqNumber = ciqNumber;
		this.bankName = bankName;
		this.accountName = accountName;
		this.bankAccount = bankAccount;
		this.supplierBrief = supplierBrief;
		this.remarks = remarks;
		this.seaRouteAdvantage = seaRouteAdvantage;
		this.locusHarbor = locusHarbor;
		this.inlandBoat = inlandBoat;
		this.overseasBoat = overseasBoat;
		this.inlandBoatTon = inlandBoatTon;
		this.overseasBoatTon = overseasBoatTon;
		this.customerShortname = customerShortname;
		this.delstatus = delstatus;
		this.customerNameEn = customerNameEn;
		this.demos = demos;
		this.dollar = dollar;
		this.hzStatus = hzStatus;
		this.hdStatus = hdStatus;
		this.cdStatus = cdStatus;
		this.cdongStatus = cdongStatus;
		this.lxStatus = lxStatus;
		this.role = role;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 15, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CUSTOMER_NAME", length = 100)
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "LINKMAN", length = 30)
	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	@Column(name = "TEL", length = 100)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "FAX", length = 100)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "EMAIL", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "POSTCODE", length = 20)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "ECONOMY_TYPE", length = 20)
	public String getEconomyType() {
		return this.economyType;
	}

	public void setEconomyType(String economyType) {
		this.economyType = economyType;
	}

	@Column(name = "ADDRESS", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "MOBILE", length = 60)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "NET_ADDRESS", length = 40)
	public String getNetAddress() {
		return this.netAddress;
	}

	public void setNetAddress(String netAddress) {
		this.netAddress = netAddress;
	}

	@Column(name = "INDUSTRY", length = 20)
	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@Column(name = "REGISTER_CAPITAL", precision = 12)
	public Double getRegisterCapital() {
		return this.registerCapital;
	}

	public void setRegisterCapital(Double registerCapital) {
		this.registerCapital = registerCapital;
	}

	@Column(name = "CORPORATE_REP", length = 20)
	public String getCorporateRep() {
		return this.corporateRep;
	}

	public void setCorporateRep(String corporateRep) {
		this.corporateRep = corporateRep;
	}

	@Column(name = "BUSINESS_LICENCE", length = 40)
	public String getBusinessLicence() {
		return this.businessLicence;
	}

	public void setBusinessLicence(String businessLicence) {
		this.businessLicence = businessLicence;
	}

	@Column(name = "TAX_REG", length = 40)
	public String getTaxReg() {
		return this.taxReg;
	}

	public void setTaxReg(String taxReg) {
		this.taxReg = taxReg;
	}

	@Column(name = "CIQ_NUMBER", length = 40)
	public String getCiqNumber() {
		return this.ciqNumber;
	}

	public void setCiqNumber(String ciqNumber) {
		this.ciqNumber = ciqNumber;
	}

	@Column(name = "BANK_NAME", length = 100)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "ACCOUNT_NAME", length = 100)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "BANK_ACCOUNT", length = 40)
	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Column(name = "SUPPLIER_BRIEF", length = 1000)
	public String getSupplierBrief() {
		return this.supplierBrief;
	}

	public void setSupplierBrief(String supplierBrief) {
		this.supplierBrief = supplierBrief;
	}

	@Column(name = "REMARKS", length = 1000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "SEA_ROUTE_ADVANTAGE", length = 200)
	public String getSeaRouteAdvantage() {
		return this.seaRouteAdvantage;
	}

	public void setSeaRouteAdvantage(String seaRouteAdvantage) {
		this.seaRouteAdvantage = seaRouteAdvantage;
	}

	@Column(name = "LOCUS_HARBOR", length = 200)
	public String getLocusHarbor() {
		return this.locusHarbor;
	}

	public void setLocusHarbor(String locusHarbor) {
		this.locusHarbor = locusHarbor;
	}

	@Column(name = "INLAND_BOAT", length = 60)
	public String getInlandBoat() {
		return this.inlandBoat;
	}

	public void setInlandBoat(String inlandBoat) {
		this.inlandBoat = inlandBoat;
	}

	@Column(name = "OVERSEAS_BOAT", length = 60)
	public String getOverseasBoat() {
		return this.overseasBoat;
	}

	public void setOverseasBoat(String overseasBoat) {
		this.overseasBoat = overseasBoat;
	}

	@Column(name = "INLAND_BOAT_TON", length = 60)
	public String getInlandBoatTon() {
		return this.inlandBoatTon;
	}

	public void setInlandBoatTon(String inlandBoatTon) {
		this.inlandBoatTon = inlandBoatTon;
	}

	@Column(name = "OVERSEAS_BOAT_TON", length = 60)
	public String getOverseasBoatTon() {
		return this.overseasBoatTon;
	}

	public void setOverseasBoatTon(String overseasBoatTon) {
		this.overseasBoatTon = overseasBoatTon;
	}

	@Column(name = "CUSTOMER_SHORTNAME", length = 60)
	public String getCustomerShortname() {
		return this.customerShortname;
	}

	public void setCustomerShortname(String customerShortname) {
		this.customerShortname = customerShortname;
	}

	@Column(name = "DELSTATUS", length = 2)
	public String getDelstatus() {
		return this.delstatus;
	}

	public void setDelstatus(String delstatus) {
		this.delstatus = delstatus;
	}

	@Column(name = "CUSTOMER_NAME_EN", length = 100)
	public String getCustomerNameEn() {
		return this.customerNameEn;
	}

	public void setCustomerNameEn(String customerNameEn) {
		this.customerNameEn = customerNameEn;
	}

	@Column(name = "DEMOS", precision = 12, scale = 3)
	public Double getDemos() {
		return this.demos;
	}

	public void setDemos(Double demos) {
		this.demos = demos;
	}

	@Column(name = "DOLLAR", precision = 12, scale = 3)
	public Double getDollar() {
		return this.dollar;
	}

	public void setDollar(Double dollar) {
		this.dollar = dollar;
	}

	@Column(name = "HZ_STATUS", length = 2)
	public String getHzStatus() {
		return this.hzStatus;
	}

	public void setHzStatus(String hzStatus) {
		this.hzStatus = hzStatus;
	}

	@Column(name = "HD_STATUS", length = 2)
	public String getHdStatus() {
		return this.hdStatus;
	}

	public void setHdStatus(String hdStatus) {
		this.hdStatus = hdStatus;
	}

	@Column(name = "CD_STATUS", length = 2)
	public String getCdStatus() {
		return this.cdStatus;
	}

	public void setCdStatus(String cdStatus) {
		this.cdStatus = cdStatus;
	}

	@Column(name = "CDONG_STATUS", length = 2)
	public String getCdongStatus() {
		return this.cdongStatus;
	}

	public void setCdongStatus(String cdongStatus) {
		this.cdongStatus = cdongStatus;
	}

	@Column(name = "LX_STATUS", length = 2)
	public String getLxStatus() {
		return this.lxStatus;
	}

	public void setLxStatus(String lxStatus) {
		this.lxStatus = lxStatus;
	}

	@Column(name = "ROLE", precision = 10, scale = 0)
	public Long getRole() {
		return this.role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

}