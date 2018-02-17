package NumberClock;

public class Display {
	
	//Display������������Ա����value��limit
	public int value;
	public int limit;
	
	//���캯������ʼ��limit��value
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
