/*
 * Date: 2018/2/12
 * Author: IrvingSau
 * Purpose: copy arrayA to B and compare if they are equal
 */

public class CopyAndCompareArray {
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4 , 5};
		int[] b = new int[a.length];//创建一个大小和a完全相同的数组
		int i;
		
		//拷贝a到b
		for(i = 0; i < a.length; i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
		
		//比较a和b
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
 * 数组的本质是指针，不能够简单地将a = b，这样代表着b指向a的位置，即a和b都有着对这一位置数组的操作权限
 */
