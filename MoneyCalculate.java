/*
 * Date: 2018/2/11
 * Author: IrvingSau
 * Purpose: Calculate the amount of different kinds of cash for a value
 */

import java.util.Scanner;

public class MoneyCalculate {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a value");
		int input = in.nextInt();
		int ten, five, one;
		OUT://Label，为跟着的ten循环标明，可以直接跳出这一循环。
		for(ten = 0; ten*10 < input; ten++)
		{
			for(five = 0; five*5 < input; five++)
			{
				for(one = 0; one*1 < input; one++)
				{
					if(ten*10 + five*5 + one*1 == input)
					{	
						System.out.println("You need "+ten+ " ten rmb cash and "+five+" five rmb cash and "+one+" one rmb cash.");
						break OUT;
					}
				}
			}
		}
	}
}

/*
 * Java中可以对循环进行表标记（label），并且可以直接用break Label跳出标记循环。在多重循环中非常好用。
 */
 