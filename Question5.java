import java.util.Scanner;

public class Question5 {

	public static float[] array_abs(float a[]) {
		float[] newArray = new float[a.length];
 		int i = 0;
		for(float k: a) {
			if(k < 0) {
				k = k * -1;
			}
			newArray[i] = k;
			i++;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float[] a = new float[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter a floating point number: ");
			a[i] = in.nextFloat();
		}
		for(float k : array_abs(a)) {
			System.out.print("The result is "+ k + " ");
		}
	}

}
