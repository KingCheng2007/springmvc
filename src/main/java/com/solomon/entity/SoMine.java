package com.solomon.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SoMine entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SO_MINE", schema = "DAVY")
public class SoMine implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String cd;
	private String addr;
	private String note;
	private String delstatus;
	private Long fkMineTypeId;
	private Long operator;
	private Date optime;
	private Double coefficient;

	// Constructors

	/** default constructor */
	public SoMine() {
	}

	/** minimal constructor */
	public SoMine(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SoMine(Long id, String name, String cd, String addr, String note, String delstatus, Long fkMineTypeId, Long operator,
			Date optime, Double coefficient) {
		this.id = id;
		this.name = name;
		this.cd = cd;
		this.addr = addr;
		this.note = note;
		this.delstatus = delstatus;
		this.fkMineTypeId = fkMineTypeId;
		this.operator = operator;
		this.optime = optime;
		this.coefficient = coefficient;
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

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CD", length = 100)
	public String getCd() {
		return this.cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	@Column(name = "ADDR", length = 200)
	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Column(name = "NOTE", length = 400)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "DELSTATUS", length = 2)
	public String getDelstatus() {
		return this.delstatus;
	}

	public void setDelstatus(String delstatus) {
		this.delstatus = delstatus;
	}

	@Column(name = "FK_MINE_TYPE_ID", precision = 15, scale = 0)
	public Long getFkMineTypeId() {
		return this.fkMineTypeId;
	}

	public void setFkMineTypeId(Long fkMineTypeId) {
		this.fkMineTypeId = fkMineTypeId;
	}

	@Column(name = "OPERATOR", precision = 15, scale = 0)
	public Long getOperator() {
		return this.operator;
	}

	public void setOperator(Long operator) {
		this.operator = operator;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OPTIME", length = 7)
	public Date getOptime() {
		return this.optime;
	}

	public void setOptime(Date optime) {
		this.optime = optime;
	}

	@Column(name = "COEFFICIENT", precision = 5, scale = 3)
	public Double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
	}

}