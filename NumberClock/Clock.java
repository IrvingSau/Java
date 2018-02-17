package NumberClock;

public class Clock {
	
	//Clock����������Display���͵ĳ�Ա�������ֱ���hour��minute��second
	private Display hour;
	private Display minute;
	private Display second;
	
	//���캯������ʼ������Display���͵ĳ�Ա����
	public Clock(int int1, int int2, int int3)
	{
		this.hour = new Display(24, int1);//hour.limit = 24��hour.value = int1
		this.minute = new Display(60, int2);
		this.second = new Display(60, int3);
	}
	
	public void start()
	{
		/*while(true)//���벻������ʱ�䣬���Խ��˴�����Ϊ��ѭ�����Ҽ���������
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
	
	//ʹ��String.format�������ʽ������String��
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
