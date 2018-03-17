import java.util.ArrayList;

public class database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> db = new ArrayList<Item>();
		
		db.add(new Item("Loan"));
		db.add(new Item("Date"));
		db.add(new Item("Circle"));
		
		for(Item k: db) {
			k.toString();
			System.out.println(k);
		}
	}

}
