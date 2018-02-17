package NumberClock;

public class Clock {
	
	//Clock类中有三个Display类型的成员变量，分别是hour，minute和second
	private Display hour;
	private Display minute;
	private Display second;
	
	//构造函数，初始化三个Display类型的成员变量
	public Clock(int int1, int int2, int int3)
	{
		this.hour = new Display(24, int1);//hour.limit = 24，hour.value = int1
		this.minute = new Display(60, int2);
		this.second = new Display(60, int3);
	}
	
	public void start()
	{
		/*while(true)//若想不间断输出时间，可以将此处设置为死循环并且加入输出语句
		{*/
			second.tick();
			if(second.getValue() == 0)
			{
				minute.tick();
				if(minute.getValue() == 0)
				{
					hour.tick();
				}
			}
		}
	
	//使用String.format将输出格式化并且String化
	public String toString()
	{
		String a = new String();
		a = String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
