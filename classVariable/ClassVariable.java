package classVariable;

public class ClassVariable {
	
	//成员变量
	int a;
	int b;
	
	//成员变量，不属于任何一个对象，只属于类
	static int c;
	//static 声明类变量
	
	ClassVariable()
	{
		a = 10;
		b = 20;
	}
	
	void Cstep()
	{
		c++;
	}
	
	int getC()
	{
		return c;
	}
	
	int getA()
	{
		return a;
	}

	public static void f()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//类函数和类变量在这个类装载的时候就已经初始化了，与对象是否构建无关
		System.out.println(c);
		
		ClassVariable cv1 = new ClassVariable();
		ClassVariable cv2 = new ClassVariable();
		
		//输出A=10和C=0
		System.out.println(cv1.getA());
		System.out.println(cv1.getC());
		
		//输出cv1的C=1；cv2的C=2
		cv1.Cstep();
		System.out.println(cv1.getC());
		System.out.println(cv2.getC());
		
		//类变量可以在同类文件中直接修改值的大小，并且对每一个对象都有影响（直接受 类 的管理）
		ClassVariable.c = 20;
		
		//输出二者均为20
		System.out.println(cv1.getC());
		System.out.println(cv2.getC());
		
		//static函数中可以调用其他的static函数，因为大家同处一个类，这两个函数是属于同一个类的，而不是属于任何其他的对象
		f();
	}

}
