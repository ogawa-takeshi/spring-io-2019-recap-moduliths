package com.example.demo.inventory;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
@Data
public class Stock extends AbstractPersistable<UUID> {
}
