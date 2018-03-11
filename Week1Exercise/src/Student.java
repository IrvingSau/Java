
public class Student extends Person {
	
	private String StudentID;
	private int DormitoryNumber;
	private String Major;
	private String HomeAddress;
	
	public Student(String studentID, int dormitoryNumber, String major, String homeAddress, String gender) {
		super(gender);
		this.StudentID = studentID;
		this.DormitoryNumber = dormitoryNumber;
		this.Major = major;
		this.HomeAddress = homeAddress;
		//this.gender = gender;
	}
	
	public void print() {
		System.out.println("Student: " +StudentID+ ", " +DormitoryNumber+ ", " +Major+ ", " +HomeAddress );
	}
	
}
