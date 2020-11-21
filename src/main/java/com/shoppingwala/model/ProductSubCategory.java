package com.shoppingwala.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductSubCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productSubCatId;
	
	private String productCategory;
	
	private String productSubCatName;
	
	private String productSubCatDesc;

	public Integer getProductSubCatId() {
		return productSubCatId;
	}

	public void setProductSubCatId(Integer productSubCatId) {
		this.productSubCatId = productSubCatId;
	}

	public String getproductCategory() {
		return productCategory;
	}

	public void setproductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductSubCatName() {
		return productSubCatName;
	}

	public void setProductSubCatName(String productSubCatName) {
		this.productSubCatName = productSubCatName;
	}

	public String getProductSubCatDesc() {
		return productSubCatDesc;
	}

	public void setProductSubCatDesc(String productSubCatDesc) {
		this.productSubCatDesc = productSubCatDesc;
	}

	@Override
	public String toString() {
		return "ProductSubCategory [productSubCatId=" + productSubCatId + ", productCategory=" + productCategory
				+ ", productSubCatName=" + productSubCatName + ", productSubCatDesc=" + productSubCatDesc + "]";
	}
}
