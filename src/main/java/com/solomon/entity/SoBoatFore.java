package com.solomon.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SoBoatFore entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SO_BOAT_FORE", schema = "DAVY")
public class SoBoatFore implements java.io.Serializable {

	// Fields

	private Long id;
	private Long fkBoatId;
	private String timeSn;
	private Double loadTonReal;
	private String startHaven;
	private String byHaven;
	private String tohaven;
	private Long fkCrmCustomerId1;
	private Date startDate;
	private Double beSeagauge;
	private Double afSeagauge;
	private Date prearrivedDate;
	private Date foreleaveDate;
	private String adssStatus;
	private Date leaveharborTime;
	private Date anchorTime;
	private Date onberthTime;
	private Long berth;
	private Date leaveTime;
	private String tradeType;
	private Double totalTon;
	private Double ton;
	private Double outbeSeaguage;
	private Double outafSeaguage;
	private String anchorStatus;
	private String apply;
	private Date atripTime;
	private String weightMode;
	private String outMaxseagauge;
	private Double boatFast;
	private Date planLeaveTime;
	private String webPrearrived;
	private Long fkCrmCustomerId;
	private String berthTwo;
	private Date beginTime;
	private Date endTime;
	private Date cableTime;
	private Date updateTime;
	private Date balanseBoatTime;
	private Date expectedTime;
	private Long expectedBerth;
	private String dockType;
	private String remarks;
	private Date createTime;
	private String feeStatus;
	private String lagfeeStatus;
	private String tugfeeStatus;
	private String stackfeeStatus;
	private String otherfeeStatus;
	private String settleStatus;
	private String noteStatus;
	private String datapermission;

	// Constructors

	/** default constructor */
	public SoBoatFore() {
	}

	/** minimal constructor */
	public SoBoatFore(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SoBoatFore(Long id, Long fkBoatId, String timeSn, Double loadTonReal, String startHaven, String byHaven,
			String tohaven, Long fkCrmCustomerId1, Date startDate, Double beSeagauge, Double afSeagauge, Date prearrivedDate,
			Date foreleaveDate, String adssStatus, Date leaveharborTime, Date anchorTime, Date onberthTime, Long berth,
			Date leaveTime, String tradeType, Double totalTon, Double ton, Double outbeSeaguage, Double outafSeaguage,
			String anchorStatus, String apply, Date atripTime, String weightMode, String outMaxseagauge, Double boatFast,
			Date planLeaveTime, String webPrearrived, Long fkCrmCustomerId, String berthTwo, Date beginTime, Date endTime,
			Date cableTime, Date updateTime, Date balanseBoatTime, Date expectedTime, Long expectedBerth, String dockType,
			String remarks, Date createTime, String feeStatus, String lagfeeStatus, String tugfeeStatus, String stackfeeStatus,
			String otherfeeStatus, String settleStatus, String noteStatus, String datapermission) {
		this.id = id;
		this.fkBoatId = fkBoatId;
		this.timeSn = timeSn;
		this.loadTonReal = loadTonReal;
		this.startHaven = startHaven;
		this.byHaven = byHaven;
		this.tohaven = tohaven;
		this.fkCrmCustomerId1 = fkCrmCustomerId1;
		this.startDate = startDate;
		this.beSeagauge = beSeagauge;
		this.afSeagauge = afSeagauge;
		this.prearrivedDate = prearrivedDate;
		this.foreleaveDate = foreleaveDate;
		this.adssStatus = adssStatus;
		this.leaveharborTime = leaveharborTime;
		this.anchorTime = anchorTime;
		this.onberthTime = onberthTime;
		this.berth = berth;
		this.leaveTime = leaveTime;
		this.tradeType = tradeType;
		this.totalTon = totalTon;
		this.ton = ton;
		this.outbeSeaguage = outbeSeaguage;
		this.outafSeaguage = outafSeaguage;
		this.anchorStatus = anchorStatus;
		this.apply = apply;
		this.atripTime = atripTime;
		this.weightMode = weightMode;
		this.outMaxseagauge = outMaxseagauge;
		this.boatFast = boatFast;
		this.planLeaveTime = planLeaveTime;
		this.webPrearrived = webPrearrived;
		this.fkCrmCustomerId = fkCrmCustomerId;
		this.berthTwo = berthTwo;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.cableTime = cableTime;
		this.updateTime = updateTime;
		this.balanseBoatTime = balanseBoatTime;
		this.expectedTime = expectedTime;
		this.expectedBerth = expectedBerth;
		this.dockType = dockType;
		this.remarks = remarks;
		this.createTime = createTime;
		this.feeStatus = feeStatus;
		this.lagfeeStatus = lagfeeStatus;
		this.tugfeeStatus = tugfeeStatus;
		this.stackfeeStatus = stackfeeStatus;
		this.otherfeeStatus = otherfeeStatus;
		this.settleStatus = settleStatus;
		this.noteStatus = noteStatus;
		this.datapermission = datapermission;
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

	@Column(name = "FK_BOAT_ID", precision = 15, scale = 0)
	public Long getFkBoatId() {
		return this.fkBoatId;
	}

	public void setFkBoatId(Long fkBoatId) {
		this.fkBoatId = fkBoatId;
	}

	@Column(name = "TIME_SN", length = 100)
	public String getTimeSn() {
		return this.timeSn;
	}

	public void setTimeSn(String timeSn) {
		this.timeSn = timeSn;
	}

	@Column(name = "LOAD_TON_REAL", precision = 12)
	public Double getLoadTonReal() {
		return this.loadTonReal;
	}

	public void setLoadTonReal(Double loadTonReal) {
		this.loadTonReal = loadTonReal;
	}

	@Column(name = "START_HAVEN", length = 100)
	public String getStartHaven() {
		return this.startHaven;
	}

	public void setStartHaven(String startHaven) {
		this.startHaven = startHaven;
	}

	@Column(name = "BY_HAVEN", length = 200)
	public String getByHaven() {
		return this.byHaven;
	}

	public void setByHaven(String byHaven) {
		this.byHaven = byHaven;
	}

	@Column(name = "TOHAVEN", length = 100)
	public String getTohaven() {
		return this.tohaven;
	}

	public void setTohaven(String tohaven) {
		this.tohaven = tohaven;
	}

	@Column(name = "FK_CRM_CUSTOMER_ID1", precision = 15, scale = 0)
	public Long getFkCrmCustomerId1() {
		return this.fkCrmCustomerId1;
	}

	public void setFkCrmCustomerId1(Long fkCrmCustomerId1) {
		this.fkCrmCustomerId1 = fkCrmCustomerId1;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_DATE", length = 7)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "BE_SEAGAUGE", precision = 10)
	public Double getBeSeagauge() {
		return this.beSeagauge;
	}

	public void setBeSeagauge(Double beSeagauge) {
		this.beSeagauge = beSeagauge;
	}

	@Column(name = "AF_SEAGAUGE", precision = 10)
	public Double getAfSeagauge() {
		return this.afSeagauge;
	}

	public void setAfSeagauge(Double afSeagauge) {
		this.afSeagauge = afSeagauge;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PREARRIVED_DATE", length = 7)
	public Date getPrearrivedDate() {
		return this.prearrivedDate;
	}

	public void setPrearrivedDate(Date prearrivedDate) {
		this.prearrivedDate = prearrivedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FORELEAVE_DATE", length = 7)
	public Date getForeleaveDate() {
		return this.foreleaveDate;
	}

	public void setForeleaveDate(Date foreleaveDate) {
		this.foreleaveDate = foreleaveDate;
	}

	@Column(name = "ADSS_STATUS", length = 10)
	public String getAdssStatus() {
		return this.adssStatus;
	}

	public void setAdssStatus(String adssStatus) {
		this.adssStatus = adssStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LEAVEHARBOR_TIME", length = 7)
	public Date getLeaveharborTime() {
		return this.leaveharborTime;
	}

	public void setLeaveharborTime(Date leaveharborTime) {
		this.leaveharborTime = leaveharborTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ANCHOR_TIME", length = 7)
	public Date getAnchorTime() {
		return this.anchorTime;
	}

	public void setAnchorTime(Date anchorTime) {
		this.anchorTime = anchorTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ONBERTH_TIME", length = 7)
	public Date getOnberthTime() {
		return this.onberthTime;
	}

	public void setOnberthTime(Date onberthTime) {
		this.onberthTime = onberthTime;
	}

	@Column(name = "BERTH", precision = 15, scale = 0)
	public Long getBerth() {
		return this.berth;
	}

	public void setBerth(Long berth) {
		this.berth = berth;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LEAVE_TIME", length = 7)
	public Date getLeaveTime() {
		return this.leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	@Column(name = "TRADE_TYPE", length = 10)
	public String getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
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

	@Column(name = "OUTBE_SEAGUAGE", precision = 10)
	public Double getOutbeSeaguage() {
		return this.outbeSeaguage;
	}

	public void setOutbeSeaguage(Double outbeSeaguage) {
		this.outbeSeaguage = outbeSeaguage;
	}

	@Column(name = "OUTAF_SEAGUAGE", precision = 10)
	public Double getOutafSeaguage() {
		return this.outafSeaguage;
	}

	public void setOutafSeaguage(Double outafSeaguage) {
		this.outafSeaguage = outafSeaguage;
	}

	@Column(name = "ANCHOR_STATUS", length = 10)
	public String getAnchorStatus() {
		return this.anchorStatus;
	}

	public void setAnchorStatus(String anchorStatus) {
		this.anchorStatus = anchorStatus;
	}

	@Column(name = "APPLY", length = 10)
	public String getApply() {
		return this.apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ATRIP_TIME", length = 7)
	public Date getAtripTime() {
		return this.atripTime;
	}

	public void setAtripTime(Date atripTime) {
		this.atripTime = atripTime;
	}

	@Column(name = "WEIGHT_MODE", length = 20)
	public String getWeightMode() {
		return this.weightMode;
	}

	public void setWeightMode(String weightMode) {
		this.weightMode = weightMode;
	}

	@Column(name = "OUT_MAXSEAGAUGE", length = 10)
	public String getOutMaxseagauge() {
		return this.outMaxseagauge;
	}

	public void setOutMaxseagauge(String outMaxseagauge) {
		this.outMaxseagauge = outMaxseagauge;
	}

	@Column(name = "BOAT_FAST", precision = 10)
	public Double getBoatFast() {
		return this.boatFast;
	}

	public void setBoatFast(Double boatFast) {
		this.boatFast = boatFast;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PLAN_LEAVE_TIME", length = 7)
	public Date getPlanLeaveTime() {
		return this.planLeaveTime;
	}

	public void setPlanLeaveTime(Date planLeaveTime) {
		this.planLeaveTime = planLeaveTime;
	}

	@Column(name = "WEB_PREARRIVED", length = 10)
	public String getWebPrearrived() {
		return this.webPrearrived;
	}

	public void setWebPrearrived(String webPrearrived) {
		this.webPrearrived = webPrearrived;
	}

	@Column(name = "FK_CRM_CUSTOMER_ID", precision = 15, scale = 0)
	public Long getFkCrmCustomerId() {
		return this.fkCrmCustomerId;
	}

	public void setFkCrmCustomerId(Long fkCrmCustomerId) {
		this.fkCrmCustomerId = fkCrmCustomerId;
	}

	@Column(name = "BERTH_TWO", length = 10)
	public String getBerthTwo() {
		return this.berthTwo;
	}

	public void setBerthTwo(String berthTwo) {
		this.berthTwo = berthTwo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BEGIN_TIME", length = 7)
	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_TIME", length = 7)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CABLE_TIME", length = 7)
	public Date getCableTime() {
		return this.cableTime;
	}

	public void setCableTime(Date cableTime) {
		this.cableTime = cableTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_TIME", length = 7)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BALANSE_BOAT_TIME", length = 7)
	public Date getBalanseBoatTime() {
		return this.balanseBoatTime;
	}

	public void setBalanseBoatTime(Date balanseBoatTime) {
		this.balanseBoatTime = balanseBoatTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPECTED_TIME", length = 7)
	public Date getExpectedTime() {
		return this.expectedTime;
	}

	public void setExpectedTime(Date expectedTime) {
		this.expectedTime = expectedTime;
	}

	@Column(name = "EXPECTED_BERTH", precision = 15, scale = 0)
	public Long getExpectedBerth() {
		return this.expectedBerth;
	}

	public void setExpectedBerth(Long expectedBerth) {
		this.expectedBerth = expectedBerth;
	}

	@Column(name = "DOCK_TYPE", length = 20)
	public String getDockType() {
		return this.dockType;
	}

	public void setDockType(String dockType) {
		this.dockType = dockType;
	}

	@Column(name = "REMARKS", length = 400)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_TIME", length = 7)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "FEE_STATUS", length = 20)
	public String getFeeStatus() {
		return this.feeStatus;
	}

	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	@Column(name = "LAGFEE_STATUS", length = 20)
	public String getLagfeeStatus() {
		return this.lagfeeStatus;
	}

	public void setLagfeeStatus(String lagfeeStatus) {
		this.lagfeeStatus = lagfeeStatus;
	}

	@Column(name = "TUGFEE_STATUS", length = 10)
	public String getTugfeeStatus() {
		return this.tugfeeStatus;
	}

	public void setTugfeeStatus(String tugfeeStatus) {
		this.tugfeeStatus = tugfeeStatus;
	}

	@Column(name = "STACKFEE_STATUS", length = 10)
	public String getStackfeeStatus() {
		return this.stackfeeStatus;
	}

	public void setStackfeeStatus(String stackfeeStatus) {
		this.stackfeeStatus = stackfeeStatus;
	}

	@Column(name = "OTHERFEE_STATUS", length = 10)
	public String getOtherfeeStatus() {
		return this.otherfeeStatus;
	}

	public void setOtherfeeStatus(String otherfeeStatus) {
		this.otherfeeStatus = otherfeeStatus;
	}

	@Column(name = "SETTLE_STATUS", length = 10)
	public String getSettleStatus() {
		return this.settleStatus;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	@Column(name = "NOTE_STATUS", length = 20)
	public String getNoteStatus() {
		return this.noteStatus;
	}

	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
	}

	@Column(name = "DATAPERMISSION", length = 30)
	public String getDatapermission() {
		return this.datapermission;
	}

	public void setDatapermission(String datapermission) {
		this.datapermission = datapermission;
	}

}