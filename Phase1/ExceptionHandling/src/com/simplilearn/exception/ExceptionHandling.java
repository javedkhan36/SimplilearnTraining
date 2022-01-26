package com.simplilearn.exception;

public class ExceptionHandling {
	

	public static void main(String[] args) {		
		
		int a= 5;
		int b= 1;
		String s =null;
		
		try {
			
			int c = a/b;
			
			s.length();
				
		} catch(ArithmeticException e) {
			System.out.println("Internal error occurred");
			e.printStackTrace();
			
		} catch(Exception e) {
			System.out.println(" Internal error");
		} finally {
			System.out.println("This is my finally block");
		}
			
		System.out.println("This is end of statement");		
		
	}


}
