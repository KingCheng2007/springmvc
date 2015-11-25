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
 * AttScatterReq entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ATT_SCATTER_REQ", schema = "DAVY")
public class AttScatterReq implements java.io.Serializable {

	// Fields

	private Long id;
	private String noteId;
	private String havenMan;
	private Date startTime;
	private Date endTime;
	private Double quantity;
	private Double proportion;
	private String type;
	private String note;
	private Long foreId;
	private String lx;
	private String pactNo;
	private String usedFlag;
	private Date lastUpdateTime;
	private String PSign;
	private String distractType;
	private Long parentId;
	private String bakSign;
	private String extPile;
	private String offlineStatus;
	private String editPrsion;
	private String stackclearStatus;
	private Double addAmount;
	private String dataArchive;
	private String status;
	private Long bigPactNoId;
	private Long fkSoBoatShipperId;
	private String mergeid;
	private String bangName;
	private String laneNum;
	private String forkliftName;
	private Double leftWeight;
	private Date opTime;
	private String opPerson;
	private BigDecimal overleftflag;
	private BigDecimal overdateflag;
	private String blNo;
	private String declarationNo;
	private String voyageNo;
	private String weightunit;
	private BigDecimal fkSoScatterReqId;
	private Boolean trunkstate;
	private Long fkSoStackingInfoId1;
	private Boolean isclear;
	private Long fkStackMoteNoteId;
	private Boolean notestate;
	private Long fkSoStackingInfoId;
	private Double blNumber;
	private Double blNum;
	private String trunkcar;
	private String consignerUnit;
	private String goodsType;
	private String goodsCode;
	private Long hdId;
	private String hzName;
	private Long hzId;
	private Long lxId;
	private String boatName;
	private Byte startFlag;

	// Constructors

	/** default constructor */
	public AttScatterReq() {
	}

	/** minimal constructor */
	public AttScatterReq(Long id) {
		this.id = id;
	}

	/** full constructor */
	public AttScatterReq(Long id, String noteId, String havenMan, Date startTime, Date endTime, Double quantity,
			Double proportion, String type, String note, Long foreId, String lx, String pactNo, String usedFlag,
			Date lastUpdateTime, String PSign, String distractType, Long parentId, String bakSign, String extPile,
			String offlineStatus, String editPrsion, String stackclearStatus, Double addAmount, String dataArchive,
			String status, Long bigPactNoId, Long fkSoBoatShipperId, String mergeid, String bangName, String laneNum,
			String forkliftName, Double leftWeight, Date opTime, String opPerson, BigDecimal overleftflag,
			BigDecimal overdateflag, String blNo, String declarationNo, String voyageNo, String weightunit,
			BigDecimal fkSoScatterReqId, Boolean trunkstate, Long fkSoStackingInfoId1, Boolean isclear, Long fkStackMoteNoteId,
			Boolean notestate, Long fkSoStackingInfoId, Double blNumber, Double blNum, String trunkcar, String consignerUnit,
			String goodsType, String goodsCode, Long hdId, String hzName, Long hzId, Long lxId, String boatName, Byte startFlag) {
		this.id = id;
		this.noteId = noteId;
		this.havenMan = havenMan;
		this.startTime = startTime;
		this.endTime = endTime;
		this.quantity = quantity;
		this.proportion = proportion;
		this.type = type;
		this.note = note;
		this.foreId = foreId;
		this.lx = lx;
		this.pactNo = pactNo;
		this.usedFlag = usedFlag;
		this.lastUpdateTime = lastUpdateTime;
		this.PSign = PSign;
		this.distractType = distractType;
		this.parentId = parentId;
		this.bakSign = bakSign;
		this.extPile = extPile;
		this.offlineStatus = offlineStatus;
		this.editPrsion = editPrsion;
		this.stackclearStatus = stackclearStatus;
		this.addAmount = addAmount;
		this.dataArchive = dataArchive;
		this.status = status;
		this.bigPactNoId = bigPactNoId;
		this.fkSoBoatShipperId = fkSoBoatShipperId;
		this.mergeid = mergeid;
		this.bangName = bangName;
		this.laneNum = laneNum;
		this.forkliftName = forkliftName;
		this.leftWeight = leftWeight;
		this.opTime = opTime;
		this.opPerson = opPerson;
		this.overleftflag = overleftflag;
		this.overdateflag = overdateflag;
		this.blNo = blNo;
		this.declarationNo = declarationNo;
		this.voyageNo = voyageNo;
		this.weightunit = weightunit;
		this.fkSoScatterReqId = fkSoScatterReqId;
		this.trunkstate = trunkstate;
		this.fkSoStackingInfoId1 = fkSoStackingInfoId1;
		this.isclear = isclear;
		this.fkStackMoteNoteId = fkStackMoteNoteId;
		this.notestate = notestate;
		this.fkSoStackingInfoId = fkSoStackingInfoId;
		this.blNumber = blNumber;
		this.blNum = blNum;
		this.trunkcar = trunkcar;
		this.consignerUnit = consignerUnit;
		this.goodsType = goodsType;
		this.goodsCode = goodsCode;
		this.hdId = hdId;
		this.hzName = hzName;
		this.hzId = hzId;
		this.lxId = lxId;
		this.boatName = boatName;
		this.startFlag = startFlag;
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

	@Column(name = "NOTE_ID", length = 1000)
	public String getNoteId() {
		return this.noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	@Column(name = "HAVEN_MAN", length = 50)
	public String getHavenMan() {
		return this.havenMan;
	}

	public void setHavenMan(String havenMan) {
		this.havenMan = havenMan;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "START_TIME", length = 7)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "END_TIME", length = 7)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "QUANTITY", precision = 15, scale = 4)
	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	@Column(name = "PROPORTION", precision = 15, scale = 4)
	public Double getProportion() {
		return this.proportion;
	}

	public void setProportion(Double proportion) {
		this.proportion = proportion;
	}

	@Column(name = "TYPE", length = 2)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "NOTE", length = 4000)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "FORE_ID", precision = 15, scale = 0)
	public Long getForeId() {
		return this.foreId;
	}

	public void setForeId(Long foreId) {
		this.foreId = foreId;
	}

	@Column(name = "LX", length = 100)
	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	@Column(name = "PACT_NO", length = 100)
	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	@Column(name = "USED_FLAG", length = 2)
	public String getUsedFlag() {
		return this.usedFlag;
	}

	public void setUsedFlag(String usedFlag) {
		this.usedFlag = usedFlag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_UPDATE_TIME", length = 7)
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "P_SIGN", length = 20)
	public String getPSign() {
		return this.PSign;
	}

	public void setPSign(String PSign) {
		this.PSign = PSign;
	}

	@Column(name = "DISTRACT_TYPE", length = 20)
	public String getDistractType() {
		return this.distractType;
	}

	public void setDistractType(String distractType) {
		this.distractType = distractType;
	}

	@Column(name = "PARENT_ID", precision = 15, scale = 0)
	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Column(name = "BAK_SIGN", length = 2)
	public String getBakSign() {
		return this.bakSign;
	}

	public void setBakSign(String bakSign) {
		this.bakSign = bakSign;
	}

	@Column(name = "EXT_PILE", length = 100)
	public String getExtPile() {
		return this.extPile;
	}

	public void setExtPile(String extPile) {
		this.extPile = extPile;
	}

	@Column(name = "OFFLINE_STATUS", length = 2)
	public String getOfflineStatus() {
		return this.offlineStatus;
	}

	public void setOfflineStatus(String offlineStatus) {
		this.offlineStatus = offlineStatus;
	}

	@Column(name = "EDIT_PRSION", length = 50)
	public String getEditPrsion() {
		return this.editPrsion;
	}

	public void setEditPrsion(String editPrsion) {
		this.editPrsion = editPrsion;
	}

	@Column(name = "STACKCLEAR_STATUS", length = 10)
	public String getStackclearStatus() {
		return this.stackclearStatus;
	}

	public void setStackclearStatus(String stackclearStatus) {
		this.stackclearStatus = stackclearStatus;
	}

	@Column(name = "ADD_AMOUNT", precision = 15, scale = 4)
	public Double getAddAmount() {
		return this.addAmount;
	}

	public void setAddAmount(Double addAmount) {
		this.addAmount = addAmount;
	}

	@Column(name = "DATA_ARCHIVE", length = 2)
	public String getDataArchive() {
		return this.dataArchive;
	}

	public void setDataArchive(String dataArchive) {
		this.dataArchive = dataArchive;
	}

	@Column(name = "STATUS", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "BIG_PACT_NO_ID", precision = 11, scale = 0)
	public Long getBigPactNoId() {
		return this.bigPactNoId;
	}

	public void setBigPactNoId(Long bigPactNoId) {
		this.bigPactNoId = bigPactNoId;
	}

	@Column(name = "FK_SO_BOAT_SHIPPER_ID", precision = 15, scale = 0)
	public Long getFkSoBoatShipperId() {
		return this.fkSoBoatShipperId;
	}

	public void setFkSoBoatShipperId(Long fkSoBoatShipperId) {
		this.fkSoBoatShipperId = fkSoBoatShipperId;
	}

	@Column(name = "MERGEID", length = 100)
	public String getMergeid() {
		return this.mergeid;
	}

	public void setMergeid(String mergeid) {
		this.mergeid = mergeid;
	}

	@Column(name = "BANG_NAME", length = 200)
	public String getBangName() {
		return this.bangName;
	}

	public void setBangName(String bangName) {
		this.bangName = bangName;
	}

	@Column(name = "LANE_NUM", length = 20)
	public String getLaneNum() {
		return this.laneNum;
	}

	public void setLaneNum(String laneNum) {
		this.laneNum = laneNum;
	}

	@Column(name = "FORKLIFT_NAME", length = 200)
	public String getForkliftName() {
		return this.forkliftName;
	}

	public void setForkliftName(String forkliftName) {
		this.forkliftName = forkliftName;
	}

	@Column(name = "LEFT_WEIGHT", precision = 15, scale = 4)
	public Double getLeftWeight() {
		return this.leftWeight;
	}

	public void setLeftWeight(Double leftWeight) {
		this.leftWeight = leftWeight;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OP_TIME", length = 7)
	public Date getOpTime() {
		return this.opTime;
	}

	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	@Column(name = "OP_PERSON", length = 20)
	public String getOpPerson() {
		return this.opPerson;
	}

	public void setOpPerson(String opPerson) {
		this.opPerson = opPerson;
	}

	@Column(name = "OVERLEFTFLAG", precision = 22, scale = 0)
	public BigDecimal getOverleftflag() {
		return this.overleftflag;
	}

	public void setOverleftflag(BigDecimal overleftflag) {
		this.overleftflag = overleftflag;
	}

	@Column(name = "OVERDATEFLAG", precision = 22, scale = 0)
	public BigDecimal getOverdateflag() {
		return this.overdateflag;
	}

	public void setOverdateflag(BigDecimal overdateflag) {
		this.overdateflag = overdateflag;
	}

	@Column(name = "BL_NO", length = 80)
	public String getBlNo() {
		return this.blNo;
	}

	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}

	@Column(name = "DECLARATION_NO", length = 80)
	public String getDeclarationNo() {
		return this.declarationNo;
	}

	public void setDeclarationNo(String declarationNo) {
		this.declarationNo = declarationNo;
	}

	@Column(name = "VOYAGE_NO", length = 80)
	public String getVoyageNo() {
		return this.voyageNo;
	}

	public void setVoyageNo(String voyageNo) {
		this.voyageNo = voyageNo;
	}

	@Column(name = "WEIGHTUNIT", length = 10)
	public String getWeightunit() {
		return this.weightunit;
	}

	public void setWeightunit(String weightunit) {
		this.weightunit = weightunit;
	}

	@Column(name = "FK_SO_SCATTER_REQ_ID", precision = 22, scale = 0)
	public BigDecimal getFkSoScatterReqId() {
		return this.fkSoScatterReqId;
	}

	public void setFkSoScatterReqId(BigDecimal fkSoScatterReqId) {
		this.fkSoScatterReqId = fkSoScatterReqId;
	}

	@Column(name = "TRUNKSTATE", precision = 1, scale = 0)
	public Boolean getTrunkstate() {
		return this.trunkstate;
	}

	public void setTrunkstate(Boolean trunkstate) {
		this.trunkstate = trunkstate;
	}

	@Column(name = "FK_SO_STACKING_INFO_ID1", precision = 15, scale = 0)
	public Long getFkSoStackingInfoId1() {
		return this.fkSoStackingInfoId1;
	}

	public void setFkSoStackingInfoId1(Long fkSoStackingInfoId1) {
		this.fkSoStackingInfoId1 = fkSoStackingInfoId1;
	}

	@Column(name = "ISCLEAR", precision = 1, scale = 0)
	public Boolean getIsclear() {
		return this.isclear;
	}

	public void setIsclear(Boolean isclear) {
		this.isclear = isclear;
	}

	@Column(name = "FK_STACK_MOTE_NOTE_ID", precision = 15, scale = 0)
	public Long getFkStackMoteNoteId() {
		return this.fkStackMoteNoteId;
	}

	public void setFkStackMoteNoteId(Long fkStackMoteNoteId) {
		this.fkStackMoteNoteId = fkStackMoteNoteId;
	}

	@Column(name = "NOTESTATE", precision = 1, scale = 0)
	public Boolean getNotestate() {
		return this.notestate;
	}

	public void setNotestate(Boolean notestate) {
		this.notestate = notestate;
	}

	@Column(name = "FK_SO_STACKING_INFO_ID", precision = 15, scale = 0)
	public Long getFkSoStackingInfoId() {
		return this.fkSoStackingInfoId;
	}

	public void setFkSoStackingInfoId(Long fkSoStackingInfoId) {
		this.fkSoStackingInfoId = fkSoStackingInfoId;
	}

	@Column(name = "BL_NUMBER", precision = 15, scale = 4)
	public Double getBlNumber() {
		return this.blNumber;
	}

	public void setBlNumber(Double blNumber) {
		this.blNumber = blNumber;
	}

	@Column(name = "BL_NUM", precision = 15, scale = 4)
	public Double getBlNum() {
		return this.blNum;
	}

	public void setBlNum(Double blNum) {
		this.blNum = blNum;
	}

	@Column(name = "TRUNKCAR", length = 100)
	public String getTrunkcar() {
		return this.trunkcar;
	}

	public void setTrunkcar(String trunkcar) {
		this.trunkcar = trunkcar;
	}

	@Column(name = "CONSIGNER_UNIT", length = 100)
	public String getConsignerUnit() {
		return this.consignerUnit;
	}

	public void setConsignerUnit(String consignerUnit) {
		this.consignerUnit = consignerUnit;
	}

	@Column(name = "GOODS_TYPE", length = 100)
	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	@Column(name = "GOODS_CODE", length = 50)
	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	@Column(name = "HD_ID", precision = 15, scale = 0)
	public Long getHdId() {
		return this.hdId;
	}

	public void setHdId(Long hdId) {
		this.hdId = hdId;
	}

	@Column(name = "HZ_NAME", length = 100)
	public String getHzName() {
		return this.hzName;
	}

	public void setHzName(String hzName) {
		this.hzName = hzName;
	}

	@Column(name = "HZ_ID", precision = 15, scale = 0)
	public Long getHzId() {
		return this.hzId;
	}

	public void setHzId(Long hzId) {
		this.hzId = hzId;
	}

	@Column(name = "LX_ID", precision = 15, scale = 0)
	public Long getLxId() {
		return this.lxId;
	}

	public void setLxId(Long lxId) {
		this.lxId = lxId;
	}

	@Column(name = "BOAT_NAME", length = 50)
	public String getBoatName() {
		return this.boatName;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	@Column(name = "START_FLAG", precision = 2, scale = 0)
	public Byte getStartFlag() {
		return this.startFlag;
	}

	public void setStartFlag(Byte startFlag) {
		this.startFlag = startFlag;
	}

}