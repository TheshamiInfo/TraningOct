package Array;

public class StringArrat_01 {

	public static void main(String[] args) {
		
		
		 int [] arr = { 10 , 25 , 20 , 22 , 27 , 38 , 92 , 56 }; 
		 int max = arr[ 0 ];
		 for ( int i = 1 ; i < arr.length; i++) {
			 if (arr[i] > max) { max = arr[i];{
				  System.out.println( "Maximum value: " + max);
			  }
		 
		 } 
			 
		 }
}
}
