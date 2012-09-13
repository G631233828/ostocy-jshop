package com.jshop.entity;

// Generated 2012-9-13 10:50:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * CartT generated by hbm2java
 */
public class CartT implements java.io.Serializable {

	private String id;
	private String cartid;
	private String orderid;
	private String goodsid;
	private String goodsname;
	private String userid;
	private String username;
	private int needquantity;
	private double price;
	private double favorable;
	private Double changeprice;
	private double points;
	private double subtotal;
	private Date addtime;
	private Integer quantity;
	private String picture;
	private String usersetnum;
	private String weight;
	private String state;
	private String htmlpath;
	private String productid;
	private String orderTag;

	public CartT() {
	}

	public CartT(String id, String goodsid, String goodsname, String userid,
			String username, int needquantity, double price, double favorable,
			double points, double subtotal, Date addtime, String picture,
			String usersetnum, String state, String htmlpath, String productid,
			String orderTag) {
		this.id = id;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.userid = userid;
		this.username = username;
		this.needquantity = needquantity;
		this.price = price;
		this.favorable = favorable;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.state = state;
		this.htmlpath = htmlpath;
		this.productid = productid;
		this.orderTag = orderTag;
	}

	public CartT(String id, String cartid, String orderid, String goodsid,
			String goodsname, String userid, String username, int needquantity,
			double price, double favorable, Double changeprice, double points,
			double subtotal, Date addtime, Integer quantity, String picture,
			String usersetnum, String weight, String state, String htmlpath,
			String productid, String orderTag) {
		this.id = id;
		this.cartid = cartid;
		this.orderid = orderid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.userid = userid;
		this.username = username;
		this.needquantity = needquantity;
		this.price = price;
		this.favorable = favorable;
		this.changeprice = changeprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.quantity = quantity;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.weight = weight;
		this.state = state;
		this.htmlpath = htmlpath;
		this.productid = productid;
		this.orderTag = orderTag;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCartid() {
		return this.cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(int needquantity) {
		this.needquantity = needquantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFavorable() {
		return this.favorable;
	}

	public void setFavorable(double favorable) {
		this.favorable = favorable;
	}

	public Double getChangeprice() {
		return this.changeprice;
	}

	public void setChangeprice(Double changeprice) {
		this.changeprice = changeprice;
	}

	public double getPoints() {
		return this.points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUsersetnum() {
		return this.usersetnum;
	}

	public void setUsersetnum(String usersetnum) {
		this.usersetnum = usersetnum;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getOrderTag() {
		return this.orderTag;
	}

	public void setOrderTag(String orderTag) {
		this.orderTag = orderTag;
	}

}
