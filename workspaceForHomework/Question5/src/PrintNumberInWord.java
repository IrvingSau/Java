import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input a one-digit integer: ");
		
		int input = in.nextInt();
		
		//nested-if
		if(input == 1)
			System.out.println("ONE");
		else if(input == 2)
			System.out.println("TWO");
		else if(input == 3)
			System.out.println("THREE");
		else if(input == 4)
			System.out.println("FOUR");
		else if(input == 5)
			System.out.println("FIVE");
		else if(input == 6)
			System.out.println("SIX");
		else if(input == 7)
			System.out.println("SEVEN");
		else if(input == 8)
			System.out.println("EIGHT");
		else if(input == 9)
			System.out.println("NINE");
		
		//switch-case
		switch(input) {
		case 1: System.out.println("ONE");
			break;
		case 2: System.out.println("TWO");
			break;
		case 3: System.out.println("THREE");
			break;
		case 4: System.out.println("FOUR");
			break;
		case 5: System.out.println("FIVE");
			break;
		case 6: System.out.println("SIX");
			break;
		case 7: System.out.println("SEVEN");
			break;
		case 8: System.out.println("EIGHT");
			break;
		case 9: System.out.println("NINE");
			break;
	
		}
	}

}
