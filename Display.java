/*
 * Date: 2018/3/1
 * Purpose: review of Java
 * Author: TuringSau
 * */

public class Display {
	
	private int number;
	private int limit;
	
	//构造函数
	public Display(int number, int limit){
		this.number = number;
		this.limit = limit;
	}
	
	//实现增加功能
	public void Increase() {
		number++;
		if(number == limit) {
			number = 1;
		}
	}
	
	public int getValue() {
		return number;
	}
	
	public int getLimit()
	{
		return limit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display test = new Display(3, 10);
		for(;;) {
			test.Increase();
			System.out.println(test.getValue());
		}
	}

}
