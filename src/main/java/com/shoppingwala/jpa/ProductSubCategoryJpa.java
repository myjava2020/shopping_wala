package com.shoppingwala.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingwala.model.ProductSubCategory;

public interface ProductSubCategoryJpa extends JpaRepository<ProductSubCategory, Integer> {

}
