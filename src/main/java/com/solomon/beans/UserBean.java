package com.solomon.beans;

/*@Bean(name = "CRM_CUSTOMER_USER")*/
public class UserBean {
	private long id;// 流水号
	private long fk_crm_customer_id;// 客户关系外键
	private String user_name;// 用户名
	private String password;// 密码
	private String user_e_mail;// 邮箱
	private long tel;// 联系电话
	private String tel_name;// 联系人

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFk_crm_customer_id() {
		return fk_crm_customer_id;
	}

	public void setFk_crm_customer_id(long fk_crm_customer_id) {
		this.fk_crm_customer_id = fk_crm_customer_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_e_mail() {
		return user_e_mail;
	}

	public void setUser_e_mail(String user_e_mail) {
		this.user_e_mail = user_e_mail;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getTel_name() {
		return tel_name;
	}

	public void setTel_name(String tel_name) {
		this.tel_name = tel_name;
	}

}
