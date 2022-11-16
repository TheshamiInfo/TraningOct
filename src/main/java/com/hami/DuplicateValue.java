package com.hami;

public class DuplicateValue {
	
	
public static void main(String[] args) {
	int [] arr = {10,25,20,22,27,38,92,56,10};
	
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if ((arr[i] == arr [j]) && (i!=j))
{
System.out.println("Duplicate Array Is "+ arr[j]);				
			}
			
			
		}
		
	}

	
	
}
}
