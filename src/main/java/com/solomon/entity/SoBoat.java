package com.solomon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SoBoat entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SO_BOAT", schema = "DAVY")
public class SoBoat implements java.io.Serializable {

	// Fields

	private Long id;
	private String boatChinesename;
	private String boatEnglishname;
	private String boatNation;
	private String callName;
	private Double lenghth;
	private Double width;
	private Double loadTon;
	private String boatType;
	private String delstatus;
	private Double totalTon;
	private Double ton;
	private String boatSpeed;
	private String waterTon;
	private Double storehouse;

	// Constructors

	/** default constructor */
	public SoBoat() {
	}

	/** minimal constructor */
	public SoBoat(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SoBoat(Long id, String boatChinesename, String boatEnglishname, String boatNation, String callName, Double lenghth,
			Double width, Double loadTon, String boatType, String delstatus, Double totalTon, Double ton, String boatSpeed,
			String waterTon, Double storehouse) {
		this.id = id;
		this.boatChinesename = boatChinesename;
		this.boatEnglishname = boatEnglishname;
		this.boatNation = boatNation;
		this.callName = callName;
		this.lenghth = lenghth;
		this.width = width;
		this.loadTon = loadTon;
		this.boatType = boatType;
		this.delstatus = delstatus;
		this.totalTon = totalTon;
		this.ton = ton;
		this.boatSpeed = boatSpeed;
		this.waterTon = waterTon;
		this.storehouse = storehouse;
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

	@Column(name = "BOAT_CHINESENAME", length = 200)
	public String getBoatChinesename() {
		return this.boatChinesename;
	}

	public void setBoatChinesename(String boatChinesename) {
		this.boatChinesename = boatChinesename;
	}

	@Column(name = "BOAT_ENGLISHNAME", length = 200)
	public String getBoatEnglishname() {
		return this.boatEnglishname;
	}

	public void setBoatEnglishname(String boatEnglishname) {
		this.boatEnglishname = boatEnglishname;
	}

	@Column(name = "BOAT_NATION", length = 20)
	public String getBoatNation() {
		return this.boatNation;
	}

	public void setBoatNation(String boatNation) {
		this.boatNation = boatNation;
	}

	@Column(name = "CALL_NAME", length = 200)
	public String getCallName() {
		return this.callName;
	}

	public void setCallName(String callName) {
		this.callName = callName;
	}

	@Column(name = "LENGHTH", precision = 10)
	public Double getLenghth() {
		return this.lenghth;
	}

	public void setLenghth(Double lenghth) {
		this.lenghth = lenghth;
	}

	@Column(name = "WIDTH", precision = 10)
	public Double getWidth() {
		return this.width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	@Column(name = "LOAD_TON", precision = 10)
	public Double getLoadTon() {
		return this.loadTon;
	}

	public void setLoadTon(Double loadTon) {
		this.loadTon = loadTon;
	}

	@Column(name = "BOAT_TYPE", length = 20)
	public String getBoatType() {
		return this.boatType;
	}

	public void setBoatType(String boatType) {
		this.boatType = boatType;
	}

	@Column(name = "DELSTATUS", length = 2)
	public String getDelstatus() {
		return this.delstatus;
	}

	public void setDelstatus(String delstatus) {
		this.delstatus = delstatus;
	}

	@Column(name = "TOTAL_TON", precision = 10)
	public Double getTotalTon() {
		return this.totalTon;
	}

	public void setTotalTon(Double totalTon) {
		this.totalTon = totalTon;
	}

	@Column(name = "TON", precision = 10)
	public Double getTon() {
		return this.ton;
	}

	public void setTon(Double ton) {
		this.ton = ton;
	}

	@Column(name = "BOAT_SPEED", length = 20)
	public String getBoatSpeed() {
		return this.boatSpeed;
	}

	public void setBoatSpeed(String boatSpeed) {
		this.boatSpeed = boatSpeed;
	}

	@Column(name = "WATER_TON", length = 20)
	public String getWaterTon() {
		return this.waterTon;
	}

	public void setWaterTon(String waterTon) {
		this.waterTon = waterTon;
	}

	@Column(name = "STOREHOUSE", precision = 10)
	public Double getStorehouse() {
		return this.storehouse;
	}

	public void setStorehouse(Double storehouse) {
		this.storehouse = storehouse;
	}

}