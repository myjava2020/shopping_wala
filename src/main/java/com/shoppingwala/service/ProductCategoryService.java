package com.shoppingwala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingwala.dao.ProductCategoryDAO;
import com.shoppingwala.model.ProductCategory;

@Service
public class ProductCategoryService {

	@Autowired
	private ProductCategoryDAO categoryDAO;
	
	public ProductCategory saveProductCategory(ProductCategory category) {
		return categoryDAO.saveProductCategory(category);
	}
	
	public List<ProductCategory> getCategories(){
		return categoryDAO.getCategories();
	}
	
	public void deleteProductCategory(Integer id) {
		categoryDAO.deleteProductCategory(id);
	}
	
	public ProductCategory getByCategoryId(Integer id) {
		return categoryDAO.getByCategoryId(id);
	}
	
	public void updateCategory(ProductCategory category) {
		categoryDAO.updateCategory(category);
	}
}
