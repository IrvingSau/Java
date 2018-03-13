import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//new a String type variable
		String word = new String();
		
		System.out.println("Please input a sentence");
		
		//in.nextLine() function we can input a whole line instead of what in.next() do ---- a word without space
		word = in.nextLine();
		
		if(word.charAt(0) == word.charAt(word.length()-1)) {//We use charAt() function to get the first and last char
			System.out.println("Palindrome");
		}else
			System.out.println("Not a Palindrome"); 
	}

}
