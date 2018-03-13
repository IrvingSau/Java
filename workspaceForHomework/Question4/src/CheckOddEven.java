import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int input;
		
		System.out.println("Please input an integer: ");
		
		//input
		input = in.nextInt();
		
		//Make decision
		if(input % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		//Always print
		System.out.println("BYE!");
	}

}
