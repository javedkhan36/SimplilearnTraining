package com.simplilear.constructor;

public class Const {
	int id;
	String name;
	
	Const(int id, String name){
		this.id=id;
		this.name=name;
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
	}
	
	
	

	public static void main(String[] args) {
		Const c =new Const(125,"JK");

	}

}
