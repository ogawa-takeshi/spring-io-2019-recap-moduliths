package com.example.demo.order.internal;

import com.example.demo.complex.spi.SpiComponent;
import com.example.demo.inventory.StockRepository;
import com.example.demo.order.OrderService;
import com.example.demo.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;

	private final StockRepository stockRepository;

	private SpiComponent spiComponent;

//	private final InventoryService inventoryService;

	@Override
	public void completeOrder() {
		spiComponent.test();
		// do something
	}
}
