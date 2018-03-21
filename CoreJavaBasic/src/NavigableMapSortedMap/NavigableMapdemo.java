package NavigableMapSortedMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapdemo {
	public static void main(String[] args) {
		NavigableMap nm=new TreeMap();
		nm.put(12, "sarath");
		nm.put(34, "potluri");
		nm.put(56, "cdjdsc");
		nm.put(89, "jncsdjis");
		nm.put(65,"ffjfijf");
		nm.put(76,"fokfoff");
		System.out.println(nm);
		System.out.println();
		System.out.println("With Entry Set:");
		System.out.println();
		Set s=nm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Entry en=(Entry) it.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}
		System.out.println();
		System.out.println("With Advanced for Loop");
		System.out.println();
		Set t=nm.keySet();
		for(Object key:t)
		{
			System.out.println(key+":"+nm.get(key));
		}
	
		System.out.println(nm.lowerEntry(50));
		System.out.println("Ceiling Entry:"+nm.ceilingEntry(12));
		System.out.println("Ceiling Key:"+nm.ceilingKey(50));
		System.out.println("Desending Set:"+nm.descendingKeySet());
		System.out.println("Desending map:"+nm.descendingMap());
		System.out.println("HeadMap:"+nm.headMap(76,true));
		System.out.println("Heigher Entry:"+nm.higherEntry(65));
		System.out.println("NavigableSet:"+nm.navigableKeySet());
		System.out.println("SubMap:"+nm.subMap(34, 89));
		System.out.println("tailMap:"+nm.tailMap(34,false));
		System.out.println();
		
		System.out.println("Sorted Map Methods:");
		System.out.println();
		
		SortedMap nm1=new TreeMap();
		nm1.put(12, "sarath");
		nm1.put(34, "potluri");
		nm1.put(56, "cdjdsc");
		nm1.put(89, "jncsdjis");
		nm1.put(65,"ffjfijf");
		nm1.put(76,"fokfoff");
		System.out.println("Entry Set:"+nm1.entrySet());
		System.out.println("FirstKey:"+nm1.firstKey());
		System.out.println("Values of Map:"+nm1.values());
		
	}

}
