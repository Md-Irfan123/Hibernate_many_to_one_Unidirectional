package com.jpa.Hibernate_Many_To_One_Unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Car;
import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Person;

public class AssociatePersonAndCarDao {
	
	CarDao dao=new CarDao();
	PersonDao dao1=new PersonDao();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public List<Car> associateMultipleCarWithSinglePersonDao(List<Integer> integer,int personId) {
		Person person=dao1.getPersonByIdPersonDao(personId);
		List<Car> cars=dao.getAllCarDataDao();
		if(person!=null) {
		et.begin();
		
		for (Car car : cars) {
			for (Integer integer1: integer) {
				if(car.getId()==integer1) {
					car.setPersons(person);
					em.merge(car);
					
				}
			}
			
		}
		
		et.commit();
		
			
		 		
		}
		return cars;
	}

}
