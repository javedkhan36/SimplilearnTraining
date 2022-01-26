package com.simplilearn.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<>();
		
		lst.add("AK");
		lst.add("SK");
		lst.add("SHK");
		lst.add("IK");
		
		lst.add(2, "JK");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			String Value =  itr.next();
			System.out.println(Value);			
			
		}
		System.out.println("==============");
	
		System.out.println("total no of items: "+lst.size());
	}

}
