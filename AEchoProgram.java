/* Date: 2018/2/8
 * Purpose: Echo the input
 */


import java.util.Scanner;

public class AEchoProgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Echo: " + in.nextLine());
		//in.nextLine()��ʾ��ȡһ���У���֮�����in.nextInt()
		int num1;
		final int num2;//��������ǰ����final��ʾ������һ�����������ڲ�����������
		System.out.println("Please input the first number:");
		num1 = in.nextInt();
		System.out.println("Please input the second number:");
		num2 = in.nextInt();
		System.out.println("The result is: ");
		System.out.println(num1 + " + " + num2 +" = "+ (num1+num2) );
	}
}
