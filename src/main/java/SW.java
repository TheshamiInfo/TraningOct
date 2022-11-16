

public class SW {
	
	public static void main(String[] args) {
		
		int num = 2;
		
		display(num);
	}
	public static void display(int x) {
		switch (x*10) {
		case 10:
			System.out.println("x is 10");
			
			break;
		case 20:
			System.out.println("x is 20");
			break;
		case 30:
			System.out.println("x is 30");
			break;
		case 40:
			System.out.println("x is 40");
			break;

		default:
			System.out.println("N/A");
		}
	}

}
