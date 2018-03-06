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
		//在int这样的基础数组当中我们输出得到初始化的0
		//在Sting中我们输出得到null，意味着这个元素不存在
		//原因是在String[]中所存放的是指向每一个字符串的指针
		//////////////////////////////////
		
		String[] Bstring = new String[10];
		
		for(int i = 0; i < Bstring.length; i++) {
			Bstring[i] = ""+i;	//为这个对象数组的每一个元素赋值i
		}
		
		//////////////////////////////////
		//在此处，int为基础类型，String为对象类型
		//每一个  对象数组  中所存放的都不是内容本身，而是指向那个内容的地址（指针）
		//再往深一点说，由于对象必须被new出来才能有实际内容，所以对于对象数组来说，必须为这个对象赋值，这个对象数组才有意义
	}

}
