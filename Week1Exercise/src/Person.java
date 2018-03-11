
public class Person {
	
	private String gender;
	
	
	//函数重载，父类的构造函数可以有多个，以匹配不同子类的需求
	//有的子类 不需要 用到gender的成员变量，则子类中的构造函数将不存在gender参数，他们的super()函数中为空，则将匹配到第二个构造函数
	//有的子类 需要 用到gender的成员变量，则子类中的构造函数将会通过super(gender)将gender参数传递进入父类中所匹配的构造函数中（第一个构造函数）
	
	//构造函数1
	public Person(String gender) {
		this.gender = gender;
	}
	
	//构造函数2
	public Person() {
		
	}
	
	public void print() {
		System.out.println("No print methods in sub-class");
	}
	
}
