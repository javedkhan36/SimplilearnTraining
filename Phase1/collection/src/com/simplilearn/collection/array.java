package com.simplilearn.collection;

public class array {

	public static void main(String[] args) {
		
		int[] a= {2,4,6,8,3,5};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			System.out.println("==============");
			System.out.println("total no.of: " +a.length);
			System.out.println();
			System.out.println("************************************");
		
		
//				or
		
		int[] b = new int[4];
		b[0] = 12;
		b[1] = 15;
		b[2] = 14;
		b[3] = 18;
	
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		System.out.println("==============");
		System.out.println("total no.of: " +a.length);
		
	}

}
