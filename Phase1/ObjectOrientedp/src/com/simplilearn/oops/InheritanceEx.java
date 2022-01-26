package com.simplilearn.oops;

class Employee {
	float salary = 30000;
}

class Company extends Employee {
	int bonus = 5000;
	
	public void displaySalary() {
		System.out.println("Basic salary : "+ salary);
		System.out.println("Bonus: "+bonus);
	}
}


public class InheritanceEx {
	public static void main(String[] args) {
		Company c = new Company();
		c.displaySalary();
	}

}
