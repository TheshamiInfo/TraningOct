package com.hami;

public class Variableess {

	   static int x = 10;
	  int y = 100;
	  
	public static void main(String[] args) {
		Variableess v = new Variableess();
		
		System.out.println(x);
		v.y = 10000;
		System.out.println(v.y);
		
		v.x = 200;
		
		disp1();
		
		
	}
	public static void disp1() {
		System.out.println("2nd");
		Variableess v = new Variableess (); 
		
		System.out.println("hii"+" "+x);
//		System.out.println(y);
		
		System.out.println("this"+" "+v.y);
		
		
		
		
	}
}
