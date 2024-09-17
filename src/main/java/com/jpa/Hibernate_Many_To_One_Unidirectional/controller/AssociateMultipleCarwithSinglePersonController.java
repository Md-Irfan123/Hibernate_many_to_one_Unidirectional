package com.jpa.Hibernate_Many_To_One_Unidirectional.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jpa.Hibernate_Many_To_One_Unidirectional.dao.AssociatePersonAndCarDao;

public class AssociateMultipleCarwithSinglePersonController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AssociatePersonAndCarDao dao=new AssociatePersonAndCarDao();
		
		char p;
		
		do {
			System.out.println("Enter your option....");
			System.out.println("1.INSERT\n2.AssociateById\n3.DELETE\n4.UPDATE\n5.DISPLAY\n6.DeleteByJPQL\n7.UpdateByJPQL");
			int key=sc.nextInt();
			switch(key) {
		case 1:{
		
		System.out.println("Enter Car1 id");
		int id=sc.nextInt();
		System.out.println("Enter Car2 id");
		int id1=sc.nextInt();
		List<Integer> integer=Arrays.asList(id,id1);
		System.out.println("Enter person id");
		int id2=sc.nextInt();
		dao.associateMultipleCarWithSinglePersonDao(integer, id2);
		
		}break;
		

			}System.out.println("Press Y/y to continue");
			p=sc.next().charAt(0);
			
			}while(p=='Y'|| p== 'y');
		System.out.println("Program ends");

	}

}
