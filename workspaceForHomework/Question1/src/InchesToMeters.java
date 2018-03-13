import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//use double to store data
		double inche, meter;
		
		//As the example, there is no line feed, so we use print() instead of println()
		System.out.print("Input a value for inches:");
		inche = in.nextDouble();
		
		//change inche to meter
		meter = inche * 0.0254;
		
		//use printf()to normalize output, or we can use println() as comment
		System.out.printf("%.1f inches is %.1f meters.\n", inche, meter);
		
		//System.out.println(inche+ " inches is"+ meter +"meters\n" );
	}
	

}
