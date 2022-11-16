public class Pair {
	public static void main(String[] args) {
		int num [] = {-20,-10,-6,-2,10,20,30,40,50};
		int target = 4;
		findThePairWithBruteForce(num,target);
	}
			public static void findThePairWithBruteForce(int num [],int target) {
				int length  = num.length;
				for(int i = 0 ; i < length;i++) {
					for(int j = i+1;j<length;j++) {
					
						if(num[i]+num[j]==target) {
							
							System.out.println("We Found The Target = "+num[i]+" "+num[j]);
							break;
						}
							}
					}
				}
			}
	

