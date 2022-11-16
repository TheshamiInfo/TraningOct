package Array;

public class Array_Minimum {
	
	   public static int min(int[] arr) {
	    	int min=arr[0];
	    	for (int i=0; i<arr.length; i++) {
	    		if (arr[i]<min) {
	    			min=arr[i];
	    		}
	    	}
	    	return min;
	    }
	    public static void main(String[] args) {
	    	int[] arr= {10,25,20,22,27,38,92,56};
	    	System.out.println("The Minimum Element Is "+min(arr));
}
}
	

