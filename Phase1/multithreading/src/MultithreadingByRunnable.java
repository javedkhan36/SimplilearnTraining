package com.simplilearn.multithreading;


class multith implements Runnable	{

	@Override
	public void run() {
		
		System.out.println("Thread is running..");
		
	}
	
}

	
public class MultithreadingByRunnable {
	
	public static void main(String[] args) {
		
		multith mr = new multith();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		
		t1.start();
		t2.start();
		t3.start();
		

	}
	
}

