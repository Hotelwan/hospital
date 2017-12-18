package com.his.pojo;

import java.io.Serializable;

/**
 *<p>Descriptioin:诊所药品
 * @author 医疗项目组
 *2017年12月15日上午11:24:36
 */
public class ClinicPsp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//药品id
	private Integer _id;
	//诊所id
	private Integer clinic;
	//药品名称
	private String name;
	//规格:例如 66ml
	private String gg;
	//单位
	private String dw;
	//库存
	private Integer num;
	//用法
	private String yf;
	//用量
	private String yl;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGg() {
		return gg;
	}
	public void setGg(String gg) {
		this.gg = gg;
	}
	public String getDw() {
		return dw;
	}
	public void setDw(String dw) {
		this.dw = dw;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getYf() {
		return yf;
	}
	public void setYf(String yf) {
		this.yf = yf;
	}
	public String getYl() {
		return yl;
	}
	public void setYl(String yl) {
		this.yl = yl;
	}
}
