/*
 * Date: 2018/2/19
 * Author: IrvingSau
 * Purpose: Calculate the absolute amount of element in array(except -1)
 */

import java.util.Scanner;

public class CalculateTheAbsoluteAmountOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
			int amount = 0, i = 0;
		
			int[] a = new int[10];
			
			for(int j = 0; j < a.length; j++)
			{
				a[j] = in.nextInt();
				if(a[j] == -1)
					break;
			}	
			
			while(a[i] != -1) {
				i++;
				amount++;
			}
			System.out.println(amount);
	}

}
