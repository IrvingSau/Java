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
		OUT://Label��Ϊ���ŵ�tenѭ������������ֱ��������һѭ����
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
 * Java�п��Զ�ѭ�����б��ǣ�label�������ҿ���ֱ����break Label�������ѭ�����ڶ���ѭ���зǳ����á�
 */
 