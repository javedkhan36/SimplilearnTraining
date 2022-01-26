package com.simplilearn.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		System.out.println("Enter the element to  search: ");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int search = sc.nextInt();
			int result = linearSearch(arr, search);
			
			if (result == -1) {
				System.out.println("Element is not present");
			} else {
				System.out.println("Element is found at index "+ result +" and the search value is "+arr[result]);
			}
		}
		
		

	}
	
	public static int linearSearch(int[] arr, int value) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		
		return -1;
		
	}

}
