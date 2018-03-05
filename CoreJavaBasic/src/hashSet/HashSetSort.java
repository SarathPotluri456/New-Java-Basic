package hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetSort {
    public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("sarath");
		h1.add("hai");
		h1.add("how");
		h1.add("r");
		h1.add("abc");
		
		System.out.println(h1);
		TreeSet<String> t1=new TreeSet<String>(h1);
		System.out.println(t1);
		//By using List Interface
		List <String> l1=new ArrayList<String>(h1);
		Collections.sort(l1);
		System.out.println(l1);
		
		
	}
}
