package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *<p>Descriptioin:药品厂商基本信息表
 * @author 医疗项目组
 *2017年12月15日下午12:00:43
 */
public class Business implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//id
	private Integer _id;
	//厂商账号
	private Integer id;
	//厂商密码
	private String pwd;
	//厂商申请
	private Date date;
	//审核通过时间
	private Date auditingDate;
	//状态
	private Integer state;
	//厂商自行描述
	private String describe;
	//备注
	private String comment;
	//营业执照等 认证信息、
	private String img;
	
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPassword() {
		return pwd;
	}
	public void setPassword(String pwd) {
		this.pwd = pwd;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
