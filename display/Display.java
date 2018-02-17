/*
 * Date: 2018/2/17
 * Author: IrvingSau
 * Purpose: Create a Class Display
 * */

package display;

public class Display {
	//��private�Գ�Ա�������з�װ�����������Ա�����������˽�еģ�ֻ���ڳ�Ա�����п��Է���
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit)//���캯������ʼ��ʱ������limit
	{
		this.limit = limit;
	}
	
	public void increase()//û��publicʱֻ����һ�������ڲ����Է��ʣ������Ϊ�������򲻿ɷ���
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
