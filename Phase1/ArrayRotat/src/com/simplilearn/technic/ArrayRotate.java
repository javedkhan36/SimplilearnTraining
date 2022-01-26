package com.simplilearn.technic;

public class ArrayRotate {

	public static void main(String[] args) {
		
		int[] arr  = {1,2,3,4,5,6,7};
	
		ArrayRotate obj = new ArrayRotate();
		System.out.print("Before rotation: ");	
		obj.printArray(arr);
		
		System.out.println();
		System.out.println();
		
		System.out.print("After rotation: ");
		int[] temp = obj.rotateArray(arr, 5);
		obj.printArray(temp);
		
	}
	
	public void printArray(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	
	public int[] rotateArray(int[] num, int k) {
		int n = num.length;
		int[] temp = new int[n];
		
		for(int i=0; i< n ; i++) {
			temp[(i+k)%n] = num[i];
		}
		return temp;
	}
	

}
