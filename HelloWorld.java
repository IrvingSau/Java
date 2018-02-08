/* Date: 2018/2/8
 * Purpose: Echo the input
 */

import java.util.Scanner;

public class HelloWorld {//class后的HelloWorld为一个类
	
	public static void main(String[] args) {//一个自定义的方法
		System.out.println("Hello world!");//调用了一个已规定的方法
		Scanner in = new Scanner(System.in);
		System.out.println("echo:" + in.nextLine());
	}
	
}

//Java基本特征
/*Java的代码主要位于类（class）中，类是通过class关键字定义的
 *程序的文件名必须和类名完全相同（HelloWorld）
 *public static void main(String[] args)是一个方法，类似于函数，main是方法名
 *System.out.println("Hello 天码营！");是一个方法的调用，这行代码向控制台输出了Hello 天码营！
 *注意System.out.print()和System.out.println()区别，后者会在最后增加一个换行符号
 */

//标识符
/*Java中各个部分（类名，变量名，方法名，方法参数名）都是标识符
 *HelloWorld（类名） 和main（方法名）都是标识符
 *标识符可以用字母，$，_ ，数字四种元素，数字不可出现在开头
 */
 
//注释：
//方向+shift高亮代码，control + / 便捷注释

