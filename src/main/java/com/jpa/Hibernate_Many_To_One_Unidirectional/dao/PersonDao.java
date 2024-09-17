package com.jpa.Hibernate_Many_To_One_Unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Person;

public class PersonDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public  Person savePersonDao(Person person){
		
		et.begin();
		em.persist(person);
		et.commit();
		return person;
		
	}
	public Person getPersonByIdPersonDao(int id) {
		return em.find(Person.class, id);
	}
}