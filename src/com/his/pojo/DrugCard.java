package com.his.pojo;

import java.io.Serializable;

/**
 *<p>Descriptioin:电子药单
 * @author 医疗项目组
 *2017年12月15日上午11:32:32
 */
public class DrugCard implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//药单id
	private Integer _id;
	//诊所id
	private Integer clinic;
	//开具医生
	private Integer doctor;
	//患者id
	private String user;
	//科室
	private String ks;
	//诊断:（如肺炎）
	private String zd;
	//开具药物(如6号药物2个,3号药物1个)
	private String psp;
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public Integer getClinic() {
		return clinic;
	}
	public void setClinic(Integer clinic) {
		this.clinic = clinic;
	}
	public Integer getDoctor() {
		return doctor;
	}
	public void setDoctor(Integer doctor) {
		this.doctor = doctor;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getKs() {
		return ks;
	}
	public void setKs(String ks) {
		this.ks = ks;
	}
	public String getZd() {
		return zd;
	}
	public void setZd(String zd) {
		this.zd = zd;
	}
	public String getPsp() {
		return psp;
	}
	public void setPsp(String psp) {
		this.psp = psp;
	}
}
