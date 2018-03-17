
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	private String color;
	private boolean filled;
	
	//Constructor
	Triangle(double side1, double side2, double side3, String color, boolean filled){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}
	
	//Getter and setter for side1, side2, side3
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//Member functions of class Triangle
	public double getArea(double side1, double side2, double side3) {
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	public double getPerimeter(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	//Overrride the toString() method from superclass - object
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The area is "+getArea(side1, side1, side1)+" and the perimeter is "+getPerimeter(side1, side1, side1)+" and the color is "+color;
	}

}
