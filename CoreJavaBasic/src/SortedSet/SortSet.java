package SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortSet {

	public static void main(String[] args) {
	SortedSet s1=new TreeSet();
	s1.add(234);
	s1.add(456);
	s1.add(100);
	s1.add(34);
	System.out.println(s1.headSet(234));
	System.out.println(s1);
	
	System.out.println(s1.first());
	System.out.println(s1.last());
	System.out.println(s1.subSet(100, 456));
	System.out.println(s1.tailSet(100));
	
	}

}
