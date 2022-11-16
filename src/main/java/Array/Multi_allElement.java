package Array;

public class Multi_allElement {

	public static void main(String[] args) {
		
		int [] arr = {10,25,20,22,27,38,92,56};
		int mul = 1;
		
		for (int i = 0; i < arr.length; i++) {
			mul = mul*arr[i];
			
		}
		System.out.println("Multiplication of all elements in an array: " + mul);
		
	}
}
