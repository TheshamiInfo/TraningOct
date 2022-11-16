package String;

public class TableOfTwo {

	public static void main(String[] args) {
		
		int num = 2,i = 1;
	
		
		 printtable(num, i);
		
	}
	public static void printtable(int num ,int i) {
		
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
		
	}
}

