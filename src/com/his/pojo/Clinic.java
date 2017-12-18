package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *<p>Title:com.ssh.pojo
 *<p>Descriptioin:诊所信息表
 * @author YANG
 *2017年12月15日上午11:46:10
 */
public class Clinic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//诊所id
	private Integer _id;
	//诊所账号
	private String id;
	//诊所密码
	private String  pwd;
	//诊所申请
	private Date registDate;
	//审核通过时间
	private Date auditingDate;
	//状态
	private Integer state;
	//诊所自行描述
	private String describe;
	//备注
	private String comment;
	//营业执照等认证信息
	private String img;
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public Date getAuditingDate() {
		return auditingDate;
	}
	public void setAuditingDate(Date auditingDate) {
		this.auditingDate = auditingDate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
