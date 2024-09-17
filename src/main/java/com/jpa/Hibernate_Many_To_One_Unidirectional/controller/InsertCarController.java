package com.jpa.Hibernate_Many_To_One_Unidirectional.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jpa.Hibernate_Many_To_One_Unidirectional.dao.CarDao;
import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Car;
import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Person;

public class InsertCarController {

	public static void main(String[] args) {
		CarDao dao=new CarDao();
		Scanner sc=new Scanner(System.in);
//		List<Car> car=Arrays.asList(new Car(123, "Audi", "Petrol", 1000000),new Car(124, "Lamborgini", "Diesel", 2348585));
//				
//		
//		dao.saveMultipleCarDao(car);
		char p;
		
		do {
			System.out.println("Enter your option....");
			System.out.println("1.INSERT\n2.AssociateById\n3.DELETE\n4.UPDATE\n5.DISPLAY\n6.DeleteByJPQL\n7.UpdateByJPQL");
			int key=sc.nextInt();
			switch(key) {
		case 1:{
				System.out.println("Enter Car id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Car name");
				String name=sc.nextLine();
				System.out.println("Enter Car type");
				String type=sc.nextLine();
				System.out.println("Enter Car price");
				double price=sc.nextDouble();
				Car car1=new Car(id, name, type, price);
				
				
				System.out.println("Enter Car id");
				int id1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Car name");
				String name1=sc.nextLine();
				System.out.println("Enter Car type");
				String type1=sc.nextLine();
				System.out.println("Enter Car price");
				double price1=sc.nextDouble();
				Car car2=new Car(id1, name1, type1, price1);
				
				List<Car> car=Arrays.asList(car1,car2);
				
				dao.saveMultipleCarDao(car);
				
			}break;
			
			case 2:{
				System.out.println("Enter Car id");
				int id=sc.nextInt();
				System.out.println("Enter Person id");
				int id1=sc.nextInt();
				Car car=dao.associatePersonWithCarDao(id, id1);
				if(car!=null) {
					System.out.println("Data Associated Successfully");
				}else {
					System.out.println("failed to Associate");
				}
			}break;
			
			case 3:
			{
				System.out.println("Enter the id to delete");
				int id=sc.nextInt();
				Car car=dao.deleteByCarIdDao(id);
				if(car!=null) {
					System.out.println("Data deleted successfully");
				}
				else {
					System.out.println("Data not deleted");
				}
				
			}break;
			
			case 4:{
				
				System.out.println("Enter Car id to update Person name");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Person name");
				String name=sc.nextLine();
				Car car=dao.updatePersonNamedByCarIdDao(id, name);
				if(car!=null) {
					System.out.println("Data updated Successfully");
				}else {
					System.out.println("Id not found!......");
				}
				
			}break;
			
			case 5:{
				for (Car car : dao.getAllCarAndPersonDao()) {
					System.out.println(car);
				}
			}
				
				}System.out.println("Press Y/y to continue");
				p=sc.next().charAt(0);
				
				}while(p=='Y'|| p== 'y');
			System.out.println("Program ends");
	}

}
