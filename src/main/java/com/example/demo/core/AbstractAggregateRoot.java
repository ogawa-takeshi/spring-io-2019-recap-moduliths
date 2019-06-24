package com.example.demo.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.data.domain.DomainEvents;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAggregateRoot<PK extends Serializable>
		extends AbstractPersistable<PK> {

	@JsonIgnore
	private final transient List<Object> domainEvents = new ArrayList<>();

	@DomainEvents
	public List<Object> getDomainEvents() {
		return this.domainEvents;
	}

	protected <T> T registerEvent(T event) {
		Assert.notNull(event, "Domain event must not be null!");
		this.domainEvents.add(event);
		return event;
	}

	@AfterDomainEventPublication
	public void clearDomainEvents() {
		this.domainEvents.clear();
	}

}
