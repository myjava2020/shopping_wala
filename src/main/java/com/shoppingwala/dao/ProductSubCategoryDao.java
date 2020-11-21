package com.shoppingwala.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingwala.jpa.ProductSubCategoryJpa;
import com.shoppingwala.model.ProductSubCategory;

@Repository
public class ProductSubCategoryDao {

	@Autowired
	private ProductSubCategoryJpa subCategoryJpa;
	
	public ProductSubCategory saveSubCategory(ProductSubCategory subCategory) {
		return subCategoryJpa.save(subCategory);
	}
	
	public List<ProductSubCategory> getSubCategories(){
		return subCategoryJpa.findAll();
	}
	
	public ProductSubCategory getSubCategoryById(Integer id) {
		return subCategoryJpa.findById(id).get();
	}
	
	public void updateProductSubCategory(ProductSubCategory productSubCategory) {
		subCategoryJpa.save(productSubCategory);
	}
	
	public void deleteProductSubCategory(Integer id) {
		subCategoryJpa.deleteById(id);
	}
}
