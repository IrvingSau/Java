import java.util.Scanner;

public class CompareFloat {
	public static void main(String[] args) {
		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(a==b);//直接比较两个double浮点数大小
		System.out.println(Math.abs(a-b) < 1e-6);//计算a-b的绝对值是否大于1×10的-6次方
	}
}

/* 由于浮点数并不精确，直接比较两个浮点数是否相等可能有异常
 * 可以用Math.abs()计算两个浮点数的差的绝对值，再和1e-6这样一个很小的数字做比较
 * 如果小于1e-6，则说明两个浮点数相等
 */
 