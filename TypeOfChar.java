
public class TypeOfChar {
	public static void main(String[] args)
	{
		char a = 'a';
		char b = '��';
		char c = '\u0041';
		// ��б��+u��ʾ��Unicode���룬0041��ʮ���������֣���Ӧ65����A
		System.out.println((int)a);
		System.out.println(b);
		System.out.println((int)b);//����ת����ʹ��b��charת���int
		System.out.println(c);
		//��Сдת��
		char d = 'a';
		char e = (char)(d+'A'-'a');
		System.out.println(e);
		if(Character.isLowerCase(d))
			System.out.println(Character.toUpperCase(d));//Java�п���ֱ��ʹ�ð��������жϲ���ת����Сд
		//�������ͺͻ�������
		int f = 10;
		Integer g;
		g = f;
		System.out.println(g);//���ֵΪ10
		System.out.println(Integer.MAX_VALUE);//2��31�η���һ��integer�����ֵ
	}
}

/*
 * Javaʹ��Unicode���룬֧�ֺ���
 * ��Сдת������Ҫ��d+'A'-'a'ʽ��ǰ����char������ת������Ϊʽ����������int
 * ʽ���������ת��Ϊ��д����Ϊ ��д-Сд ������Ϊ Сд-��д
 * aΪ97, A Ϊ65
 * Java���а������ͺͻ������ͣ�����������Integer, Character�ȣ���Ӧ��������Ϊint��char��
 * Java���ڴ���Ϊ4���ֽڣ�Byte����32��bit��
 * */

 