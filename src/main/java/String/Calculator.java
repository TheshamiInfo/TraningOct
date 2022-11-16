package String;

public class Calculator {
	public static void main(String[] args) {
	}
	public static void display(int num1 ,int num2, int result,char oprator) {
		
		 switch (oprator) {

	      // performs addition between nums
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between nums
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between nums
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;
	      // performs division between nums
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
		
	}
}
