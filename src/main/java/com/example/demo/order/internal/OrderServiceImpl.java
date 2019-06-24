package com.example.demo.order.internal;

import com.example.demo.catalog.ProductRepository;
import com.example.demo.order.Order;
import com.example.demo.order.OrderRepository;
import com.example.demo.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;

	private final ProductRepository productRepository;

	@Override
	public void completeOrder(Order order) {
//		new PrivateSample();
		this.orderRepository.save(order.complete());
	}
}
