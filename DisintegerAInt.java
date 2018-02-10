/*
 * Date: 2018/2/10
 * Author: IrvingSau
 * Purpose: Reverse the order of number
 */

import java.util.Scanner;

public class DisintegerAInt {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number, digit, result = 0;
		number = in.nextInt();
		
		do{
			digit = number % 10;//get the first digit of every number
			result = result * 10 + digit;//calculate the result. The first number was stored become the biggest digit.
			number = number / 10;//reduce the digit
		}while(number > 0);
		System.out.println(result);
	}
}
