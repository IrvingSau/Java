
public class Person {
	
	private String gender;
	
	
	//�������أ�����Ĺ��캯�������ж������ƥ�䲻ͬ���������
	//�е����� ����Ҫ �õ�gender�ĳ�Ա�������������еĹ��캯����������gender���������ǵ�super()������Ϊ�գ���ƥ�䵽�ڶ������캯��
	//�е����� ��Ҫ �õ�gender�ĳ�Ա�������������еĹ��캯������ͨ��super(gender)��gender�������ݽ��븸������ƥ��Ĺ��캯���У���һ�����캯����
	
	//���캯��1
	public Person(String gender) {
		this.gender = gender;
	}
	
	//���캯��2
	public Person() {
		
	}
	
	public void print() {
		System.out.println("No print methods in sub-class");
	}
	
}
