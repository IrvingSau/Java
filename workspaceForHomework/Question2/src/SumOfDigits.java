import java.util.Scanner;

public class SumOfDigits {
	
	//Create a class function to sum all digits
	public static int SumDigits(int input) {
		//Base condition
		if(input / 10 == 0)
			return input % 10;
		//Other condition
		else
			return input % 10 + SumDigits(input/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int input;
		System.out.print("Input an integer between 0 and 1000: ");
		input = in.nextInt();
		System.out.println("The sum of all digits in "+input+" is "+SumDigits(input));
	}

}
