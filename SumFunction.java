/*
 * Date: 2018/2/14
 * Author: IrvingSau
 * Purpose: Sum two variables
 */

import java.util.Scanner;

public class SumFunction {
	public static int sum(int a, int b)//����ͷ
	{
		//������
		int i, result = 0;
		for(i = a; i <= b; i++)
		{
			result = result+i;
		}
		return result;
	}
	

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int result = 0;
		int a, b;
		a = in.nextInt();
		b = in.nextInt();
		result = sum(a, b);
		System.out.println("The sum is: "+result);
	}
}

/*
 * ����ʱ��Step into���뺯���еĴ������
 * ��ͬ��������ת��ʱ��խ�Ŀ���ת��Ϊ�������
 * ���磺char����ת��Ϊint��int����ת��Ϊfloat/double
 * ��float�����ת��Ϊint����ͨ��ǿ������ת��
 * ��ȣ�float/double > int > char
 * ������ÿһ�ε��ö���create�µĶ����ı����ռ䣬��������ռ��֮ǰÿһ���ǲ���ͬ�ģ���֮Ϊ���ر���
 * �����ͺ����ж���ı��������ڱ��ر���
 * ���ر����в��ɳ����ظ�
 * �磺
 public static void f(int i)
{
    for ( int i=10; i-->0; i-- )//�˴������ͱ��ر���i�ظ���
        System.out.println(i);
}
 */
 