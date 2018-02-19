import java.util.Scanner;

public class student{
		private int mark;
		private String name = new String();//新建一个字符串
		private char grade;
		
		student(int mark, String name, char grade) {
			this.name = name;
			this.grade = grade;
			this.mark = mark;
		}
		
		int getMark() {
			return mark;
		}
		String getName() {
			return name;
		}
		char getGrade() {
			return grade;
		}

	//新建一个函数用于输入学生信息
	public static student[] inputInfo() {
		Scanner in = new Scanner(System.in);
		
		int markTemp, flag, length;
		char gradeTemp;
		String nameTemp;
		
		student[] studentList = new student[10];//新建一个十个学生的列表
		
		for(int i = 0; i<10; i++) {
			System.out.println("Please input the student mark: ");
			markTemp = in.nextInt();
			System.out.println("Please input the student name: ");
			nameTemp = in.next();
			gradeTemp = grade(markTemp);
			//新建学生对象
			student str = new student(markTemp, nameTemp, gradeTemp);
			studentList[i] = str;
			System.out.println("if you want to stop, input -1: ");
			flag = in.nextInt();
			if(flag == -1) {
				
				break;
			}
		}
		in.close();
		return studentList;
	}
	
	//新建一个函数自动判断学生的等级
	public static char grade(int mark) {
		char grade = 'a';
		if(mark < 60 && mark > 0) {
			grade = 'f';
			}
		else if(mark > 60 && mark < 80) {
			grade = 'b';
			}
		else if(mark > 80 && mark < 100) {
			grade = 'a';
		}
		return grade;
	}
	
	//新建一个函数判断数组内非空元素的个数
	public static int numberOfElement(student[] studentList)
	{
		int amount = 0, i = 0;
		do {
				amount++;
				i++;
			}while(studentList[i] != null);
		//System.out.println(amount);
		return amount;
	}
	
	//新建一个函数为学生排序
	public static student[] sortStu(student[] studentList) {
		int flag, next, length;
		student temp;//用temp这个对象作为排序的中介
		length = numberOfElement(studentList);
		for(flag = 0; flag < length; flag++){
			for(next = flag + 1; next < length; next++) {
				if(studentList[flag].getMark() < studentList[next].getMark()) {
					temp = studentList[flag];
					studentList[flag] = studentList[next];
					studentList[next] = temp;
				}
			}
		}
		return studentList;
	}
	
	//新建一个函数输出学生列表
	public static void printStu(student[] studentList) {
		for(int i = 0; i < numberOfElement(studentList); i++) {
			System.out.println("This student's name is "+studentList[i].getName()+", and mark is: "+studentList[i].getMark()+", grade is "+studentList[i].getGrade());
		}
	}
	
	public static void main(String[] args) {
	student[] studentList = new student[10];
		studentList = inputInfo();
		sortStu(studentList);
		printStu(studentList);
	}
}
