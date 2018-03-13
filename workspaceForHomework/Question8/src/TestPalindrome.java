import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word = new String();
		
		word = in.next();
		
		if(word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("Palindrome");
		} 
	}

}
