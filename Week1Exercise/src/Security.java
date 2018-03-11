
public class Security extends Person {
	private String StaffIDNumber;
	
	public Security(String StaffIDNumber){
		this.StaffIDNumber = StaffIDNumber;
	}
	
	public void print() {
		System.out.println("Security: " + StaffIDNumber);
	}
}
