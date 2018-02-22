/*
 * Date: 2018/2/22
 * Author: IrvingSau
 * Purpose: Use ArrayList ��������һ��(���/ɾ��/��ѯ/��ѯ��С)���±�
 * */

import java.util.ArrayList;

public class NoteBook {

	private ArrayList<String> notes = new ArrayList<String>();
	//ArrayList<String>��һ�������࣬ArrayList���������ͣ�<>�е�String�������е�Ԫ������
	
	public void add(String note) {
		notes.add(note);
		//add()������ArrayList<String>��һ����������Ϊ��note��ӵ�����notes�У�����ֻ�����String���͵�
	}
	
	public void addTo(int location, String note) {
		notes.add(location, note);
		//��note��������ӵ�����λ��locationλ�õĵط�
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		String note = notes.get(index);
		//ʹ��ArrayList�������������ܣ�дget(0)�ͻ�õ�һ��Ԫ�أ�������������±꣩
		return note;
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
		notes.toArray(a);
		//ֱ���������е�toArray()�������Խ������е�����ת��Ϊ��Ӧ���͵�����
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nbTest = new NoteBook();
		nbTest.add("first");
		nbTest.add("second");
		nbTest.addTo(0, "����ʹ֮��Ϊ��һ");
		
		String[] List = new String[nbTest.getSize()];
		List = nbTest.list();
		
		//���List
		for(String k: List)
			System.out.println(k);
		

	}

}
