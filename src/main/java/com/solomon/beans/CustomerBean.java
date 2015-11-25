package com.solomon.beans;


public class CustomerBean {
	private long   id;// '流水号';
	private String customer_name;//  '客户名称';
	private String linkman;// '客户联系人';
	private String tel;//'客户电话';
	private String fax;//'客户传真';
	private String email;// '客户电子邮件';
	private String postcode;// '客户邮政编码';
	private String economy_type;//  '经济性质';
	private String address;//  '客户联系地址';
	private String mobile;//'手机';
	private String net_address;// '网址';
	private String industry;//  '所属行业';
	private long   register_capital;//  '注册资金';
	private String corporate_rep;// '法人代表';
	private String business_licence;//'营业执照号';
	private String tax_reg;// '纳税登记号'
	private String ciq_number;//'海关代号'
	private String bank_name;// '开户银行'
	private String account_name;// '开户名称'
	private String bank_account;//'银行账号'
	private String supplier_brief;//'客户简介'
	private String remarks;//'备注'
	private String sea_route_advantage;//'航线优势'
	private String locus_harbor;//'所在港口'
	private String inland_boat;//'船舶艘次（中国籍）'
	private String overseas_boat;// '船舶艘次（外国籍）'
	private String inland_boat_Ton;// '船舶净吨（中国籍）'
	private String overseas_boat_ton;//'船舶净吨（外国籍）'
	private String customer_shortname;//'客户简称'
	private String delstatus;// '删除表示'
	private String customer_name_en;// '客户名称（英文）'
	private long   demos;// '客户余额（人民币）'
	private long   dollar;// '客户余额（英文）'
	private String hz_status;// '货主标识'
	private String hd_status;//'货代标识'
	private String cd_status;// '船代标识'
	private String cd_ongstatus;// '船东标识'
	private String lxstatus;// '流向标识'
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getEconomy_type() {
		return economy_type;
	}
	public void setEconomy_type(String economy_type) {
		this.economy_type = economy_type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getNet_address() {
		return net_address;
	}
	public void setNet_address(String net_address) {
		this.net_address = net_address;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public long getRegister_capital() {
		return register_capital;
	}
	public void setRegister_capital(long register_capital) {
		this.register_capital = register_capital;
	}
	
	public String getCorporate_rep() {
		return corporate_rep;
	}
	public void setCorporate_rep(String corporate_rep) {
		this.corporate_rep = corporate_rep;
	}
	public String getBusiness_licence() {
		return business_licence;
	}
	public void setBusiness_licence(String business_licence) {
		this.business_licence = business_licence;
	}
	public String getTax_reg() {
		return tax_reg;
	}
	public void setTax_reg(String tax_reg) {
		this.tax_reg = tax_reg;
	}
	public String getCiq_number() {
		return ciq_number;
	}
	public void setCiq_number(String ciq_number) {
		this.ciq_number = ciq_number;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getBank_account() {
		return bank_account;
	}
	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}
	public String getSupplier_brief() {
		return supplier_brief;
	}
	public void setSupplier_brief(String supplier_brief) {
		this.supplier_brief = supplier_brief;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSea_route_advantage() {
		return sea_route_advantage;
	}
	public void setSea_route_advantage(String sea_route_advantage) {
		this.sea_route_advantage = sea_route_advantage;
	}
	public String getLocus_harbor() {
		return locus_harbor;
	}
	public void setLocus_harbor(String locus_harbor) {
		this.locus_harbor = locus_harbor;
	}
	public String getInland_boat() {
		return inland_boat;
	}
	public void setInland_boat(String inland_boat) {
		this.inland_boat = inland_boat;
	}
	public String getOverseas_boat() {
		return overseas_boat;
	}
	public void setOverseas_boat(String overseas_boat) {
		this.overseas_boat = overseas_boat;
	}
	public String getInland_boat_Ton() {
		return inland_boat_Ton;
	}
	public void setInland_boat_Ton(String inland_boat_Ton) {
		this.inland_boat_Ton = inland_boat_Ton;
	}
	public String getOverseas_boat_ton() {
		return overseas_boat_ton;
	}
	public void setOverseas_boat_ton(String overseas_boat_ton) {
		this.overseas_boat_ton = overseas_boat_ton;
	}
	public String getCustomer_shortname() {
		return customer_shortname;
	}
	public void setCustomer_shortname(String customer_shortname) {
		this.customer_shortname = customer_shortname;
	}
	public String getDelstatus() {
		return delstatus;
	}
	public void setDelstatus(String delstatus) {
		this.delstatus = delstatus;
	}
	public String getCustomer_name_en() {
		return customer_name_en;
	}
	public void setCustomer_name_en(String customer_name_en) {
		this.customer_name_en = customer_name_en;
	}
	public long getDemos() {
		return demos;
	}
	public void setDemos(long demos) {
		this.demos = demos;
	}
	public long getDollar() {
		return dollar;
	}
	public void setDollar(long dollar) {
		this.dollar = dollar;
	}
	public String getHz_status() {
		return hz_status;
	}
	public void setHz_status(String hz_status) {
		this.hz_status = hz_status;
	}
	public String getHd_status() {
		return hd_status;
	}
	public void setHd_status(String hd_status) {
		this.hd_status = hd_status;
	}
	public String getCd_status() {
		return cd_status;
	}
	public void setCd_status(String cd_status) {
		this.cd_status = cd_status;
	}
	public String getCd_ongstatus() {
		return cd_ongstatus;
	}
	public void setCd_ongstatus(String cd_ongstatus) {
		this.cd_ongstatus = cd_ongstatus;
	}
	public String getLxstatus() {
		return lxstatus;
	}
	public void setLxstatus(String lxstatus) {
		this.lxstatus = lxstatus;
	}
	
	
	
}
