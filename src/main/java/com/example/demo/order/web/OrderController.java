package com.example.demo.order.web;

import com.example.demo.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
@RequiredArgsConstructor
class OrderController {

	private final OrderService orderService;

}
