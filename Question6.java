import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int MONTHS = 12;
		int days_in_month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int month, day, result = 0;
		
		System.out.println("Enter the month: ");
		month = in.nextInt();
		System.out.println("Enter the day: ");
		day = in.nextInt();
		
		for(int i = 0; i < month - 1; i++) {
			result = result + days_in_month[i];
		}
		
		result = result + day;
		System.out.printf("%d/%d is the day number %d in the year", day, month, result);
	}

}
