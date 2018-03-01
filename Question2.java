import java.util.Scanner;

public class Question2 {

	public static double abs(double input) {
		double result = 0;
		if(input > 0) {
			result = input;
		}else if(input < 0) {
			result = input * -1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double input;
		System.out.print("Enter a floating-point number: ");
		input = in.nextDouble();
		System.out.printf("The absolute value of %f is %f", input, abs(input));
	}

}
