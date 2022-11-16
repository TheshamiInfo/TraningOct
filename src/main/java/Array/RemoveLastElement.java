package Array;


public class RemoveLastElement {

	public static void main(String[] args) {
		
		int [] arr = {10,25,20,22,27,38,92,56};
		
		int n = arr.length; 
        int[] new_arr = new int[n - 1]; 
  
        for (int i = 0; i < n - 1; i++) 
            new_arr[i] = arr[i]; 
  
  System.out.println("After Removed The Last Element : "); 
        for (int i = 0; i < new_arr.length; i++) 
            System.out.print(new_arr[i] + " "); 
		
	}
	}
	