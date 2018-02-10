/* Date: 2018/2/10
 * Author: IrvingSau
 * Purpose: build a ticket system
 */

import java.util.Scanner;

public class TicketSystem {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int amount, balance = 0, flag = 0;
		while(true)
		{
			System.out.println("Please pay for your ticket:");
			amount = in.nextInt();
			balance = amount + balance;
			if(balance >= 10)//10 as the price, you can change it to be a variable
			{
				System.out.println("*******************");	
				System.out.println("*  Money: 10RMB   *");	
				System.out.println("* Dest: Guangzhou *");	
				System.out.println("*******************");	
				System.out.println("Change:"+ (balance-10));
				flag = 1;//when the ticket is bought, flag becomes one
			}
			if(flag == 1)//reset the system
			{
				balance = 0;
				amount = 0;
				flag = 0;
			}
		}
	}
}
