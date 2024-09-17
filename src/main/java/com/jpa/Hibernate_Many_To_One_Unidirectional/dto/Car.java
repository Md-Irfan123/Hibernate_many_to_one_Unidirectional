package com.jpa.Hibernate_Many_To_One_Unidirectional.dto;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	@Id
	private int id;
	private String name;
	private String type;
	private double price;
	
	public Car(int id, String name, String type, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	@ManyToOne
	private Person persons;

}
