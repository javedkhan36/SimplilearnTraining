package com.simplilearn.innerclass;

public class Memberinnerclass {
	
	private String str = "hello";
	
	class inner{
		void hello() {
			System.out.println(str +" welcome to home");
		}
	}

	public static void main(String[] args) {
		
		Memberinnerclass outer = new Memberinnerclass();
		
		Memberinnerclass.inner inn = outer.new inner();
		
		inn.hello();

	}

}
