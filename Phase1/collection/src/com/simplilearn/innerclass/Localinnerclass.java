package com.simplilearn.innerclass;

public class Localinnerclass {
	
	private String msg = "hey, how are you?";
	
	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}
		Inner inn = new Inner();
		inn.msg();
	}

	public static void main(String[] args) {
		
		Localinnerclass outer = new Localinnerclass();
		outer.display();
		

	}

}
