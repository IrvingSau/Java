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
			if(input % i == 0)//��2��ʼ���ε�����������ֵ���Ա�����ʱ��˵���г���1��������֣����������Ҫ�ų�1������ֵ����
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
 * breakֱ������ѭ���� continue������һ�����ʣ����䣬����ѭ������һ����
 */