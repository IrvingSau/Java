import java.util.Scanner;

public class CompareFloat {
	public static void main(String[] args) {
		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(a==b);//ֱ�ӱȽ�����double��������С
		System.out.println(Math.abs(a-b) < 1e-6);//����a-b�ľ���ֵ�Ƿ����1��10��-6�η�
	}
}

/* ���ڸ�����������ȷ��ֱ�ӱȽ������������Ƿ���ȿ������쳣
 * ������Math.abs()���������������Ĳ�ľ���ֵ���ٺ�1e-6����һ����С���������Ƚ�
 * ���С��1e-6����˵���������������
 */
 