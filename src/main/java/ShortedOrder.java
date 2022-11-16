import java.util.Arrays;
public class ShortedOrder {
	public static void main(String[] args) {
		int arr1 [] = {10,20,5,8,300};
		
	int arr2 [] = {40,2,19,12,50};
	
	  Arrays.sort(arr1);
	  Arrays.sort(arr2);
	  int [] Target = new int[arr1.length+arr2.length];
	  int i = 0, j = 0, k = 0;
	  while(i < arr1.length && j < arr2.length){
	    if(arr1[i] <= arr2[j]){
	      Target[k] = arr1[i];
	      i++;
	      k++;
	    }else{
	      Target[k] = arr2[j];
	      j++;
	      k++;
	    }
	  }

	  while(i < arr1.length){
	    Target[k] = arr1[i];
	    i++;
	    k++;
	  }
	  while(j < arr2.length){
	    Target[k] = arr2[j];
	    j++;
	    k++;
	  }
	  System.out.println("Target :"+Arrays.toString(Target));
	}
}
