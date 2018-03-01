import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount;
		float input, result = 1;
		System.out.println("How many floating point numbers do you want to multiply tegether: ");
		amount = in.nextInt();
		for(int i = 0; i < amount; i++) {
			System.out.print("Enter a floating point number: ");
			input = in.nextFloat();
			result = result * input;
		}
		System.out.printf("The product is %f", result);
	}

}
