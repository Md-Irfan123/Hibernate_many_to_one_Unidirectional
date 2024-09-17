package com.jpa.Hibernate_Many_To_One_Unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Car;
import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Person;

public class CarDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public List<Car> saveMultipleCarDao(List<Car> car){
		
		et.begin();
		for (Car car2 : car) {
			em.persist(car2);
			
		}
		et.commit();
		return car;
		
	}
	public Car associatePersonWithCarDao(int carId,int personId) {
		Car car=em.find(Car.class, carId);
		Person person=em.find(Person.class, personId);
		
		if(car!=null && person !=null) {
			car.setPersons(person);
			et.begin();
			em.merge(car);
			et.commit();
			return car;
		}
		return null;
		
	}
	public Car deleteByCarIdDao(int carId) {
		Car car=em.find(Car.class, carId);
		if(car!=null) {
			et.begin();
			em.remove(car);
			et.commit();
			return car;
		}else {
			return null;
		}
	}
	public Car updatePersonNamedByCarIdDao(int carId,String personName) {
		
		Car car=em.find(Car.class, carId);
	
		if(car!=null) {
			car.setName(personName);
			et.begin();
			em.merge(car);
			et.commit();
			
			return car;
			}else {
				return null;
			}
		
	}
	public List<Car> getAllCarAndPersonDao(){
		String selectQuery="select c from Car c";
		Query query=em.createQuery(selectQuery);
		
		return query.getResultList();
		
	}
	public List<Car> getAllCarDataDao(){
		return em.createQuery("From Car").getResultList();
	}
	
	
	
	

}
