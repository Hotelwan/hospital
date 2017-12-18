package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统日志实体类
 * @author 医疗项目组
 * 
 * 2017年12月15日
 */
public class SysLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer _id; //日志id
	private String user; //关联的用户id
	private String title; //日志标题
	private String data; //日志数据
	private Date date; //日志创建时间
	
	public SysLog() {
	}
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
