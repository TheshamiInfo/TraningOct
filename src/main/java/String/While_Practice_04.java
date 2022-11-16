package String;

public class While_Practice_04 {

	public static void main(String[] args) {
		
		int n = 105;
		Tableprint(n);
		
	}
	public static void Tableprint(int n) {
		
		
		while(n>=7) {
			System.out.println(n);
			n-=7;
		}
		
	}

}
