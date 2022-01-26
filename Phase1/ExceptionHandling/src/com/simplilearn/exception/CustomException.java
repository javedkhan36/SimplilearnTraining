package com.simplilearn.exception;

class InvalidAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

public class CustomException {
	void validateAge(int age) throws InvalidAgeException {
		if(age<21) {
			throw new InvalidAgeException();
		}
		System.out.println("Age is perfect!");
	}
	
	
	
	public static void main(String[] args) {
		CustomException obj = new CustomException();
		try {
			
			obj.validateAge(22);
			
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		//List<Employee> list;
		//ID

	}


}
