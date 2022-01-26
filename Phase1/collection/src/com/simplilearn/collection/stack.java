package com.simplilearn.collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("aslam");
		st.push("utkarsh");
		st.push("Aj");
		
		String s = st.pop();
		System.out.println(s);
		
		
		st.push("jak");
		
		System.out.println("========");
		
		for (String value : st) {
			System.out.println(value);
		}
		

	}

}
