
public class StringOperation {
	public static void main(String[] args)
	{
		//�Ƚ��ַ�����С
		String a = new String("Hello UIC CST");
		String b = new String("abd");
		String c = new String("abc");
		System.out.println(c.compareTo(b));//������ڣ����1������0��С��-1���˴�Ӧ��Ϊ-1��cС��d��
		
		//����ַ�������
		System.out.println(a.length());//�����鳤�Ȳ�ͬ������Ϊlength()
		
		//�����ַ����е��ַ�
		System.out.println(a.charAt(0));//������ַ���a
		
		//�����ַ�����������for-eachѭ��
		for(int i = 0; i< a.length(); i++)
			System.out.print(a.charAt(i));
		
		//�õ����ַ���
		System.out.println("�õ����ַ����� ");
		System.out.println(a.substring(5));//�ӵ�����ո��ַ���ʼ�����һ���ַ����������ַ����� UIC CST
		System.out.println(a.substring(6, 9));//�ӵ�����U��ʼ���ھŸ��ո��ַ��������ַ��������������һ���ո��ַ�����UIC
		
		//���ַ�����Ѱ���ַ�
		System.out.println(a.indexOf("U"));//���6����ʾU�ڵ������ַ�
		System.out.println(a.indexOf("A"));//���-1����ʾA������
		
		//���ַ�����Ѱַ��ͬ�ַ�
		int loc;//����һ������loc��Ϊ�洢��һ��C��λ��
		loc = a.indexOf('C');
		System.out.println(a.indexOf('C'));
		System.out.println(a.indexOf('C', loc+1));//�˴�Ӧ��+1������indexOf�ӵ�һ��C��λ�ÿ�ʼѰ��C���ҵ�����Ȼ�ǵ�һ��C��λ��
	}
}


/*
 * Java��switch-case�п���ʹ���ַ�����Ϊcase
 * */
