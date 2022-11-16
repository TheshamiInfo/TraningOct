package com.hami;

import java.awt.Checkbox;
import java.io.File;
import java.util.Arrays;

import javax.sql.rowset.CachedRowSet;

import org.w3c.dom.UserDataHandler;

public class StringTest {

	public static void main(String[] args){
		
//		String s1 = new String ("Shami");
//		String s2  = new String ("farhan");
		
//		System.out.println(s1==s2);
		
		
		String s3 = "SHAMI IS A JAVA DEVELOPER";
		String s4  = "shami is a java developer";
		
//		System.out.println(s3==s4);
//		
//		System.out.println(s1.equals(s1));
		
		
		/*IT IS USE FOR CHECK CONTANT EQUAL  EX---> S3= SHAMI IS A JAVA DEVELOPER, S4 = 
				SHAMI IS A JAVA DEVELOPER HERE S3 OR S4 IS EQUAL MEANS TRUE but
				 string case should be same case */
		System.out.println(s3.contentEquals(s4));
		
		
//		IT IS USE FOR String REPLACE  EX. SHAMI --> MAHTAB
		System.out.println(s3.replace("SHAMI", "MAHTAB"));
		
/*		equalIgnoreCase is Use for  Check string that it is equal or not ex s3= shami s4 =
				shami it is equla caSE IGNIRE */
	System.out.println(s3.equalsIgnoreCase(s4));
		

//		
		File file = new File("C:\\Users\\Theshami\\OneDrive\\Desktop\\Java_practce");
		System.out.println(Arrays.asList(file.list()));
		
	}
}
