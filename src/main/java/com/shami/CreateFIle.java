package com.shami;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateFIle {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Theshami\\OneDrive\\Desktop\\"; 
		String filename = "home.txt";
		
		Createfile(path,filename);
	}
	public static void Createfile(String path,String filename) throws IOException {
		
		File f = new File("home.txt");
//		System.out.println(f.length());
		
		if(f.createNewFile()) {
			System.out.println("file Is Created At Requested Directry");
			
		}
		else {
			System.out.println("This File Is Already Exist At Requested Directry");
			
		}
		readTextFile(path,filename);
	}
	public static void readTextFile(String path, String filename) throws IOException {
		
		String filePath=path+"/"+filename;
		File file = new File(filePath);
		
		if(file.exists()) {
			System.out.println("This file have present Characters Are:"+file.length());
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line=br.readLine();
			int count = 0;
			while(null!=line) {
				
				System.out.println("Line No:-"+count+" "+line);
				line=br.readLine();
				count+=1;
				
			}
			br.close();
		}
		else {
			System.out.println("File Not present in requested directry,kindly check the file path again");
		}
		
		}
	
	
	}



