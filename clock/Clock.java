/*
 * Date: 2018/2/17
 * Author: IrvingSau
 * Purpose: Create a Class Clock and run all program
 * */

package clock;

import display.Display;

public class Clock {

	//Clock这个类中的每一个对象都有两个Display类的对象，分别是hour对象和minute对象
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void start()
	{
		while(true)
		{
			minute.increase();
			if(minute.getValue() == 0)//控制hour和minute交互，若想让两个平行的类（Display）的对象(hour和minute)交互，需要通过更高级的类(Clock)控制
			{
				hour.increase();//increase是public属性，所以在Clock类中可以使用Display类中的函数increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());//格式化输出
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();//新建一个Clock类对象clock
		clock.start();
	}

}
