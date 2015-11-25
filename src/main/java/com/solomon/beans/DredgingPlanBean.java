package com.solomon.beans;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.solomon.utils.JsonDateSerializer;

@Entity
public class DredgingPlanBean {
	private Double id;// 通知ID
	private String pactNo;
	private String boatName;
	private String mineName;
	private String hzName;
	private String hdName;
	private String pile;
	private Double sumNum;//总量
	private Double sumWorkedNum;//已完成量
	private Double sumRemainNum;//剩余总量
	private Date startTime;
	private Date endTime;
	/**
	 * @return the id
	 */
	@Id
	public Double getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Double id) {
		this.id = id;
	}
	/**
	 * @return the pactNo
	 */
	public String getPactNo() {
		return pactNo;
	}
	/**
	 * @param pactNo the pactNo to set
	 */
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	/**
	 * @return the boatName
	 */
	public String getBoatName() {
		return boatName;
	}
	/**
	 * @param boatName the boatName to set
	 */
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
	/**
	 * @return the mineName
	 */
	public String getMineName() {
		return mineName;
	}
	/**
	 * @param mineName the mineName to set
	 */
	public void setMineName(String mineName) {
		this.mineName = mineName;
	}
	/**
	 * @return the hzName
	 */
	public String getHzName() {
		return hzName;
	}
	/**
	 * @param hzName the hzName to set
	 */
	public void setHzName(String hzName) {
		this.hzName = hzName;
	}
	/**
	 * @return the hdName
	 */
	public String getHdName() {
		return hdName;
	}
	/**
	 * @param hdName the hdName to set
	 */
	public void setHdName(String hdName) {
		this.hdName = hdName;
	}
	/**
	 * @return the pile
	 */
	public String getPile() {
		return pile;
	}
	/**
	 * @param pile the pile to set
	 */
	public void setPile(String pile) {
		this.pile = pile;
	}
	/**
	 * @return the sumNum
	 */
	public Double getSumNum() {
		return sumNum;
	}
	/**
	 * @param sumNum the sumNum to set
	 */
	public void setSumNum(Double sumNum) {
		this.sumNum = sumNum;
	}
	/**
	 * @return the sumWorkedNum
	 */
	public Double getSumWorkedNum() {
		return sumWorkedNum;
	}
	/**
	 * @param sumWorkedNum the sumWorkedNum to set
	 */
	public void setSumWorkedNum(Double sumWorkedNum) {
		this.sumWorkedNum = sumWorkedNum;
	}
	/**
	 * @return the sumRemainNum
	 */
	public Double getSumRemainNum() {
		return sumRemainNum;
	}
	/**
	 * @param sumRemainNum the sumRemainNum to set
	 */
	public void setSumRemainNum(Double sumRemainNum) {
		this.sumRemainNum = sumRemainNum;
	}
	/**
	 * @return the startTime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	

}
