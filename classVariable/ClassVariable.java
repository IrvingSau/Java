package classVariable;

public class ClassVariable {
	
	//��Ա����
	int a;
	int b;
	
	//��Ա�������������κ�һ������ֻ������
	static int c;
	//static ���������
	
	ClassVariable()
	{
		a = 10;
		b = 20;
	}
	
	void Cstep()
	{
		c++;
	}
	
	int getC()
	{
		return c;
	}
	
	int getA()
	{
		return a;
	}

	public static void f()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ຯ����������������װ�ص�ʱ����Ѿ���ʼ���ˣ�������Ƿ񹹽��޹�
		System.out.println(c);
		
		ClassVariable cv1 = new ClassVariable();
		ClassVariable cv2 = new ClassVariable();
		
		//���A=10��C=0
		System.out.println(cv1.getA());
		System.out.println(cv1.getC());
		
		//���cv1��C=1��cv2��C=2
		cv1.Cstep();
		System.out.println(cv1.getC());
		System.out.println(cv2.getC());
		
		//�����������ͬ���ļ���ֱ���޸�ֵ�Ĵ�С�����Ҷ�ÿһ��������Ӱ�죨ֱ���� �� �Ĺ���
		ClassVariable.c = 20;
		
		//������߾�Ϊ20
		System.out.println(cv1.getC());
		System.out.println(cv2.getC());
		
		//static�����п��Ե���������static��������Ϊ���ͬ��һ���࣬����������������ͬһ����ģ������������κ������Ķ���
		f();
	}

}
