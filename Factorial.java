/*
 * Date： 2018/2/11
 * Author: IrvingSau
 * Purpose: Calculate the factorial
 */

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("please input a number: ");
		int input = in.nextInt(), result = 1;
		
		for(int i = 1; i <= input; i++)
		{
			result = result * i;
		}
		
		System.out.print(result);
	}
}


/*
 * 循环次数：for从0开始小于n，刚好n次
 * a*=b+6 --> a = a*(b+6)， 默认a*=后有括号
 */
