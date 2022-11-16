package com.shami;

import java.util.Scanner;

public class MiniProjectCalculator {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Your First Number");
		double number1= s.nextDouble();

	    s.nextLine();
		System.out.println("Enter Your Second Number");
		double number2 = s.nextDouble();
		s.nextLine();
		
		System.out.println("Enter The Followin]g Option");
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Dividion");
		double Target=s.nextDouble();
		s.nextLine();
		
		CallDouble(Target,number1,number2,T);
		
	}
	public static void CallDouble(int T,double number1,double number2 ) {
		
	double Result = 0;
	
	switch (T) {
	
	case 1:{
		Result =number1+number2;
		System.out.println(Result+("="+" "));
		break;
	}
	case 2:{
		Result=number1-number2;
		 System.out.printf(number1 + " " + T + " " + number2 + " = " + Result);
		break;
	}
	case 3:{
		Result=number1*number2;
		System.out.println(Result+("="+" "));
		break;
	}
	case 4:{
		Result= number1/number2;
		System.out.println(Result+("="+" "));
		break;
	}		
	 }		}
	}
