/*
 * Date: 2018/2/18
 * Author: IrvingSau
 * Purpose: Calculate the amount of rabbit
 * Condi.:initialize 2 rabbits and every 3 month the two rabbits will give birth to 2 new rabbits
 * */

import java.util.Scanner;

public class rabbit {

	int amount;
	
	rabbit(){
		this.amount = 2;
	}
	
	void increase() {
		amount = amount*2;
	}
	
	int getValue() {
		return amount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthLimit;
		int month = 3;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the month you want to search: ");
		monthLimit = in.nextInt();
		rabbit rabbit = new rabbit();
		do {
			rabbit.increase();
			month += 3;
		}while(month <= monthLimit);
		System.out.println(rabbit.getValue());
	}

}
