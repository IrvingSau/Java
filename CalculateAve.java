/*
 * Date: 2018/2/12
 * Author: IrvingSau
 * Purpose: Calculate the average of numbers
 */

import java.util.Scanner;

public class CalculateAve {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[100];
		int sum = 0, i;
		double average;
		System.out.println("Please input the numbers and end with -1: ");
		for(i = 0; i < 100; i++)
		{
			numbers[i] = in.nextInt();
			if(numbers[i] == -1)
				break;
			sum = sum + numbers[i];
			System.out.println(sum);
		}
		average = sum*1.0/i;
		System.out.println(average);
	}
}

/*
 * Java数组格式：类型[] 名字 = new 元素类型[大小]
 * 例：float example = new float[256];
 * 元素个数可以是变量
 * Java中数组的长度可以直接表示为 名字.length
 * 例如：for(i=0; i<numbers.lenght; i++)
 */