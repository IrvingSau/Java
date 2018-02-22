/*
 * Date: 2018/2/22
 * Author: IrvingSau
 * Purpose: Use ArrayList 容器创建一个(添加/删减/查询/查询大小)记事本
 * */

import java.util.ArrayList;

public class NoteBook {

	private ArrayList<String> notes = new ArrayList<String>();
	//ArrayList<String>是一个容器类，ArrayList是容器类型，<>中的String是容器中的元素类型
	
	public void add(String note) {
		notes.add(note);
		//add()是容器ArrayList<String>的一个函数，意为将note添加到容器notes中，并且只能添加String类型的
	}
	
	public void addTo(int location, String note) {
		notes.add(location, note);
		//将note的内容添加到容器位于location位置的地方
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		String note = notes.get(index);
		//使用ArrayList容器的索引功能，写get(0)就获得第一个元素（类似于数组的下标）
		return note;
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
		notes.toArray(a);
		//直接用容器中的toArray()函数可以将容器中的内容转化为对应类型的数组
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nbTest = new NoteBook();
		nbTest.add("first");
		nbTest.add("second");
		nbTest.addTo(0, "插入使之成为第一");
		
		String[] List = new String[nbTest.getSize()];
		List = nbTest.list();
		
		//输出List
		for(String k: List)
			System.out.println(k);
		

	}

}
