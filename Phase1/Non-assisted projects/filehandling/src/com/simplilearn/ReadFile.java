package com.simplilearn.filehandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		
		
		File f=new File("/home/mohdjavedkhanmp/javed/abc.txt");
		try {
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			String data=s.nextLine();
			System.out.println(data);
		}
		s.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
  }
}
