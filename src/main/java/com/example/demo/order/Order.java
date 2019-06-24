package com.example.demo.order;


import com.example.demo.core.AbstractAggregateRoot;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Order extends AbstractAggregateRoot<UUID> {

	private LocalDate date;

}
