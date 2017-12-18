package com.his.pojo;

import java.io.Serializable;
/**
 * 
 *<p>Title:com.ssh.pojo
 *<p>Descriptioin:用户电子病例
 * @author YANG
 *2017年12月15日上午11:51:21
 */
import java.util.Date;
public class UserPsp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//用户电子病例id
	private Integer _id;
	//用户id
	private String userId;
	//申请科室
	private String ks;
	//检查部位
	private String bw;
	//检查所见
	private String look;
	//诊断意见
	private String yj;
	//诊所id
	private Integer clinicId;
	//报告医生
	private Integer doctorId;
	//审核医生
	private Integer doctorShId;
	//日期
	private Date date;
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getKs() {
		return ks;
	}
	public void setKs(String ks) {
		this.ks = ks;
	}
	public String getBw() {
		return bw;
	}
	public void setBw(String bw) {
		this.bw = bw;
	}
	public String getLook() {
		return look;
	}
	public void setLook(String look) {
		this.look = look;
	}
	public String getYj() {
		return yj;
	}
	public void setYj(String yj) {
		this.yj = yj;
	}
	public Integer getClinicId() {
		return clinicId;
	}
	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public Integer getDoctorShId() {
		return doctorShId;
	}
	public void setDoctorShId(Integer doctorShId) {
		this.doctorShId = doctorShId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
