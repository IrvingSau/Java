
public class StringOperation {
	public static void main(String[] args)
	{
		//比较字符串大小
		String a = new String("Hello UIC CST");
		String b = new String("abd");
		String c = new String("abc");
		System.out.println(c.compareTo(b));//如果大于，输出1；等于0；小于-1；此处应该为-1，c小于d；
		
		//获得字符串长度
		System.out.println(a.length());//和数组长度不同，这里为length()
		
		//访问字符串中的字符
		System.out.println(a.charAt(0));//第零个字符，a
		
		//遍历字符串，不可用for-each循环
		for(int i = 0; i< a.length(); i++)
			System.out.print(a.charAt(i));
		
		//得到子字符串
		System.out.println("得到子字符串： ");
		System.out.println(a.substring(5));//从第五个空格字符开始到最后一个字符结束的子字符串： UIC CST
		System.out.println(a.substring(6, 9));//从第六个U开始到第九个空格字符结束的字符串（不包括最后一个空格字符）：UIC
		
		//在字符串中寻找字符
		System.out.println(a.indexOf("U"));//输出6，表示U在第六个字符
		System.out.println(a.indexOf("A"));//输出-1，表示A不存在
		
		//在字符串中寻址相同字符
		int loc;//引入一个变量loc作为存储第一个C的位置
		loc = a.indexOf('C');
		System.out.println(a.indexOf('C'));
		System.out.println(a.indexOf('C', loc+1));//此处应该+1，否则indexOf从第一个C的位置开始寻找C，找到的仍然是第一个C的位置
	}
}


/*
 * Java中switch-case中可以使用字符串作为case
 * */
