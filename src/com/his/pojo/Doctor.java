package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *<p>Descriptioin:医生信息表
 * @author 医疗项目组
 *2017年12月15日上午11:41:09
 */
public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//医生id
	private Integer _id;
	//医生账号
	private String id;
	//医生密码
	private String pwd;
	//医生姓名
	private String name;
	//医生性别(0:男，1.女)
	private Integer sex;
	//医生年龄
	private Integer age;
	//入职时间
	private Date date;
	//擅长
	private String adept;
	//所在诊所
	private Integer clinic;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAdept() {
		return adept;
	}
	public void setAdept(String adept) {
		this.adept = adept;
	}
	public Integer getClinic() {
		return clinic;
	}
	public void setClinic(Integer clinic) {
		this.clinic = clinic;
	}
}
