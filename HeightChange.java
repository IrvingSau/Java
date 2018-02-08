/* Date: 2018/2/8
 * Purpose: change height from foot to meter
 */

import java.util.Scanner;

public class HeightChange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float inche;
		double meter;
		int foot;
		foot = in.nextInt();
		inche = in.nextFloat();
		meter = (foot + inche/12) * 0.3048;
		System.out.println(meter);
	}
	
}

/*
 * double可保留16位小数，float只有8位；
 */