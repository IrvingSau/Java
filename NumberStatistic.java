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
		while(input != -1) //�ж��Ƿ���ֹ
		{
			if(input >= 0 && input <= 9)
			{
				numbers[input]++;//ʹ�ö�Ӧ�±�����鵥Ԫ�����һ�����ֵĳ��ִ�����numbers[1]ָ1���ֵĴ���
			}
			input = in.nextInt();
		}
		for(int i = 0; i < numbers.length; i++)//�������������ֱ����������.length
		{
			System.out.println("The amount of "+i+" is "+numbers[i]);
		}
	}
}
