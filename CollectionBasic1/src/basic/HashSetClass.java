package basic;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet al = new HashSet();
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(new Integer(30));
		al.add(new Integer(40));
		al.add(new Integer(40));
		al.add(new String("abc"));
		al.add(new Float(40.12));
		al.add(new Float(40.12));

		al.add(null);
		al.add(null);
		System.out.println(al);
		/*
		for(Object x: al) {
			System.out.println(x.toString());
		}*/
	}

}
