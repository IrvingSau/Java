/*
 * Date: 2018/2/18
 * Author: IrvingSau
 * Purpose: Sort the array as extend sort
 */

import java.util.Scanner;

public class BubbleSort {

	public static void sort(int a[]) {
		int flag, next, temp;
		for(flag = 0; flag < a.length; flag++)
		{
			for(next = flag + 1; next < a.length; next++)
			{
				if(a[flag] > a[next])
				{
					temp = a[next];
					a[next] = a[flag];
					a[flag] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[4];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = in.nextInt();
		}
		sort(a);
		
		for(int k : a) {//for each loop; 对每一个k，我们让k = a[i]；
			System.out.println(k);
		}	
		in.close();
	}
}
