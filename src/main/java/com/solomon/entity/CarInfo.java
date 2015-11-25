package com.solomon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Carinfo entity. @author MyEclipse Persistence Tools
 */
@Entity(name="Carinfo")
@Table(name = "CARINFO")
public class CarInfo implements java.io.Serializable {

	private static final long serialVersionUID = 3200969567799056626L;
	private Long id;  //唯一标识
	private String carno; //车牌号
	private Long vehidelength;//车长
	private Long vehidewidth;//车宽度
	private Long vehideheight;//车高度
	private Long vehidemounted;//载重吨
	private String electiontag;//电子标签
	private Long carStatus;//0 启用 1，未启用

	// Constructors

	/** default constructor */
	public CarInfo() {
	}

	/** minimal constructor */
	public CarInfo(Long id) {
		this.id = id;
	}

	/** full constructor */
	public CarInfo(Long id, String carno, Long vehidelength, Long vehidewidth, Long vehideheight, Long vehidemounted,
			String electiontag, Long carStatus) {
		this.id = id;
		this.carno = carno;
		this.vehidelength = vehidelength;
		this.vehidewidth = vehidewidth;
		this.vehideheight = vehideheight;
		this.vehidemounted = vehidemounted;
		this.electiontag = electiontag;
		this.carStatus = carStatus;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 11, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CARNO", length = 50)
	public String getCarno() {
		return this.carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	@Column(name = "VEHIDELENGTH", precision = 10, scale = 0)
	public Long getVehidelength() {
		return this.vehidelength;
	}

	public void setVehidelength(Long vehidelength) {
		this.vehidelength = vehidelength;
	}

	@Column(name = "VEHIDEWIDTH", precision = 10, scale = 0)
	public Long getVehidewidth() {
		return this.vehidewidth;
	}

	public void setVehidewidth(Long vehidewidth) {
		this.vehidewidth = vehidewidth;
	}

	@Column(name = "VEHIDEHEIGHT", precision = 10, scale = 0)
	public Long getVehideheight() {
		return this.vehideheight;
	}

	public void setVehideheight(Long vehideheight) {
		this.vehideheight = vehideheight;
	}

	@Column(name = "VEHIDEMOUNTED", precision = 10, scale = 0)
	public Long getVehidemounted() {
		return this.vehidemounted;
	}

	public void setVehidemounted(Long vehidemounted) {
		this.vehidemounted = vehidemounted;
	}

	@Column(name = "ELECTIONTAG", length = 50)
	public String getElectiontag() {
		return this.electiontag;
	}

	public void setElectiontag(String electiontag) {
		this.electiontag = electiontag;
	}

	@Column(name = "CAR_STATUS", precision = 10, scale = 0)
	public Long getCarStatus() {
		return this.carStatus;
	}

	public void setCarStatus(Long carStatus) {
		this.carStatus = carStatus;
	}

}