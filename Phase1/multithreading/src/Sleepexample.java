package com.simplilearn.multithreading;

class Slep implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}
class Slep1 implements Runnable{

	@Override
	public void run() {
		for(int i=51; i<100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}
public class Sleepexample {

	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Slep());
		Thread t2= new Thread(new Slep1());
		
		t1.start();
		
		t1.join();
		
		t2.start();
		

	}

}
