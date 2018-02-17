package NumberClock;

public class Display {
	
	//Display类中有两个成员变量value和limit
	public int value;
	public int limit;
	
	//构造函数，初始化limit和value
	public Display(int limit, int value)
	{
		this.limit = limit;
		this.value = value;
	}
	
	public void tick()
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
	}

}
