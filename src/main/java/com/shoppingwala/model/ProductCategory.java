package com.shoppingwala.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer poductCategoryId;
	
	private String productCategoryName;
	
	private String productCategoryDesc;

	public Integer getPoductCategoryId() {
		return poductCategoryId;
	}

	public void setPoductCategoryId(Integer poductCategoryId) {
		this.poductCategoryId = poductCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public String getProductCategoryDesc() {
		return productCategoryDesc;
	}

	public void setProductCategoryDesc(String productCategoryDesc) {
		this.productCategoryDesc = productCategoryDesc;
	}

	@Override
	public String toString() {
		return "ProductCategory [poductCategoryId=" + poductCategoryId + ", productCategoryName=" + productCategoryName
				+ ", productCategoryDesc=" + productCategoryDesc + "]";
	}
}
