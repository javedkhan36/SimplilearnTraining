package com.simplilearn.multithreading;

public class multithreading extends Thread{
	
	public void run() {
		System.out.println("THread is running..");
	}

	public static void main(String[] args) {
		
		multithreading ml = new multithreading();
		
		ml.start();
	}

}
