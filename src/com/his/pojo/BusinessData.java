package com.his.pojo;

import java.io.Serializable;

/**
 * 
 *<p>Descriptioin:药品厂商详细信息表
 * @author 医疗项目组
 *2017年12月15日上午11:57:38
 */
public class BusinessData implements Serializable{
	private static final long serialVersionUID = 1L;
	//id
	private Integer _id;
	//厂商账号
	private Integer Bid;
	//商品id
	private Integer waresId;
	
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public Integer getBid() {
		return Bid;
	}
	public void setBid(Integer bid) {
		Bid = bid;
	}
	public Integer getWaresId() {
		return waresId;
	}
	public void setWaresId(Integer waresId) {
		this.waresId = waresId;
	}
}
