import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mark;
		System.out.println("Please input the mark: ");
		
		mark = in.nextInt();
		// make decision here
		if(mark >= 50)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		//Always print DONE
		System.out.println("DONE");
	}

}
