import java.util.ArrayList;


public class Database {
	
	private ArrayList<CD> CDList = new ArrayList<CD>();
	
	private ArrayList<DVD> DVDList = new ArrayList<DVD>();
	
	public void add(CD cd) {
		CDList.add(cd);
	}
	
	//���������أ���ͬ���������Ǳ��������Ͳ�ͬ�����Զ�ƥ���������Ӧ�ı���
	public void add(DVD dvd) {
		DVDList.add(dvd);
	}
	
	public void showCDList() {
		for(CD k : CDList) {
			k.print();
		}
	}
	
	public void showDVDList(){
		for(DVD k: DVDList) {
			k.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database demo = new Database();
		CD first = new CD("Title", "Jay Zhou", 13, 8, "Very good!" );
		demo.add(first);
		demo.showCDList();
		
		demo.add(new DVD("Title", "hello", 89, "ok"));
		demo.showDVDList();
	}

}
