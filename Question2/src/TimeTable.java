
public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print first two lines directly
		System.out.println("* | \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9");
		System.out.println("-------------------------------------------------------------------------");
		
		//Use two nested for loop, first present row, second present column
		for(int row = 1; row <= 9; row++) {
			//Insert "index  |    " before every row of table
			System.out.print(row+" |\t");
			for(int column = 1; column <= 9; column++) {
				System.out.print(row*column + "\t");
			}
			//use println() to line feed
			System.out.println("");
		}
	}

}
