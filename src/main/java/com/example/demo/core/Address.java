package com.example.demo.core;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {

	private String line1;

	private String line2;

	private String city;

	private String state;

	private String country;

	private String zipCode;

}
