/*
 * Date: 2018/2/11
 * Author: IrvingSau
 * Purpose: Calculate if a input is a prime number
 */

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int input = in.nextInt();
		int i, flag = 1;
		
		for(i = 2; i < input; i++)
		{
			if(input % i == 0)//从2开始依次递增，当输入值可以被整除时，说明有除了1以外的数字，这个方法需要排除1和输入值本身
			{
				flag = 0;
			}
		}
		
		if(flag == 1)
			System.out.println(input+" is a prime number");
		else
			System.out.println(input+ " is not a prime number");
	}
}


/* 
 * break直接跳出循环， continue跳出这一步骤的剩下语句，进入循环的下一步骤
 */