package String;

public class While_Practice_06 {
	public static void main(String[] args) {
	
	int E = 0;
	int sum = 0;
	EvenNumber(E,sum);
}
public static void EvenNumber(int E,int sum) {
	
	while(E<=100) {
		sum = sum + E;
		System.out.println("The Sum Of First 100 Natural Number Is"+" " +sum);
		E=E+2;
		
	}
	
}
}