import java.util.Scanner;

public class OperationOfTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		
		//initialize the amount of rows and columns of the array
		int row, column;
		
		System.out.println("How many row do you want to input?");
		row = in.nextInt();
		
		System.out.println("How many column do you want to input?");
		column = in.nextInt();
		
		
		
		
		//Declaration of two dimension array
		int[][] array = new int[row][column];
		
		
		
		
		//input a two-dimension array
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.println("Please input an integer: ");
				array[i][j] = in.nextInt();
			}
		}
		
		
		
		
		
		//which sum of rows is the biggest?
		int maxRow = 0, indexOfMaxRow = 1;
		
		//initialize the max of row as the first row
		for(int i = 0; i < array[0].length; i++) {
			maxRow = maxRow + array[0][i];
		}
		
		for(int Arow = 1; Arow < array.length; Arow++) {
			int totalOfThisRow = 0;//每一次计算新行的和的时候需要初始化这一行的和，否则将求整个数组的和
			for(int Acolumn = 0; Acolumn< array[0].length; Acolumn++) {
				totalOfThisRow += array[Arow][Acolumn];
			}
			if(maxRow < totalOfThisRow) {
				maxRow = totalOfThisRow;
				indexOfMaxRow = Arow + 1;
			}
		}
		
		System.out.println("The sum of max row is "+maxRow+", and the row is the "+indexOfMaxRow+" row." );
		
		for(int[] k : array) {
			for(int g : k) {
				System.out.print(g + " ");
			}
			System.out.println(" ");
		}
		
		
		
		
		//randomize this two dimension array
		int randomRow, randomColumn;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				
				//Create two random value for row and column
				randomRow = (int)Math.random() * array.length;
				randomColumn = (int)Math.random() * array[0].length;
				
				//Swap array[i][j] with array[randomRow][randomColumn]
				int temp = array[i][j];
				array[i][j] = array[randomRow][randomColumn];
				array[randomRow][randomColumn]  = temp; 
			}
		}
		
		
		
		//Output the array
		for(int[] k : array) {
			for(int g : k) {
				System.out.print(g+" ");
			}
			System.out.println(" ");
		}
		in.close();
	}

}
