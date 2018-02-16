/*
 * Date: 2018/2/16
 * Author: IrvingSau
 * Purpose: test overloading function*/


public class FunctionOverloading {
	int a = 10;
	int b;
	int c;
	
	FunctionOverloading()
	{
		c = 20;//初始化c为20
	}
	
	FunctionOverloading(int i)
	{
		this.b = i;//将b重置为90
	}
	
	void output()
	{
		System.out.println(" a=" +a+ " b=" +b+ " c=" +c);
	}
	
	public static void main(String[] args)
	{
		FunctionOverloading fo1 = new FunctionOverloading();//a = 10; b = 0; c = 20
		fo1.output();
		FunctionOverloading fo2 = new FunctionOverloading(90);//a = 10; b = 90; c = 0;
		fo2.output();
	}
}
