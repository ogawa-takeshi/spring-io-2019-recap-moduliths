package com.example.demo.order;


import com.example.demo.core.AbstractAggregateRoot;
import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Order extends AbstractAggregateRoot<UUID> {

	private LocalDate date;

	private OrderStatus status;

	public Order complete() {
		this.status = OrderStatus.COMPLETED;
		registerEvent(OrderCompleted.of(this));
		return this;
	}

	@Value(staticConstructor = "of")
	public static class OrderCompleted {

		Order order;

	}
}
