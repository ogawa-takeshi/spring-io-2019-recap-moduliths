package com.example.demo.inventory.internal;

import com.example.demo.catalog.ProductRepository;
import com.example.demo.inventory.InventoryService;
import com.example.demo.order.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class InventoryServiceImpl implements InventoryService {

	private final ProductRepository productRepository;

	@EventListener
	public void on(Order.OrderCompleted event) {
		// do something...
	}

}
