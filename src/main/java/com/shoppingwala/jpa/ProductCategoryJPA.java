package com.shoppingwala.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingwala.model.ProductCategory;

public interface ProductCategoryJPA extends JpaRepository<ProductCategory, Integer> {

}
