/*
 * Date: 2018/2/12
 * Author: IrvingSau
 * Purpose: copy arrayA to B and compare if they are equal
 */

public class CopyAndCompareArray {
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4 , 5};
		int[] b = new int[a.length];//����һ����С��a��ȫ��ͬ������
		int i;
		
		//����a��b
		for(i = 0; i < a.length; i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		
		//�Ƚ�a��b
		boolean isEqu = true;
		for(int j = 0; j < a.length; j++)
		{
			if(b[j] != a[j])
			{
				isEqu = false;
				break;
			}
		}
		System.out.print(isEqu);
	}	
}

/*
 * ����ı�����ָ�룬���ܹ��򵥵ؽ�a = b������������bָ��a��λ�ã���a��b�����Ŷ���һλ������Ĳ���Ȩ��
 */
