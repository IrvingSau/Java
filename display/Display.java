/*
 * Date: 2018/2/17
 * Author: IrvingSau
 * Purpose: Create a Class Display
 * */

package display;

public class Display {
	//用private对成员变量进行封装，表明这个成员变量是这个类私有的，只有在成员函数中可以访问
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit)//构造函数，初始化时间限制limit
	{
		this.limit = limit;
	}
	
	public void increase()//没有public时只有在一个包的内部可以访问，如果分为两个包则不可访问
	{
		value++;
		if(value == limit)
		{
			value = 0;
		}
	}
	
	public int getValue()
	{
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display demo = new Display(60);
		for(;;)
		{
			demo.increase();
			System.out.println(demo.getValue());
		}
	}

}
