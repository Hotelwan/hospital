package com.his.pojo;

import java.io.Serializable;
/**
 *<p>Title:com.ssh.pojo
 *<p>Descriptioin:用户购物车
 * @author YANG
 *2017年12月15日上午11:20:06
 */
import java.util.Date;
public class UserSCar implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//购物车id
	private Integer _id;
	//用户id
	private String userId;
	//商品id
	private Integer wares;
	//创建时间
	private Date date;
	//状态(0.正常:默认，1：失效)
	private Integer zt;
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
	public Integer getWares() {
		return wares;
	}
	public void setWares(Integer wares) {
		this.wares = wares;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getZt() {
		return zt;
	}
	public void setZt(Integer zt) {
		this.zt = zt;
	}
}
