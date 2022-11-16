
public class Assignment_02 {
	public static void main(String[] args) {
		int arr [] = {-20,-10,-6,-2,10,20,30,40,50}; 
		int Target = 5;
		FindThePairWithSmartnes(arr,Target);
	}
	public static void FindThePairWithSmartnes(int arr [],int Target) {
		int L = arr.length;
		int Element1 = 0 ;
		int ElementN = L-1;
		while(ElementN>Element1) {
			if(arr[Element1]+arr[ElementN]==Target) {
				System.out.println("We Have Found The Target :"+arr[Element1]+" "+arr[ElementN] );
				break;
			}
			else if(arr[Element1]+arr[ElementN]<Target) {
				Element1 +=1;
			}
			else if(arr[Element1]+arr[ElementN]>Target) {
				ElementN -=1;
				
			}
		}
	}
}
