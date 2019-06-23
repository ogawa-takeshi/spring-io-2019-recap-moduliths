package com.example.demo.catalog.web;

import com.example.demo.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
//@RequiredArgsConstructor
class ProductController {

	private final OrderService orderService;

//	private final ProductRepository productRepository;

//	private final StockRepository orderRepository;

	ProductController(OrderService orderService) {
		this.orderService = orderService;
	}


	@GetMapping
	public String index() {
		return "index";
	}

}
