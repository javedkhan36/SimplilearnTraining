package com.simplilearn.innerclass;

public class Staticinnerclass {

	static int a = 10;
	
	static class Inner{
		void msg() {
			System.out.println("hey! take you'r gift Rs:"+a);
		}
	}
	
	public static void main(String[] args) {
		
		Staticinnerclass.Inner stin  = new Staticinnerclass.Inner();	
		stin.msg();

	}

}
