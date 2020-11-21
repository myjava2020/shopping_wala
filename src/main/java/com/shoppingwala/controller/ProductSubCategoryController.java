package com.shoppingwala.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shoppingwala.model.ProductCategory;
import com.shoppingwala.model.ProductSubCategory;
import com.shoppingwala.service.ProductCategoryService;
import com.shoppingwala.service.ProductSubCategoryService;

@Controller
public class ProductSubCategoryController {

	@Autowired
	private ProductSubCategoryService productSubCatService;
	
	@Autowired
	private ProductCategoryService productCatService;
	
	@RequestMapping(value="/subcategory")
	public String getCategories(ModelMap map) {
		
		List<ProductCategory> cats=productCatService.getCategories();
		map.addAttribute("cats", cats);
		
		List<ProductSubCategory> subCats=productSubCatService.getSubCategories();
		map.addAttribute("subcats", subCats);

		map.addAttribute("subcategory", new ProductSubCategory());
		System.out.println("get method returns *************"+subCats);
		return "subCategory";
	}

	@RequestMapping(value="/subcategory", method=RequestMethod.POST)
	public String registerProductSubCategory(
			@ModelAttribute("subcategory") ProductSubCategory subCategory, ModelMap map) {
		ProductSubCategory saveCat = productSubCatService.saveProductSubCat(subCategory);
		List<ProductCategory> cats=productCatService.getCategories();
		map.addAttribute("cats", cats);
		List<ProductSubCategory> subCats=productSubCatService.getSubCategories();
		map.addAttribute("subcats", subCats);
		map.addAttribute("subcategory", new ProductSubCategory());
		System.out.println("Post method returns  ************* "+saveCat);
		return "subCategory";
	}
	
}
