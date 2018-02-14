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
		//产生a的绝对值
		System.out.println(Math.abs(a));
		//对b四舍五入
		double b = 5.2;
		System.out.println(Math.round(b));
		//产生一个随机数位于0-100之间
		result = (int)(Math.random() * 100);
		System.out.println(result);
		//求幂的数值
		System.out.println(Math.pow(Math.abs(a), Math.round(b)));//（a的绝对值）的（b的四舍五入）次方
		//Math.pow(x, y) == x的y次方
	}
}
