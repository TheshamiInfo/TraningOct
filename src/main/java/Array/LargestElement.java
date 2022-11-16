package Array;

public class LargestElement {
	
	public static void main(String[] args) {
		
		int [] arr = {10,25,20,22,27,38,92,56};
		int largest = arr[0];
		int secondLargest = arr[0];

		for(int i=0; i<arr.length;i++) {
		if(arr[i]>largest) {
		  secondLargest=largest;
		  largest=arr[i];
		}
		else if(arr[i]>secondLargest) {
		  secondLargest=arr[i];
		}
		}
		System.out.println("Second largest Element is:" + secondLargest);
	}
}
