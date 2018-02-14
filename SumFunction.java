/*
 * Date: 2018/2/14
 * Author: IrvingSau
 * Purpose: Sum two variables
 */

import java.util.Scanner;

public class SumFunction {
	public static int sum(int a, int b)//函数头
	{
		//函数体
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
 * 调试时用Step into进入函数中的代码语句
 * 不同数据类型转换时，窄的可以转换为宽的类型
 * 例如：char可以转换为int，int可以转换为float/double
 * 但float如果想转换为int必须通过强制类型转换
 * 宽度：float/double > int > char
 * 函数的每一次调用都会create新的独立的变量空间，而且这个空间和之前每一次是不相同的，称之为本地变量
 * 参数和函数中定义的变量都属于本地变量
 * 本地变量中不可出现重复
 * 如：
 public static void f(int i)
{
    for ( int i=10; i-->0; i-- )//此处参数和本地变量i重复了
        System.out.println(i);
}
 */
 