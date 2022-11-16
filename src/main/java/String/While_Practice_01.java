package String;

public class While_Practice_01 {

	public static void main(String[] args) {
		int x = 10;
		
		printhello(x);
		
	}
	public static void printhello(int x ) {
		
		while(x<50) {
			System.out.println("Hello");
			x = x +5;
		}
	}
}
