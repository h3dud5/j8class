package com.standardchartered.erp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataReader {

	public static void main(String[] args) {
		String workingDirectory = System.getProperty("user.dir");
		String filePath = workingDirectory + File.separator + "data" + File.separator + "customerList.txt";
		System.out.println(workingDirectory);

		// Reading any file using FileReader
		try {
			FileReader fileReader = new FileReader(filePath);
			int content;
			while ((content = fileReader.read()) != -1) {
				System.out.print((char)content);
			}
			fileReader.close();
			System.out.println();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		// Reading text content line by line.
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			String content;
			while((content = bufferedReader.readLine()) != null) {
				System.out.println(content);
			}
			bufferedReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
