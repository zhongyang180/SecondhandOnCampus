package com.ncu.pojo;

import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private String picturePath;

    private String coverPic;

    private Integer quantity;

    private Double price;

    private Integer usedMonth;

    private Date publishDate;

    private Integer goodsState;

    private Integer auditState;

    private Integer userId;

    private Integer categoryId;

    private String failureText;

    private String introducedText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath == null ? null : picturePath.trim();
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUsedMonth() {
        return usedMonth;
    }

    public void setUsedMonth(Integer usedMonth) {
        this.usedMonth = usedMonth;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getFailureText() {
        return failureText;
    }

    public void setFailureText(String failureText) {
        this.failureText = failureText == null ? null : failureText.trim();
    }

    public String getIntroducedText() {
        return introducedText;
    }

    public void setIntroducedText(String introducedText) {
        this.introducedText = introducedText == null ? null : introducedText.trim();
    }

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", picturePath="
				+ picturePath + ", coverPic=" + coverPic + ", quantity="
				+ quantity + ", price=" + price + ", usedMonth=" + usedMonth
				+ ", publishDate=" + publishDate + ", goodsState=" + goodsState
				+ ", auditState=" + auditState + ", userId=" + userId
				+ ", categoryId=" + categoryId + ", failureText=" + failureText
				+ ", introducedText=" + introducedText + "]";
	}
    
}