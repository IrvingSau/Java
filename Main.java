
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.print();
		
		b.print();
		
		in.close();
	}
}

class Fraction{
	
	int numerator;
	int denominator;
	double resultOfDouble;
	
	Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	double toDouble()
	{
		resultOfDouble = numerator * 1.0 / denominator;
		return resultOfDouble;
	}
	
	Fraction plus(Fraction r)
	{
		int i = 2;
		
		//构建一个新的Fraction类对象result
		Fraction result = new Fraction(numerator, denominator);
	
		//分数相加
		if(this.denominator == r.denominator)
		{
			result.denominator = r.denominator;
			result.numerator = r.numerator + this.numerator;
		}else
		{
			do {
				this.denominator = this.denominator * i;
				r.denominator = r.denominator * i;
			}while(r.denominator != this.denominator);
			result.denominator = r.denominator;
			result.numerator = r.numerator*i + this.numerator;
		}
		
		//化简分数
		int temp;
		int a = result.numerator;
		int b = result.denominator;
		while(b !=0)//辗转相除法求最大公约数
		{
			temp = a % b;
			a = b;
			b = temp;
		}
		result.numerator = result.numerator / a;
		result.denominator = result.denominator / a;
		
		return result;
	}
	
	
	
	void print()
	{
		if(numerator == denominator)
			System.out.println("1");
		else if(numerator != denominator)
			System.out.println(numerator+"/"+denominator);
	}
}