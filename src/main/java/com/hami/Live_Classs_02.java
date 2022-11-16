package com.hami;

import java.util.Scanner;

public class Live_Classs_02 {
	
	public static void main(String[] args) {
		        int num1, num2;
		        Scanner sc = new Scanner(System.in);
		  
		        System.out.println("Enter your numbers");
		        Scanner scanner = new Scanner (System.in);
		        System.out.println("Enter Your Second number");
		Scanner scanner2 = new Scanner(System.in);  
		System.out.println("enter your choice");
		
		        // take the inputs
		        num1 = sc.nextInt();
		  
		        num2 = sc.nextInt();
		  
		        System.out.println("Enter the operator (+,-,*,/)");
		  
		        char op = sc.next().charAt(0);
		  
		       int o = 0;
		  
		        switch (op) {
		  
		        // case to add two numbers
		        case '+':
		  
		            o = num1 + num2;
		  
		            break;
		  
		        // case to subtract two numbers
		        case '-':
		  
		            o = num1 - num2;
		  
		            break;
		  
		        // case to multiply two numbers
		        case '*':
		  
		            o = num1 * num2;
		  
		            break;
		  
		        case '/':
		  
		            o = num1 / num2;
		  
		            break;
		  
		            break;
		        }
		  
		        System.out.println("The final result:");
		  
		        System.out.println();
		  
		        // print the final result
		        System.out.println(num1 + " " + op + " " + num2
		                           + " = " + o);
		    }
		
		
	}

}
