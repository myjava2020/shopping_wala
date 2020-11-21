package com.shoppingwala.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingwala.jpa.ProductCategoryJPA;
import com.shoppingwala.model.ProductCategory;

@Repository
public class ProductCategoryDAO {
	
	@Autowired
	ProductCategoryJPA productCategoryRepository; 
	
	public ProductCategory saveProductCategory(ProductCategory category) {
		return productCategoryRepository.save(category);
	}

	public List<ProductCategory> getCategories(){
		return productCategoryRepository.findAll();
	}
	
	public void deleteProductCategory(Integer id) {
		productCategoryRepository.deleteById(id);
	}
	
	public ProductCategory getByCategoryId(Integer id) {
		return productCategoryRepository.findById(id).get();
	}
	
	public void updateCategory(ProductCategory category) {
		productCategoryRepository.save(category);
	}
}
