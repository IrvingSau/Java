/*
 * Date: 2018/2/12
 * Author: IrvingSau
 * Purpose: Try the each-for loop
 * */

public class ForEachLoop {
	public static void main(String[] args)
	{
		int[] data = {1, 2, 3, 4, 5};

		for(int k : data)
		{
			System.out.println(k);
		}
	}
}

/*
 * 对于每一轮循环，k = data中每一个元素
 * 例如第一轮中，k = data[0]，第二轮中， k = data[1];
 * 可用于遍历数组的场合（输出等）。
 * */
 