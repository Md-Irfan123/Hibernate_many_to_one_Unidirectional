package com.jpa.Hibernate_Many_To_One_Unidirectional.dto;



import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String email;
	
	
	

}
