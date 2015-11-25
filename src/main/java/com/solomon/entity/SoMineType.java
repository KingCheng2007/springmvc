package com.solomon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SoMineType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SO_MINE_TYPE", schema = "DAVY")
public class SoMineType implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String code;
	private String note;
	private Long fkMineTypeId;

	// Constructors

	/** default constructor */
	public SoMineType() {
	}

	/** minimal constructor */
	public SoMineType(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SoMineType(Long id, String name, String code, String note, Long fkMineTypeId) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.note = note;
		this.fkMineTypeId = fkMineTypeId;
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

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NOTE", length = 400)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "FK_MINE_TYPE_ID", precision = 15, scale = 0)
	public Long getFkMineTypeId() {
		return this.fkMineTypeId;
	}

	public void setFkMineTypeId(Long fkMineTypeId) {
		this.fkMineTypeId = fkMineTypeId;
	}

}