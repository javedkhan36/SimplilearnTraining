package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> arl = new ArrayList<>();
		arl.add("yamha");
		arl.add("bajaj");
		arl.add("suzuki");
		arl.add("tata");
		arl.add("yamha");
		
		arl.add(3, "jk");
//		arl.contains("tata");
		arl.remove(2);
		
		System.out.println("Vehicals ");
		System.out.println("===================");
		Iterator<String> itr = arl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("--------------------");
		System.out.println("total no of items: "+arl.size());
		System.out.println();		
		
		System.out.println();
		System.out.println(arl.contains("tata"));
	}

}
