
public class ObjectArrayAndForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//使用int这一基础数据就类型创建一个数组a
		int[] a = new int[5];
		
		//使用我们新建的Value类构建一个对象数组array
		Value[] array = new Value[5];
		
		//此时我们构建的array并不是基础数据类型,而是和String一样的对象类型
		String[] demo = new String[5];
		
		//////////////////////////////
		
		//用for-each循环对两种数据类型进行操作//
		
		//////////////////////////////
		
			//1. 对Int
				//输出
		for(int k: a) {
			System.out.println(k);
		}//输出5个0（初始值）
		
				//编辑
		for(int k: a) {
			k = 1;
		}
		System.out.println(a[0]);//输出仍然为0
		//每一次for中的操作相当于让k = a[0]， 并不能改变a数组中元素的大小
		
		
			//2. 对Value型函数（对象类型）
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new Value();//创建出来array中每一个Value类的对象, a[i]为实际指向对应对象的指针（管理者）
			array[i].setValue(i);//通过array[i]对对象进行赋值操作
		}
		
		for(Value k: array) {
			System.out.println(k.getValue());//注意，此处的k也为对象，如果直接输出k，将得到形如Value@5f8ed237的地址（存放对象的地址）；如果我们要输出array，则必须对k视为对象进行函数的调用
		}//输出为0到4
		
		for(Value k: array) {
			k.setValue(1);
			//实际上，每一次新建一个对象，实际上是新建了一个指向存有这个对象数据的指针
			//for-each中，我们将array[0][1][2]...分别赋给了k，相当于每次都让k指向实际存有数据的地方
			//我们再对k进行操作，实际上就是对k所指向的地方的数据进行操作
			//所以在对象类型中，我们可以通过for-each对对象数组进行数值上的改变
		}
		
		for(Value k: array) {
			System.out.println(k.getValue());
		}//输出全为1(在第二个for-each循环中我们通过k为array每一个元素赋值)
		
	}

}
