package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 普通用户实体类
 * @author 医疗项目组
 * 
 * 2017年12月15日
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id; // 账号
	private String pwd; // 密码
	private Date date; // 注册时间
	private String registIp; //注册时ip
	private Integer login; //账号状态
	private Date loginDate; //最近一次登录时间
	private Integer sex; //性别
	private Integer age; //年龄
	private String address; //所在地
	private String phone; //手机号
	private Integer jf; //积分
	
	
	public User() {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRegistIp() {
		return registIp;
	}
	public void setRegistIp(String registIp) {
		this.registIp = registIp;
	}
	public Integer getLogin() {
		return login;
	}
	public void setLogin(Integer login) {
		this.login = login;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getJf() {
		return jf;
	}
	public void setJf(Integer jf) {
		this.jf = jf;
	}
}
