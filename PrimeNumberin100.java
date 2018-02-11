/*
 * Date: 2018/2/11
 * Author: IrvingSau
 * Purpose: Print out the prime number in 100
 */


public class PrimeNumberin100 {
	public static void main(String[] args)
	{
		int i, j;
		boolean flag = true;
		for(i = 1; i < 100; i++)
		{
			for(j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					flag = false;
				}
			}
			if(flag == true)
			{
				System.out.println(i);
			}
			else if(flag == false)
				flag = true;
		}
	}
}

/*
 * 表示状态可以用布尔值
 * 类型：boolean
 * 值：true/false
 */
