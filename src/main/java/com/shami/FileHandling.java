package com.shami;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import String.while_02;
//import java.util.Arrays;

public class FileHandling {

public static void main(String[] args) throws IOException {
	
//	File x = new File("../TraningOct/src/main/java/String/shami.txt");
//	System.out.println(x.exists());
//	System.out.println(x.canRead());
//	System.out.println(x.canWrite());
//	System.out.println(x.isDirectory());
//	System.out.println(x.isFile());
//	
//	System.out.println(Arrays.asList(x.listFiles()).toString());
//	System.out.println(Arrays.asList(x.listFiles()).toString());
	
	// write a program to create a file at destination d with fileName f;
	
	
	
	String path="../TraningOct/src/main/java/String/shami.txt";
	String fileName = "class02.txt";
	boolean isFileCrated = createFile(path,fileName);
	System.out.println("File"+fileName+"is created:-"+isFileCrated);

	readTextFile(path,fileName);
	/**
	 * @author Theshami
	 */
}	

//private static boolean createFile(String path, String fileName) {
//	// TODO Auto-generated method stub
//	return false;
//}

public static void readTextFile(String path,String fileNeme) throws FileNotFoundException{
	String filePath=path+"/"+fileNeme;
	File file = new File(filePath);
	
	if(file.exists()) {
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
public static boolean creatFile(String path,String filrName)throws IOException{
	String pathName = path +"/"+ fileName;
	File file = new File(pathName);
	if(!f.exist()) {
		
		f.createNewFile();
		System.out.println("New File Is Created At Requested Path");
		return boolean.TRUE;
		
		
	}else {
		
		
		System.out.println("File Is Already Present In The Directory");
		return boolean.FALSE;
		
	}
}
}
