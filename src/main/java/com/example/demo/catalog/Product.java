package com.example.demo.catalog;

import com.example.demo.core.Address;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Data
public class Product extends AbstractPersistable<UUID> {

	private String name;

	private Address address;

}
