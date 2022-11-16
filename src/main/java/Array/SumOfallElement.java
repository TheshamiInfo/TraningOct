package Array;

public class SumOfallElement {
	
	public static void main(String[] args) {
		
		int []arr = {10,25,20,22,27,38,92,56};
		
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
			} 
		System.out.println("Sum of array elements is: "+sum);
	}

}
