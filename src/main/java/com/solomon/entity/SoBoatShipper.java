package com.solomon.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SoBoatShipper entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SO_BOAT_SHIPPER", schema = "DAVY")
public class SoBoatShipper implements java.io.Serializable {

	// Fields

	private Long id;
	private Long fkBoatForeId;
	private Long fkCrmCustomerId2;
	private Long fkCrmCustomerId3;
	private String identifyFlag;
	private String billNo;
	private Long fkMineId;
	private BigDecimal piece;
	private String packMode;
	private BigDecimal planLoadTon;
	private BigDecimal cubage;
	private BigDecimal completeLoadTon;
	private String stackclearStatus;
	private String content;
	private Date balanseTime;
	private BigDecimal waterTun;
	private String isDirecte1;
	private String isArrears;
	private String workType;
	private Long loadpact;
	private Long stagnantpact;
	private Long workpact;
	private String loadfeeStatus;

	// Constructors

	/** default constructor */
	public SoBoatShipper() {
	}

	/** minimal constructor */
	public SoBoatShipper(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SoBoatShipper(Long id, Long fkBoatForeId, Long fkCrmCustomerId2, Long fkCrmCustomerId3, String identifyFlag,
			String billNo, Long fkMineId, BigDecimal piece, String packMode, BigDecimal planLoadTon, BigDecimal cubage,
			BigDecimal completeLoadTon, String stackclearStatus, String content, Date balanseTime, BigDecimal waterTun,
			String isDirecte1, String isArrears, String workType, Long loadpact, Long stagnantpact, Long workpact,
			String loadfeeStatus) {
		this.id = id;
		this.fkBoatForeId = fkBoatForeId;
		this.fkCrmCustomerId2 = fkCrmCustomerId2;
		this.fkCrmCustomerId3 = fkCrmCustomerId3;
		this.identifyFlag = identifyFlag;
		this.billNo = billNo;
		this.fkMineId = fkMineId;
		this.piece = piece;
		this.packMode = packMode;
		this.planLoadTon = planLoadTon;
		this.cubage = cubage;
		this.completeLoadTon = completeLoadTon;
		this.stackclearStatus = stackclearStatus;
		this.content = content;
		this.balanseTime = balanseTime;
		this.waterTun = waterTun;
		this.isDirecte1 = isDirecte1;
		this.isArrears = isArrears;
		this.workType = workType;
		this.loadpact = loadpact;
		this.stagnantpact = stagnantpact;
		this.workpact = workpact;
		this.loadfeeStatus = loadfeeStatus;
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

	@Column(name = "FK_BOAT_FORE_ID", precision = 15, scale = 0)
	public Long getFkBoatForeId() {
		return this.fkBoatForeId;
	}

	public void setFkBoatForeId(Long fkBoatForeId) {
		this.fkBoatForeId = fkBoatForeId;
	}

	@Column(name = "FK_CRM_CUSTOMER_ID2", precision = 15, scale = 0)
	public Long getFkCrmCustomerId2() {
		return this.fkCrmCustomerId2;
	}

	public void setFkCrmCustomerId2(Long fkCrmCustomerId2) {
		this.fkCrmCustomerId2 = fkCrmCustomerId2;
	}

	@Column(name = "FK_CRM_CUSTOMER_ID3", precision = 15, scale = 0)
	public Long getFkCrmCustomerId3() {
		return this.fkCrmCustomerId3;
	}

	public void setFkCrmCustomerId3(Long fkCrmCustomerId3) {
		this.fkCrmCustomerId3 = fkCrmCustomerId3;
	}

	@Column(name = "IDENTIFY_FLAG", length = 100)
	public String getIdentifyFlag() {
		return this.identifyFlag;
	}

	public void setIdentifyFlag(String identifyFlag) {
		this.identifyFlag = identifyFlag;
	}

	@Column(name = "BILL_NO", length = 20)
	public String getBillNo() {
		return this.billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "FK_MINE_ID", precision = 15, scale = 0)
	public Long getFkMineId() {
		return this.fkMineId;
	}

	public void setFkMineId(Long fkMineId) {
		this.fkMineId = fkMineId;
	}

	@Column(name = "PIECE", precision = 22, scale = 0)
	public BigDecimal getPiece() {
		return this.piece;
	}

	public void setPiece(BigDecimal piece) {
		this.piece = piece;
	}

	@Column(name = "PACK_MODE", length = 4)
	public String getPackMode() {
		return this.packMode;
	}

	public void setPackMode(String packMode) {
		this.packMode = packMode;
	}

	@Column(name = "PLAN_LOAD_TON", precision = 22, scale = 0)
	public BigDecimal getPlanLoadTon() {
		return this.planLoadTon;
	}

	public void setPlanLoadTon(BigDecimal planLoadTon) {
		this.planLoadTon = planLoadTon;
	}

	@Column(name = "CUBAGE", precision = 22, scale = 0)
	public BigDecimal getCubage() {
		return this.cubage;
	}

	public void setCubage(BigDecimal cubage) {
		this.cubage = cubage;
	}

	@Column(name = "COMPLETE_LOAD_TON", precision = 22, scale = 0)
	public BigDecimal getCompleteLoadTon() {
		return this.completeLoadTon;
	}

	public void setCompleteLoadTon(BigDecimal completeLoadTon) {
		this.completeLoadTon = completeLoadTon;
	}

	@Column(name = "STACKCLEAR_STATUS", length = 10)
	public String getStackclearStatus() {
		return this.stackclearStatus;
	}

	public void setStackclearStatus(String stackclearStatus) {
		this.stackclearStatus = stackclearStatus;
	}

	@Column(name = "CONTENT", length = 100)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BALANSE_TIME", length = 7)
	public Date getBalanseTime() {
		return this.balanseTime;
	}

	public void setBalanseTime(Date balanseTime) {
		this.balanseTime = balanseTime;
	}

	@Column(name = "WATER_TUN", precision = 22, scale = 0)
	public BigDecimal getWaterTun() {
		return this.waterTun;
	}

	public void setWaterTun(BigDecimal waterTun) {
		this.waterTun = waterTun;
	}

	@Column(name = "IS_DIRECTE1", length = 20)
	public String getIsDirecte1() {
		return this.isDirecte1;
	}

	public void setIsDirecte1(String isDirecte1) {
		this.isDirecte1 = isDirecte1;
	}

	@Column(name = "IS_ARREARS", length = 20)
	public String getIsArrears() {
		return this.isArrears;
	}

	public void setIsArrears(String isArrears) {
		this.isArrears = isArrears;
	}

	@Column(name = "WORK_TYPE", length = 20)
	public String getWorkType() {
		return this.workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	@Column(name = "LOADPACT", precision = 15, scale = 0)
	public Long getLoadpact() {
		return this.loadpact;
	}

	public void setLoadpact(Long loadpact) {
		this.loadpact = loadpact;
	}

	@Column(name = "STAGNANTPACT", precision = 15, scale = 0)
	public Long getStagnantpact() {
		return this.stagnantpact;
	}

	public void setStagnantpact(Long stagnantpact) {
		this.stagnantpact = stagnantpact;
	}

	@Column(name = "WORKPACT", precision = 15, scale = 0)
	public Long getWorkpact() {
		return this.workpact;
	}

	public void setWorkpact(Long workpact) {
		this.workpact = workpact;
	}

	@Column(name = "LOADFEE_STATUS", length = 20)
	public String getLoadfeeStatus() {
		return this.loadfeeStatus;
	}

	public void setLoadfeeStatus(String loadfeeStatus) {
		this.loadfeeStatus = loadfeeStatus;
	}

}