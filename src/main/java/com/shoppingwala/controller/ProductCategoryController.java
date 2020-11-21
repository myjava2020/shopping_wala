package com.shoppingwala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shoppingwala.model.ProductCategory;
import com.shoppingwala.service.ProductCategoryService;

@Controller
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService categoryService;

	@RequestMapping(value="/category")
	public String getAllCategoriesList(ModelMap map) {
		List<ProductCategory> cats=categoryService.getCategories();
		map.addAttribute("cats", cats);
		map.addAttribute("category", new ProductCategory());
		return "category";
	}
	
	@RequestMapping(value="/category", method=RequestMethod.POST)
	public String registerCategory(@ModelAttribute("category") ProductCategory category, ModelMap map) {
		ProductCategory productCategory=categoryService.saveProductCategory(category);
		System.out.println("product Name *********** "+productCategory.getProductCategoryName());
		map.addAttribute("category", new ProductCategory());
//		map.addAttribute("category", productCategory);
		List<ProductCategory> cats=categoryService.getCategories();
		map.addAttribute("cats", cats);
		return "category";
	}
	
	@RequestMapping(value="/categoryList")
	public String getAllCategories(ModelMap map) {
		List<ProductCategory> cats=categoryService.getCategories();
		System.out.println(cats);
		map.addAttribute("cats", cats);
		return "categoryList";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteProductCategory(@PathVariable("id") Integer id, ModelMap map) {
		System.out.println("Deleted id is************ "+id);
		categoryService.deleteProductCategory(id);
		List<ProductCategory> cats=categoryService.getCategories();
		map.addAttribute("cats", cats);
		map.addAttribute("category", new ProductCategory());
		return "category";
	}
	
	@RequestMapping(value="/update/{id}")
	public String getByCategory(@PathVariable("id") Integer id, ModelMap map) {
		ProductCategory category=categoryService.getByCategoryId(id);
		List<ProductCategory> cats=categoryService.getCategories();
		map.addAttribute("cats", cats);
		map.addAttribute("category", category);
		return "categoryUpdate";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateCategory(@ModelAttribute("category")ProductCategory category,ModelMap map) {
		categoryService.updateCategory(category);
		List<ProductCategory> cats=categoryService.getCategories();
		map.addAttribute("cats",cats);
		map.addAttribute("category", new ProductCategory());
		return "category";
	}
}
