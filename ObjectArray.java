import java.util.Scanner;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Create two arrays, one for int, one for string
		int[] Aint = new int[20];
		String[] Astring = new String[20];
		
		//Output the two array
		System.out.println(Aint[0]);
		System.out.println(Astring[0]);
		
		//////////////////////////////////
		//��int�����Ļ������鵱����������õ���ʼ����0
		//��Sting����������õ�null����ζ�����Ԫ�ز�����
		//ԭ������String[]������ŵ���ָ��ÿһ���ַ�����ָ��
		//////////////////////////////////
		
		String[] Bstring = new String[10];
		
		for(int i = 0; i < Bstring.length; i++) {
			Bstring[i] = ""+i;	//Ϊ������������ÿһ��Ԫ�ظ�ֵi
		}
		
		//////////////////////////////////
		//�ڴ˴���intΪ�������ͣ�StringΪ��������
		//ÿһ��  ��������  ������ŵĶ��������ݱ�������ָ���Ǹ����ݵĵ�ַ��ָ�룩
		//������һ��˵�����ڶ�����뱻new����������ʵ�����ݣ����Զ��ڶ���������˵������Ϊ�������ֵ��������������������
	}

}
