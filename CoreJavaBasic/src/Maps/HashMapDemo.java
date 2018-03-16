package Maps;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm2=new HashMap();
		hm2.put(101, "sarath");
		hm2.put(102,"potluri");
		hm2.put(103, "fvjdfjevhij");
		HashMap hm=new HashMap(hm2);
		hm.put("name", "sarath");
		hm.put("age", 25);
		hm.put("deg", "java Developer");
		hm.put("city", "Hyderabad");
		hm.put("area", "Gachibowli");
	    System.out.println(hm);
	    Object hm1=hm.clone();
	    System.out.println(hm1);
	    System.out.println();
	    
	    System.out.println("By Using Entry Set");
	    Set e= hm.entrySet();
	    Iterator itr=e.iterator();
	    while(itr.hasNext())
	    {
	    	Entry e1=(Entry) itr.next();
	    	
	    	System.out.println(e1.getKey()+" : "+e1.getValue());
	    }
	    System.out.println();
	    System.out.println("By Using Key Set");
       Set keys=hm.keySet();
       for(Object key:keys)
       {
    	   System.out.println(key+" : "+hm.get(key));
       }
       
	    
		

	}

}
