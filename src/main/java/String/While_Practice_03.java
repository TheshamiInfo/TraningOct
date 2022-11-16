package String;

public class While_Practice_03 {

	public static void main(String[] args) {
		
		int x = 500;
		
		givenseries(x);
		
	}
	public static void givenseries(int x) {
		
		while(x>=100) {
			System.out.println(x);
			
			x=x-25;
		}
		
	}
}
