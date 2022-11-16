package Array;
public class Live {
	
		  public static void main(String[] args) {
			     int[] nums = {-20,-10,-6,-2,10,20,30,40,50};
			        int target = 4;
			        
			        for(int i=0; i<nums.length; ++i){
			            for(int j=i+1; j<nums.length; ++j){
			                if(nums[i] + nums[j] == target){
			                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
			                }
			            }
			        }

		    }
		
	}
	
	


