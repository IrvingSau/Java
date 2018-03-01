import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the start integer: ");
		int start = in.nextInt();
		
		System.out.println("Enter the end integer: ");
		int end = in.nextInt();
		
		do {
			System.out.println(start);
			start+=1;
		}while(start <= end);
	}

}
