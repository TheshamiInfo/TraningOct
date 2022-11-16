package String;
public class While_Practice_02 {

	public static void main(String[] args) {
		
		int x = 10;
		series(x);
		
	}
	public static void series(int x) {
		
		while(x<=300) {
			System.out.println(x);
			x=x+10;
		}
		
	}
}
