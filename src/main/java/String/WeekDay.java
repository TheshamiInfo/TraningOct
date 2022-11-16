package String;
public class WeekDay {
	
	public static void main(String[] args) {
		int day = 4;
		dasplay(day);
	}
	public static void dasplay(int day) {
		
		switch (day) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THUSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println(" sorry N/A kindly choose corect option");
		}
	}
}
