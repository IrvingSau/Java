/*
 * Date:2018/2/22
 * Author: IrvingSau
 * Purpose: Test the difference between class function and object function
 */

public class ClassFunction {
	
	static void classFunction() {
		//static�������������һ���ຯ����������������ڲ��Ҳ�Ӧ���ڶ����У���������������
		System.out.println("This is a class function");
	}
	
	public void objectFunction() {
		//û��static������ʾ������������ڶ����
		System.out.println("This function belongs to obeject");
	}
	
	public static void main(String[] args)
	{
		//�ຯ���ĵ��ÿ���ֱ�ӵ���
		classFunction();
		
		//�����г�Ա�����ĵ�����Ҫ������һ���µĶ���
		ClassFunction test = new ClassFunction();
		test.objectFunction();
		
	}
}
