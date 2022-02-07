package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;

import antlr.collections.List;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public java.util.List<Category> getAllCategory(){
		
		return categoryRepository.findAll();
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public void removeCategoryById(int id) {
		
		categoryRepository.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id) {
		
		return categoryRepository.findById(id);
	}
}
