package com.shoppingwala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingwala.dao.ProductSubCategoryDao;
import com.shoppingwala.model.ProductSubCategory;

@Service
public class ProductSubCategoryService {

	@Autowired
	private ProductSubCategoryDao productSubCategoryDao;
	
	public ProductSubCategory saveProductSubCat(ProductSubCategory subCategory) {
		return productSubCategoryDao.saveSubCategory(subCategory);
	}
	
	public List<ProductSubCategory> getSubCategories(){
		return productSubCategoryDao.getSubCategories();
	}
	
	public ProductSubCategory finProductSubCategoryById(Integer id) {
		return productSubCategoryDao.getSubCategoryById(id);
	}
	
	public void updateProductSubCategory(ProductSubCategory subCategory) {
		productSubCategoryDao.updateProductSubCategory(subCategory);
	}
	
	public void deleteProductSubCategory(Integer id) {
		productSubCategoryDao.deleteProductSubCategory(id);
	}
}
