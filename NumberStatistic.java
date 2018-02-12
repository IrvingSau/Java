/*
 * Date: 2018/2/12
 * Author: IrvingSau
 * Purpose: Make a statistic of amount of numbers in 0 to9;
 */

import java.util.Scanner;

public class NumberStatistic {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[10];
		int input;
		input = in.nextInt();
		while(input != -1) //判断是否终止
		{
			if(input >= 0 && input <= 9)
			{
				numbers[input]++;//使用对应下标的数组单元存放这一个数字的出现次数，numbers[1]指1出现的次数
			}
			input = in.nextInt();
		}
		for(int i = 0; i < numbers.length; i++)//遍历数组输出，直接用数组名.length
		{
			System.out.println("The amount of "+i+" is "+numbers[i]);
		}
	}
}
