package NumberClock;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock numberclock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

		numberclock.start();

		System.out.println(numberclock);

		in.close();
	}

}
