/* Date: 2018/2/10
 * Author: IrvingSau
 * Purpose: Calculate the digits of a number
 */

import java.util.Scanner;

public class NumberCalculate {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number, result = 0;
		number = in.nextInt();
		while(number / 10 > 0)
		{
			result = result + 1;
			number = number / 10;
		}
		result = result + 1;
		System.out.println("The digits of this number is:" + result);
	}
}
