package com.simplilearn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	
		
		public static void main(String[] args) {
			
			try {
		FileWriter f=new FileWriter("/home/mohdjavedkhanmp/javed/abc.txt");

		f.write("coding world");
		f.close();
		System.out.println("succesfilly updated");
		}
			catch(IOException e) {
			e.printStackTrace();
		}
		}
	}


