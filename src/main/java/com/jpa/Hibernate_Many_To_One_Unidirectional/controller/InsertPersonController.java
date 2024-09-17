package com.jpa.Hibernate_Many_To_One_Unidirectional.controller;

import java.util.Scanner;

import com.jpa.Hibernate_Many_To_One_Unidirectional.dao.PersonDao;
import com.jpa.Hibernate_Many_To_One_Unidirectional.dto.Person;


public class InsertPersonController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PersonDao dao=new PersonDao();
		
		char p;
		
		do {
			System.out.println("Enter your option....");
			System.out.println("1.INSERT\n2.GetById\n3.DELETE\n4.UPDATE\n5.DISPLAY\n6.DeleteByJPQL\n7.UpdateByJPQL");
			int key=sc.nextInt();
			switch(key) {
		case 1:{
			
			System.out.println("Enter Person id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Person name");
			String name=sc.nextLine();
			System.out.println("Enter Person age");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Person email");
			String email=sc.nextLine();
			
			Person person=new Person(id, name, age, email);
			
			dao.savePersonDao(person);
			
			
		}break;
		
		
			}System.out.println("Press Y/y to continue");
			p=sc.next().charAt(0);
			
			}while(p=='Y'|| p== 'y');
		System.out.println("Program ends");

	}

}
