package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		createfileNIO();
		createfilebyFoutputStream();
		

	}
	
	static void createfileNIO() throws IOException {
		String data = "I am a developer";
		
		Files.write(Paths.get("/home/mohdjavedkhanmp/test2.txt"), data.getBytes("UTF-8"));
		System.out.println("Successful..");
	}
	
	static void createfilebyFoutputStream() throws IOException {
		File file = createfileifNot("/home/mohdjavedkhanmp/Documents/", "sample.txt");
		
		String data = "this is just for testing";
		FileOutputStream obj = new FileOutputStream(file);
		obj.write(data.getBytes());
		System.out.println("creating file using fileoutputStream.");
		obj.close();
	}
	
	private static File createfileifNot(String directory, String fileName) throws IOException {
		
		File directoryFile = new File(directory);
		
		if (!directoryFile.exists()) {
			directoryFile.mkdirs();
		}
		
		File file = new File(directory+fileName);
		
		if (file.createNewFile()) {
			System.out.println("file is created.");
		}
		else {
			System.out.println("File is already present.");
		}
		return file;
		
	}

}
