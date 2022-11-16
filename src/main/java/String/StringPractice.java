package String;
public class StringPractice {

	public static void main(String[] args) {
	int n = 101;
		display(n);
	}
			public static void display(int n) {
				
				if(n %2==0) {
					System.out.println(n+" "+" Is Divisible By 2");
				}
				else if(n %3==0) {
					System.out.println(n+" "+" Is Divisible By 3");
					
				}
				else if (n%7==0) {
					System.out.println(n+" "+" Is Divisible By 7");
				}
				else if (n%11==0) {
					System.out.println(n+" "+" Is Divisible By 11");
				}
				else if(n%13==0) {
					System.out.println(n+" "+" Is Divisible By 13");
				}
				else {
					System.out.println(n+" "+"N/D");
				}
	}
	
}
