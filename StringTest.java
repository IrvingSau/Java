import java.util.Scanner;

public class StringTest {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s = new String("Hello");
		//����ַ���
		System.out.println(s+" world");//�ַ��������ֱ������ 
		System.out.println(s+12+24);//���Hello1224��java�Զ���int��12ת��Ϊstring����string��s��ӣ����Ҷ�24��ͬ������
		//�����ַ���
		String word = new String();
		String sentence = new String();
		word = in.next();//��ȡһ�����ʣ������ո���Ϊ����
		sentence = in.nextLine();//��ȡһ���У������ո�Ҳ��ȡ
		System.out.println(word);
		System.out.println(sentence);
		//�Ƚ��ַ���
		System.out.println(s == "Hello");//�ַ�����ʵ����һ��ָ�룬ֱ�ӵ������ڱȽ� ��ַ �Ƿ���ͬ��������false
		System.out.println(s.equals("Hello"));//��equals�Ƚ� ���� �Ƿ����
	}
}
