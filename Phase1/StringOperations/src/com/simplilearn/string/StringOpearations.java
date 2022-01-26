package com.simplilearn.string;

public class StringOpearations {

	public static void main(String[] args) {
		
		

		String j = "Software Engineer";
		System.out.println(j.length());
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(0,2));
		
		String s2 = j.concat(" javed khan");
		System.out.println(s2);
		
		s2 += " *********";
		System.out.println(s2);
		
		System.out.println(s2.charAt(3));

		
		String str1 = "Done";
		String str2 = "Done";
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		
		System.out.println(st1 == st2); 
		System.out.println(st1.equals(st2));
		
	
		System.out.println(st1.toUpperCase());
		
		System.out.println(st2.replace("H", "D"));
		
		String test = "Likes @ car";
		
		String[] str = test.split("@");
		
	
	
		StringBuffer sb = new StringBuffer();
		sb.append("lets ");
		sb.append("do ");
		sb.append("coding ");
		sb.append("4");
		
		
		System.out.println(sb.toString());
		
		
		String t1 = "Computer";
		String t2 = "computer";
				
		System.out.println(t1.equalsIgnoreCase(t2));
		
		String a1 = "java";
		
		String a2 = a1;
		
		System.out.println(a1 == a2);
		

	}

}
