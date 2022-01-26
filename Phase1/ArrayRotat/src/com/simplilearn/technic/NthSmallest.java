package com.simplilearn.technic;

import java.util.Arrays;
import java.util.Scanner;

public class NthSmallest {
	
	public static void main(String[] args) {
		int[] arr = {12,5,3,19,7,4};
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter N:");
			int n = sc.nextInt();
			
			
			int output = NthSmallest.nthSmallest(arr, n);
			System.out.println(output);
		}
		
	}
	
	
	static int nthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}


}
