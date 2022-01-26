package com.simplilearn.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {10, 7, 14, 12, 22, 3, 20, 31, 5,	 29, 44 };
		
		SelectionSort sc = new SelectionSort();
		sc.printarray(a);
		sc.selectionsort(a);
		sc.printarray(a);

	}
	
	void printarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public void selectionsort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			int min = i;
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		
	}

}
