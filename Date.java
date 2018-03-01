/*
 * Date: 2018/3/1
 * Purpose: review of Java
 * Author: TuringSau
 * */

public class Date {

	private Display year = new Display(0, 2000);
	private Display month = new Display(1, 12);
	private Display day = new Display(1, 30);
	
	//实现三个display类的对象year, month, day交互
	public void start() {
		while(true) {
			day.Increase();
			if(day.getValue() == 1) {
				month.Increase();
			}
			if(month.getValue() == 1) {
				year.Increase();
			}
			String str = new String();
			str = String.format("%04d-%02d-%02d ", year.getValue(), month.getValue(), day.getValue());
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date DateDisplay = new Date();
		DateDisplay.start();
		
	}

}
