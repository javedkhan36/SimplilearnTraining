package com.simplilearn.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = {10, 7, 14, 12, 22, 3, 20, 31, 5,	 29, 44 };
		
		InsertionSort obj = new InsertionSort();
		
		obj.printarray(a);
		obj.insertionsort(a);
		obj.printarray(a);
		

	}
	void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public void insertionsort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			
			int picked = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > picked) {
				a[j+1] = a[j];
				j--;
				
			}
			a[j+1] = picked;
		}
	}

}
