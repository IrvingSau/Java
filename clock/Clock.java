/*
 * Date: 2018/2/17
 * Author: IrvingSau
 * Purpose: Create a Class Clock and run all program
 * */

package clock;

import display.Display;

public class Clock {

	//Clock������е�ÿһ������������Display��Ķ��󣬷ֱ���hour�����minute����
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void start()
	{
		while(true)
		{
			minute.increase();
			if(minute.getValue() == 0)//����hour��minute����������������ƽ�е��ࣨDisplay���Ķ���(hour��minute)��������Ҫͨ�����߼�����(Clock)����
			{
				hour.increase();//increase��public���ԣ�������Clock���п���ʹ��Display���еĺ���increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());//��ʽ�����
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();//�½�һ��Clock�����clock
		clock.start();
	}

}
