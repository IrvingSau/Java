/*
 * Date: 2018/2/14
 * Author: IrvingSau
 * Purpose: Test the Math function
 */

import java.util.Scanner;

public class MathTest {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a, result;
		a = in.nextInt();
		//����a�ľ���ֵ
		System.out.println(Math.abs(a));
		//��b��������
		double b = 5.2;
		System.out.println(Math.round(b));
		//����һ�������λ��0-100֮��
		result = (int)(Math.random() * 100);
		System.out.println(result);
		//���ݵ���ֵ
		System.out.println(Math.pow(Math.abs(a), Math.round(b)));//��a�ľ���ֵ���ģ�b���������룩�η�
		//Math.pow(x, y) == x��y�η�
	}
}
