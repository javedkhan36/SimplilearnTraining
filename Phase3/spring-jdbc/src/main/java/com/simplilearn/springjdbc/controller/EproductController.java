package com.simplilearn.springjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.springjdbc.dao.EproductDao;
import com.simplilearn.springjdbc.model.Eproduct;

@Controller
public class EproductController {
	
	@Autowired
	EproductDao eproductDao;
	
	@GetMapping("/listProducts")
	public String listProducts(Model model) {

		List<Eproduct> products = eproductDao.getProducts();
		
		model.addAttribute("products", products);
		
		return "listProducts";
	}

}
