package com.solomon.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 此实体的定义应用了springmvc的注解，省去了传统的Hibernate跟数据库之间的映射配置文件
 * 
 * @author will
 * 
 */
@Entity
@Table(name = "T_USER_cc")
public class User {


	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid",strategy="uuid")
	@Column(length = 32)
	private String id;

	@Column(length = 32)
	private String userName;

	@Column(length = 32)
	private String age;
	@Column(length = 15,scale=0)
	private BigInteger score ;
	
	@Column(precision =15,scale=0)
	private BigInteger score2 ;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the score
	 */
	public BigInteger getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(BigInteger score) {
		this.score = score;
	}

	/**
	 * @return the score2
	 */
	public BigInteger getScore2() {
		return score2;
	}

	/**
	 * @param score2 the score2 to set
	 */
	public void setScore2(BigInteger score2) {
		this.score2 = score2;
	}
	
	

}