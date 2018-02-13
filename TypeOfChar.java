
public class TypeOfChar {
	public static void main(String[] args)
	{
		char a = 'a';
		char b = '汉';
		char c = '\u0041';
		// 反斜杠+u表示用Unicode编码，0041是十六进制数字，对应65，即A
		System.out.println((int)a);
		System.out.println(b);
		System.out.println((int)b);//类型转换，使得b从char转变成int
		System.out.println(c);
		//大小写转换
		char d = 'a';
		char e = (char)(d+'A'-'a');
		System.out.println(e);
		if(Character.isLowerCase(d))
			System.out.println(Character.toUpperCase(d));//Java中可以直接使用包裹类型判断并且转换大小写
		//包裹类型和基础类型
		int f = 10;
		Integer g;
		g = f;
		System.out.println(g);//输出值为10
		System.out.println(Integer.MAX_VALUE);//2的31次方减一，integer的最大值
	}
}

/*
 * Java使用Unicode编码，支持汉字
 * 大小写转换中需要在d+'A'-'a'式子前加上char的类型转换，因为式子运算结果是int
 * 式子中如果想转换为大写，则为 大写-小写 ，否则为 小写-大写
 * a为97, A 为65
 * Java中有包裹类型和基础类型，包裹类型是Integer, Character等，对应基础类型为int和char；
 * Java在内存中为4个字节（Byte），32个bit；
 * */

 