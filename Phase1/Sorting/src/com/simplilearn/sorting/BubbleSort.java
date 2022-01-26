package com.simplilearn.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {10, 7, 14, 12, 22, 20, 31, 29, 44 };
		
		BubbleSort obj = new BubbleSort();
		
		obj.printarray(arr);
		obj.bubbleSort(arr);
		obj.printarray(arr);
		
		

	}
	void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length; j++) {
				
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	 }

}
