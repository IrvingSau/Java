/* 
 * Date: 2018/2/10
 * Author: Irving Sau
 * Purpose: Create a guess number game and sum the times of guessing
 */

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number, input, medium, counter = 1;
		number = (int) (Math.random() * 10);//Use Math.random() to generate a random number, use cast(int) to change the double to int
		
		do{
			input = in.nextInt();
			medium = number - input;
			if(medium < 0)
			{
				System.out.println("Bigger");
				counter++;
			}else if(medium > 0)
			{
				System.out.println("Smaller");
				counter++;
			}
		}while(medium != 0);
		
		if(medium == 0)
		{
			System.out.println("Your guess is equal to the number and the counter is " + counter);
		}
	}
}
