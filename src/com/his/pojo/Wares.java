package com.his.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品基本信息实体类
 * @author 医疗项目组
 * 
 * 2017年12月15日
 */
public class Wares implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer _id; //商品id
	private String title; //商品标题
	private String subtitle; //商品副标题
	private double rmb_x; // 商品箱价格
	private Integer type; //商品出售类型
	private Integer sumX; //箱总库存
	private Integer sumH; //盒总库存
	private Integer surplusX; //箱剩余库存
	private Integer surplusH; //盒剩余库存
	private double rmbH; //商品价格
	private Date createDate; //上架时间
	private Integer zt; //商品状态
	private String spec; //药品规格
	private String zxl; //装箱量
	public Wares() {
	}
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public double getRmb_x() {
		return rmb_x;
	}
	public void setRmb_x(double rmb_x) {
		this.rmb_x = rmb_x;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getSumX() {
		return sumX;
	}
	public void setSumX(Integer sumX) {
		this.sumX = sumX;
	}
	public Integer getSumH() {
		return sumH;
	}
	public void setSumH(Integer sumH) {
		this.sumH = sumH;
	}
	public Integer getSurplusX() {
		return surplusX;
	}
	public void setSurplusX(Integer surplusX) {
		this.surplusX = surplusX;
	}
	public Integer getSurplusH() {
		return surplusH;
	}
	public void setSurplusH(Integer surplusH) {
		this.surplusH = surplusH;
	}
	public double getRmbH() {
		return rmbH;
	}
	public void setRmbH(double rmbH) {
		this.rmbH = rmbH;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getZt() {
		return zt;
	}
	public void setZt(Integer zt) {
		this.zt = zt;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getZxl() {
		return zxl;
	}
	public void setZxl(String zxl) {
		this.zxl = zxl;
	}
}
