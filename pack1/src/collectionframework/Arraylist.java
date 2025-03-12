package collectionframework;

import java.util.ArrayList;

public class Arraylist {

	void meth1()
	{
		System.out.println("Implementing arrayList collections");
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(10);
		//al.add(java);
		al.add(null);
		al.add(50);
		al.add(10);
		al.add(17);
		al.add(86);
		al.add(21);
		System.out.print(al+" ");
		
		
	}
	public static void main(String[] args) {
		new Arraylist().meth1();
	}
}
