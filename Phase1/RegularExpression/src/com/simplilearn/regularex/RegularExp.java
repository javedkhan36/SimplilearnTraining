package com.simplilearn.regularex;

import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z]+", "javed"));
		
		System.out.println(Pattern.matches("AZ", "AZ"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "javedKHAN34"));
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "javedkhan14@gmail.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "javedkhan14#gmail.com"));


	}

}
