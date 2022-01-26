package com.simplilearn.multithreading;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int a;
	public transient String c;
	
	public Demo(int a,String c) {
		this.a = a;
		this.c = c;
	}
}

public class Serial{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Demo d = new Demo(1,"jk");
		System.out.println("printing value before serialization.");
		System.out.println(d.a);
		System.out.println(d.c);
		System.out.println("==================");
		
		String fileName ="file.ser";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
		obj.writeObject(d);
		
		obj.close();
		fos.close();
		
		System.out.println("serialization is completed");
		
		System.out.println("Starting deserialization");
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Demo dem = (Demo) ois.readObject();
		
		System.out.println(dem.a);
		System.out.println(dem.c);
		
		ois.close();
		fis.close();

	}

}
