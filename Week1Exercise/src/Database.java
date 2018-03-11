import java.util.ArrayList;

public class Database {
	
	private ArrayList<Person> db = new ArrayList<Person>();
	
	public void add(Person person) {
		db.add(person);
	}
	
//	public void add(Teacher teacher) {
//		db.add(teacher);
//	}
	
	public void list() {
		for(Person k: db) {
			k.print();
		}
	}
	
	public static void main(String[] args) {
		Database demo = new Database();
		demo.add(new Student("l630003044", 709, "CST", "Guangzhou"));
		demo.add(new Teacher("V3 40X", "456456456", 56743));
		demo.add(new Security("28347"));
		
		demo.add(new Mentor("V3 40X", "456456456", 56743));
		
		demo.list();
	}

}
