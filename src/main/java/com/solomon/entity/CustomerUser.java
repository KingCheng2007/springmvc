package com.solomon.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CRM_CUSTOMER_USER")
public class CustomerUser {


	@Id
	/*@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "sequence", 
	parameters = { @Parameter(name = "sequence", value = "seq_payablemoney") })*/
	@Column(name="id",precision =15,scale=0)
	private Long id;// 流水号
	
	@Column(name = "fk_crm_customer_id", precision = 15, scale = 0)
	private Long crmCustomerId;// 客户关系外键
	
	@Column(name="user_name",length = 50)
	private String userName;// 用户名
	
	@Column(name="password",length = 20)
	private String password;// 密码
	
	@Column(name="user_e_mail",length = 50)
	private String userMail;// 邮箱
	
	@Column(name="tel",precision =15,scale=0)
	private BigInteger linkTel;// 联系电话
	
	@Column(name="tel_name",length = 20)
	private String linkName;// 联系人

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the crmCustomerId
	 */
	public Long getCrmCustomerId() {
		return crmCustomerId;
	}

	/**
	 * @param crmCustomerId the crmCustomerId to set
	 */
	public void setCrmCustomerId(Long crmCustomerId) {
		this.crmCustomerId = crmCustomerId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userMail
	 */
	public String getUserMail() {
		return userMail;
	}

	/**
	 * @param userMail the userMail to set
	 */
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	/**
	 * @return the linkTel
	 */
	public BigInteger getLinkTel() {
		return linkTel;
	}

	/**
	 * @param linkTel the linkTel to set
	 */
	public void setLinkTel(BigInteger linkTel) {
		this.linkTel = linkTel;
	}

	/**
	 * @return the linkName
	 */
	public String getLinkName() {
		return linkName;
	}

	/**
	 * @param linkName the linkName to set
	 */
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerUser [id=" + id + ", crmCustomerId=" + crmCustomerId + ", userName=" + userName + ", password="
				+ password + ", userMail=" + userMail + ", linkTel=" + linkTel + ", linkName=" + linkName + "]";
	}
	
}
