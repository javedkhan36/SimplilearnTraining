package com.simplilearn.oops;

class Calc {
	
	static int add(int x, int y) {
		return x+y;
	}
	
	static int add(int x, int y, int z) {
		return (x+y+z);
	}
	
}


public class PolymorphEx {
	
	public static void main(String[] args) {
		System.out.println(Calc.add(6, 4));
		System.out.println(Calc.add(2, 5, 3));
		
		
	}

}
