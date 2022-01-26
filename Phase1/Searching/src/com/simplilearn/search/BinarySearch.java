package com.simplilearn.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] a = {4, 6, 10, 13, 17};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		while (true) {
			
			int key = sc.nextInt();
			
			Binary(a ,0, key, a.length);
		}

	}
	
	static void Binary(int[] a,int start,int key, int end) {
		int mid = (start + end)/2;
		
		while (start <= end) {
			
			if (a[mid] < key) {
				start = mid + 1;
			}
			else if (a[mid] == key) {
				System.out.println("Element found at index "+mid);
				break;
			}
			else {
				end = mid - 1;

			}
			mid = (start + end)/2;		
			}
		if (start > end) {
			System.out.println("Element not present in array");
		}
	}
}	
