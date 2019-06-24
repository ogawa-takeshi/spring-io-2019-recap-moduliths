package com.example.demo.catalog;

import com.example.demo.core.AbstractAggregateRoot;
import com.example.demo.core.Address;
import lombok.Data;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Data
public class Product extends AbstractAggregateRoot<UUID> {

	private String name;

	private Address address;

}
