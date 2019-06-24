package com.example.demo.catalog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
class ProductController {

	@GetMapping
	public String index() {
		return "index";
	}

}
