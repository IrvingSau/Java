import java.util.Scanner;

public class SumAndAverage {
	
	public static void ForLoop() {
		int sum = 0;
		//use final to define a constant
		int amount = 0;
		double average;
		
		//Use for loop to calculate the sum of 1 to 100
		for(int i = 1; i<101; i++) {
			//Judge if i is odd number
			if(i % 2 == 1) {
				sum = sum + i;
				amount++;
			}
		}
		
		//Both sum and amount are integer, we need to use (float) to change type
		average = (float)sum/amount;
		
		System.out.println("The sum is: "+sum);
		System.out.println("The average of all odd numbers from 0 to 100 is: "+average);
	}
	
	public static void While() {
		int i = 1;
		int sum = 0, amount = 0;
		double average;
		while(i <= 100) {
			//Judge if i can be devided by 7
			if(i%7 == 0) {
				sum = sum + i;
				amount++;
			}
			i++;
		}
		average = (float)sum / amount;
		System.out.println("The sum is: "+amount);
		System.out.println("The average of all number which can be devided by 7 is: "+average);
	}
	
	public static void DoWhile() {
		int i = 1;
		
		//Use long type to store big integer
		long result = 0;
		
		//loop-body
		do {
			result = result + i*i;
			i++;
		}while(i <= 100);
		
		System.out.println("The sum of the squares of all number from 1 to 100 is: "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Create a user interface to let user select what does him want to do
		System.out.println("What is your purpose? Input the index");
		System.out.println("1. Compute the average of all odd numbers from 0 to 100");
		System.out.println("2. Compute the average of all number which can be devided by 7");
		System.out.println("3. Sum the square of all number from 1 to 100");
		
		int flag = in.nextInt();
		
		//use switch to match their purpose
		switch(flag) {
		case 1: ForLoop();
		break;
		case 2: While();
		break;
		case 3: DoWhile();
		break;
		}
	}

}
