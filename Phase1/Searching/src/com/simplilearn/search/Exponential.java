package com.simplilearn.search;

import java.util.Arrays;
import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		int[] a = {4, 7, 10, 12, 15};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Enter the element to search ");
			int key = sc.nextInt();
			
			int result = exponentialsearch(a, a.length, key);
			if (result < 0) {
				System.out.println("Elelment is not present");
			}
			else {
				System.out.println("Element  found at index "+result);
			}
		}
		

	}
	
	static int exponentialsearch(int[] a, int n, int value) {
		
		
		if (a[0] == value) {
			return 0;
		}
		int i = 1;
		while (i < n && a[i] <= value) {
			i = i * 2;
		}
		return Arrays.binarySearch(a, i/2, Math.min(i, n), value);
	}

}
