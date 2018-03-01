import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int first, second;
		
		System.out.println("Enter the first integer: ");
		first = in.nextInt();
		
		System.out.println("Enter the second integer: ");
		second = in.nextInt();
		
		if(first >= 0 && second >= 0) {
			System.out.printf("The integers %d and %d are both positive", first, second);
		}else if(first < 0 || second < 0) {
			System.out.printf("The integers %d and %d are not both positive", first, second);
		}
	}

}
