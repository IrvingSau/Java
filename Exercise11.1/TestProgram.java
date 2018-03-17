import java.util.Scanner;

public class TestProgram {

	private static boolean IsFill(double side1, double side2, double side3) {
		// TODO Auto-generated method stub
		if(side1 > side3)
			return true;
		else if(side2 > side3)
			return true;
		else if(side1 + side2 > 3)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the three sides of triangle: ");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		
		boolean fill = IsFill(side1, side2, side3);
		
		System.out.println("Please input the color: ");
		String color = in.next();
		
		if(!fill) {
			System.out.println("The triangle is not filled");
		}else {
			Triangle demo = new Triangle(side1, side2, side3, color, fill);
			System.out.print(demo.toString());
		}
	}
}
