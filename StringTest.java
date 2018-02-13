import java.util.Scanner;

public class StringTest {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s = new String("Hello");
		//输出字符串
		System.out.println(s+" world");//字符串间可以直接连接 
		System.out.println(s+12+24);//输出Hello1224，java自动将int的12转变为string后与string的s相加，并且对24作同样操作
		//输入字符串
		String word = new String();
		String sentence = new String();
		word = in.next();//读取一个单词，遇到空格作为结束
		sentence = in.nextLine();//读取一整行，包括空格也读取
		System.out.println(word);
		System.out.println(sentence);
		//比较字符串
		System.out.println(s == "Hello");//字符串名实际是一个指针，直接等于是在比较 地址 是否相同，很明显false
		System.out.println(s.equals("Hello"));//用equals比较 内容 是否相等
	}
}
