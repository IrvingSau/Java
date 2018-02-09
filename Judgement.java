import java.util.Scanner;

public class Judgement {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int amount;
		amount = in.nextInt();
		//System.out.println(10>1);
		if(amount>10)
		{
			System.out.println("yes");
		}
		System.out.println("no");
	}
}


/*
 * Java中输出和输入与C不同
 * 输出：System.out.println("");
 * 输入：先在类外添加import java.util.Scanner;
 * 		随后在方法中加入Scanner in = new Scanner(System.in);
 * 		再在方法中需要输入的地方添加in.nextInt()/in.nextFloat()
 */
