package com.jshop.entity;

// Generated 2012-8-27 13:29:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ArticleCategoryT generated by hbm2java
 * 记录文章文类
 */
public class ArticleCategoryT implements java.io.Serializable {

	private String articleCategoryTid; //记录文章文类ID
	private String grade;              //层级关系
	private String metaKeywords;       //关键字
	private String metaDes;            //描述 
	private String name;               //分类  
	private String status;             //状态
	private Date createtime;           //创建时间
	private String creatorid;          //创建这ID	·
	private String path;               //分类
	private int sort;                  // 排序
	private String parentId;           //父分类ID
	private String sign;               //唯一     
	private String parentName;         //分类名称
	private String position;		   //显示位置	
	private Date updatetime;           //更新时间
	private int versiont;              //版本

	public ArticleCategoryT() {
	}

	public ArticleCategoryT(String articleCategoryTid, String grade,
			String name, String status, Date createtime, String creatorid,
			String path, int sort, String sign, String position,
			Date updatetime, int versiont) {
		this.articleCategoryTid = articleCategoryTid;
		this.grade = grade;
		this.name = name;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.path = path;
		this.sort = sort;
		this.sign = sign;
		this.position = position;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	public ArticleCategoryT(String articleCategoryTid, String grade,
			String metaKeywords, String metaDes, String name, String status,
			Date createtime, String creatorid, String path, int sort,
			String parentId, String sign, String parentName, String position,
			Date updatetime, int versiont) {
		this.articleCategoryTid = articleCategoryTid;
		this.grade = grade;
		this.metaKeywords = metaKeywords;
		this.metaDes = metaDes;
		this.name = name;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.path = path;
		this.sort = sort;
		this.parentId = parentId;
		this.sign = sign;
		this.parentName = parentName;
		this.position = position;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	public String getArticleCategoryTid() {
		return this.articleCategoryTid;
	}

	public void setArticleCategoryTid(String articleCategoryTid) {
		this.articleCategoryTid = articleCategoryTid;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDes() {
		return this.metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
