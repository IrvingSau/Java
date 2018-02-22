/*
 * Date:2018/2/22
 * Author: IrvingSau
 * Purpose: Test the difference between class function and object function
 */

public class ClassFunction {
	
	static void classFunction() {
		//static声明这个函数是一个类函数，这个函数不属于并且不应用于对象中，而是在类中运行
		System.out.println("This is a class function");
	}
	
	public void objectFunction() {
		//没有static声明表示这个函数是属于对象的
		System.out.println("This function belongs to obeject");
	}
	
	public static void main(String[] args)
	{
		//类函数的调用可以直接调用
		classFunction();
		
		//对象中成员函数的调用需要先声明一个新的对象
		ClassFunction test = new ClassFunction();
		test.objectFunction();
		
	}
}
