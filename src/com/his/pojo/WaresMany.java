package com.his.pojo;

import java.io.Serializable;

/**
 * 商品详细信息实体类
 * @author 医疗项目组
 * 
 * 2017年12月15日
 */
public class WaresMany implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer _id;
	private Integer id; //商品id
	private String brand; //品牌
	private String common; //通用名
	private String category; //类别
	private String number; //批准文号
	private String dose; //使用剂量
	private String doseType; //产品剂型
	private String usage; //用法
	private String apply; //适应症
	private String person; //适用人群
	private String enterprise; //生产企业
	private String imgUrl; //附加图片
	public WaresMany() {
	}
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getDoseType() {
		return doseType;
	}
	public void setDoseType(String doseType) {
		this.doseType = doseType;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getApply() {
		return apply;
	}
	public void setApply(String apply) {
		this.apply = apply;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
