package com.solomon.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NetPreBean {

	private Long id;// 预到ID
	private String boatCnName;//
	private String boatEnName;
	private String hzName;
	private String hdName;
	private String cdName;
	private String mineName;// 货种
	private String status;// 状态
	private String boatPos;// 船舶位置

	/**
	 * @return the id
	 */
	@Id
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the boatCnName
	 */
	public String getBoatCnName() {
		return boatCnName;
	}

	/**
	 * @param boatCnName
	 *            the boatCnName to set
	 */
	public void setBoatCnName(String boatCnName) {
		this.boatCnName = boatCnName;
	}

	/**
	 * @return the boatEnName
	 */
	public String getBoatEnName() {
		return boatEnName;
	}

	/**
	 * @param boatEnName
	 *            the boatEnName to set
	 */
	public void setBoatEnName(String boatEnName) {
		this.boatEnName = boatEnName;
	}

	/**
	 * @return the hzName
	 */
	public String getHzName() {
		return hzName;
	}

	/**
	 * @param hzName
	 *            the hzName to set
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
	 * @param hdName
	 *            the hdName to set
	 */
	public void setHdName(String hdName) {
		this.hdName = hdName;
	}

	/**
	 * @return the cdName
	 */
	public String getCdName() {
		return cdName;
	}

	/**
	 * @param cdName
	 *            the cdName to set
	 */
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	/**
	 * @return the mineName
	 */
	public String getMineName() {
		return mineName;
	}

	/**
	 * @param mineName
	 *            the mineName to set
	 */
	public void setMineName(String mineName) {
		this.mineName = mineName;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the boatPos
	 */
	public String getBoatPos() {
		return boatPos;
	}

	/**
	 * @param boatPos
	 *            the boatPos to set
	 */
	public void setBoatPos(String boatPos) {
		this.boatPos = boatPos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NetPreBean [id=" + id + ", boatCnName=" + boatCnName + ", boatEnName=" + boatEnName + ", hzName=" + hzName
				+ ", hdName=" + hdName + ", cdName=" + cdName + ", mineName=" + mineName + ", status=" + status + ", boatPos="
				+ boatPos + "]";
	}
	

}
