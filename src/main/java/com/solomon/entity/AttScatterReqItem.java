package com.solomon.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AttScatterReqItem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ATT_SCATTER_REQ_ITEM", schema = "DAVY")
public class AttScatterReqItem implements java.io.Serializable {

	// Fields

	private Long id;
	private Long fkAttScatterReqId;
	private Long fkSoStackingInfoId;
	private Date opTime;
	private Long fkSysUserId;
	private String pilename;
	private Byte startFlag;

	// Constructors

	/** default constructor */
	public AttScatterReqItem() {
	}

	/** minimal constructor */
	public AttScatterReqItem(Long id) {
		this.id = id;
	}

	/** full constructor */
	public AttScatterReqItem(Long id, Long fkAttScatterReqId, Long fkSoStackingInfoId, Date opTime, Long fkSysUserId,
			String pilename, Byte startFlag) {
		this.id = id;
		this.fkAttScatterReqId = fkAttScatterReqId;
		this.fkSoStackingInfoId = fkSoStackingInfoId;
		this.opTime = opTime;
		this.fkSysUserId = fkSysUserId;
		this.pilename = pilename;
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

	@Column(name = "FK_ATT_SCATTER_REQ_ID", precision = 15, scale = 0)
	public Long getFkAttScatterReqId() {
		return this.fkAttScatterReqId;
	}

	public void setFkAttScatterReqId(Long fkAttScatterReqId) {
		this.fkAttScatterReqId = fkAttScatterReqId;
	}

	@Column(name = "FK_SO_STACKING_INFO_ID", precision = 15, scale = 0)
	public Long getFkSoStackingInfoId() {
		return this.fkSoStackingInfoId;
	}

	public void setFkSoStackingInfoId(Long fkSoStackingInfoId) {
		this.fkSoStackingInfoId = fkSoStackingInfoId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "OP_TIME", length = 7)
	public Date getOpTime() {
		return this.opTime;
	}

	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	@Column(name = "FK_SYS_USER_ID", precision = 15, scale = 0)
	public Long getFkSysUserId() {
		return this.fkSysUserId;
	}

	public void setFkSysUserId(Long fkSysUserId) {
		this.fkSysUserId = fkSysUserId;
	}

	@Column(name = "PILENAME", length = 200)
	public String getPilename() {
		return this.pilename;
	}

	public void setPilename(String pilename) {
		this.pilename = pilename;
	}

	@Column(name = "START_FLAG", precision = 2, scale = 0)
	public Byte getStartFlag() {
		return this.startFlag;
	}

	public void setStartFlag(Byte startFlag) {
		this.startFlag = startFlag;
	}

}