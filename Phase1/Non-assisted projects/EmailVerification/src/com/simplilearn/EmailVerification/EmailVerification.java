package com.simplilearn.EmailVerification;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailVerification {
	public static void main(String[] args) {
		
		
		System.out.println("Enter the email to search: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); 
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("javedkhan90@gmail.com");
	    list.add("utkarshsingh@gmail.com");
	    list.add("saifsheikh@gmail.com");
	    list.add("amansingh@gmail.com");
	    list.add("zamankhan@yahoo.com");
	    
	    System.out.println("Search Results: ");
	    for (String element : list) {
	       if (element.contains(name)) {
	             System.out.println(element + " " + "is present in the array!");
	              }  
	        }
	    sc.close();
	     }

}
