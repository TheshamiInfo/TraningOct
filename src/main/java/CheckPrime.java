
public class CheckPrime {
	
	public static void main(String[] args) {
		
		int num = 7;
//		
		display(num);
		
	}
	public static void display(int x) {
		
		
		switch (x%3) {
		case 0:
			System.out.println("It Is Prime Number");
			
			break;
		case 1:
			System.out.println("It's Not A Prime Number");

		default:
			break;
		}
	}

}
