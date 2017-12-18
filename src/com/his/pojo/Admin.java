package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员实体类
 * @author 医疗项目组
 * 
 * 2017年12月15日
 */
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id; //账号
	private String pwd; //密码
	private Date registDate; //添加时间
	private Integer power; //权限
	private Integer login; //账号状态
	private Date loginDate; //最近一次登录时间
	
	
	public Admin() {
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
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
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
}
