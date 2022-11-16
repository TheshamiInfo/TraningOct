package com.shami;

import java.io.*;
import java.io.FileWriter;

import org.w3c.dom.DOMImplementation;

import java.io.BufferedWriter;


public class ReapitingCharacterInAFile {
	
public static void main(String[] args) throws IOException {
	
	String path="C:\\Users\\Theshami\\OneDrive\\Desktop";
	String filename = "sample.txt";
	String data ="hii"; 
	
	/**
	 * @author Theshami
	 * this method returns three  argument path,filename
	 */
	
	Createnewfile(path,filename,data);
	
}
public static void Createnewfile(String path, String filename,String data) throws IOException {
	
	File file = new File("C:\\Users\\Theshami\\OneDrive\\Desktop\\Sample.txt");
	
	if(file.createNewFile()) {
		System.out.println("File Is Created At Requested Directry");
		
	}
	else {
		
		System.out.println("File Is Already Present At Requested Directry");
		
	}
	

	/**
	 * @author Theshami
	 * 
	 * Text On File Method
	 */

textonfile(path,filename,data);
}
public static void textonfile(String path,String filename, String data) throws IOException{
//	
	String content="this";
	String filepath="C:\\Users\\Theshami\\OneDrive\\Desktop\\Sample.txt";
	writefile(content,filepath);
	System.out.println("Operation Has done");
	}
public static void writefile(String content,String filepath)throws IOException{
	File file = new File(filepath);
FileWriter filewriter = new FileWriter(file,true);
BufferedWriter writer = new BufferedWriter(filewriter);
writer.append(content);
writer.newLine();
writer.append("Hello I Am Here ");
writer.flush();
writer.close();
	
}

}
