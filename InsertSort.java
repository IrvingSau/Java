

public class InsertSort {
	
	public static void DSort(int[] a) {
		for(int oprand = 1; oprand < a.length; oprand++) {
			int temp = a[oprand];
			for(int unComp = oprand; unComp > 0; unComp--) {
				//降序
				if(temp > a[unComp - 1]) {
					a[unComp] = a[unComp - 1];
					a[unComp - 1] = temp;
				}
			}
		}
	}
	
	public static int[] ASort(int[] a) {//数组类型的函数
		for(int flag = 1; flag < a.length; flag++) {
			int temp = a[flag];
			for(int medium = flag; medium > 0; medium-- ) {
				//升序
				if(temp < a[medium - 1]) {
					a[medium] = a[medium - 1];
					a[medium - 1] = temp;
				}
			}
		}
		return a;//返回数组名（地址）
	}
	
	public static void printArray(int[] a) {
		for(int k: a) {
			System.out.print(k +" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 67, 6, 3, 9};
		DSort(a);//降序
		ASort(a);//升序
		printArray(a);
	}

}
