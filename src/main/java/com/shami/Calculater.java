package com.shami;

import java.util.Scanner;
public class Calculater {
	  public static void main(String[] args) {
		  
	     Scanner s = new Scanner (System.in);
	     
	     System.out.print(  "Enter Your First Number: "+" ");
	     
	     double Number1=s.nextDouble();
	     s.nextLine();
	     System.out.println("");
	     
	     System.out.print("Enter Your Second Number :"+" ");
	     double Number2 = s.nextDouble();
	     System.out.println("");
	     
	     /**
	      * @author Theshami it will be displayed these instruction below
	      */
	     System.out.println("Select The Following Option");
	        System.out.println("[1] Addition");
			System.out.println("[2] Subtraction");
			System.out.println("[3] Multiplication");
			System.out.println("[4] Dividion");
			int option = s.nextInt();
			s.nextLine();
			
			callOption(Number1,Number2,option);
	  }
	  public static void callOption(double Number1,double Number2, int option) {
		  double Ans = 0;
		  switch (option) {
		case 1:{
			Ans = Number1 + Number2;
			System.out.println("Ans --> Number1 + Number2 ="+" " + Ans);
			break;
		}
		case 2:{
			Ans = Number1 - Number2;
			System.out.println("Ans --> Number1 - Number2 ="+" " + Ans);
			break;
		}
		case 3:{
			Ans = Number1 * Number2;
			System.out.println("Ans --> Number1 * Number2 ="+" " + Ans);
			break;
		}
		case 4:{
			Ans = Number1 / Number2;
			System.out.println("Ans --> Number1 / Number2 ="+" " + Ans);
			break;	
		}
		default:
			System.out.println(" Sorry ! : Invilide Option");
			break;
		  }
	   }
	}


