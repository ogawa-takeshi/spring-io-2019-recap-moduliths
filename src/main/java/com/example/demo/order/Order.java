package com.example.demo.order;


import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Order extends AbstractPersistable<UUID> {

	private LocalDate date;

}
