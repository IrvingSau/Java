
public class Teacher extends Person {
	
	private String OfficeNumber;
	private String StaffIDNumber;
	private long OfficePhoneNumber;
	
	public Teacher(String officeNumber, String staffIDNumber, long officePhoneNumber) {
		super();
		this.OfficeNumber = officeNumber;
		this.StaffIDNumber = staffIDNumber;
		this.OfficePhoneNumber = officePhoneNumber;
	}
	
	public void print() {
		System.out.println("Teacher: " + OfficeNumber +", "+ StaffIDNumber +", "+ OfficePhoneNumber );
	}
	
}
