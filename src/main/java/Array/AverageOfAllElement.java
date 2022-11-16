package Array;

public class AverageOfAllElement {

	public static void main(String[] args) {
		
//	
		int [] array = {10,25,20,22,27,38,92,56};
		
        int length = array.length;
       
        int sum = 0;
 
        for (int i = 0; i < array.length; i++) {
        	
            sum += array[i];    
        }
        
        float average = sum / length;
         
        System.out.println("Average of array : "+average);
 
	}
}
