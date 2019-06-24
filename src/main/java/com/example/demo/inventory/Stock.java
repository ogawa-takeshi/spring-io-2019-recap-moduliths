package com.example.demo.inventory;

import com.example.demo.core.AbstractAggregateRoot;
import lombok.Data;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Data
public class Stock extends AbstractAggregateRoot<UUID> {
}
