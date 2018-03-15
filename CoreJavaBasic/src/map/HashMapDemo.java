package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(100, "Sarath");
		hs.put(101, "potluri");
		hs.put(104, "babu");
		System.out.println(hs);
		hs.remove(101);
      for(Map.Entry m:hs.entrySet())
      {
    	  System.out.println(m.getKey()+"  "+m.getValue());
      }
	}

}
