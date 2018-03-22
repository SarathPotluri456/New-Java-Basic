package basic;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList al = new LinkedList();
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(new Integer(30));
		al.add(new Integer(40));
		al.add(new String("abc"));
		al.add(new Float(40.12));
		al.add(new Float(40.12));
		al.add(new Integer(40));
		al.add(null);
		al.add(null);
		System.out.println(al);
		/*
		for(Object x: al) {
			System.out.println(x.toString());
		}*/
	}

}
