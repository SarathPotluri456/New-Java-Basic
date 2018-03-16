package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class CheckHashMapCusObj {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(new Student(123,"sarath",25),new Customer(120,"Potluri",25090));
		System.out.println(hm);
		 System.out.println("By Using Entry Set");
		    Set e= hm.entrySet();
		    Iterator itr=e.iterator();
		    while(itr.hasNext())
		    {
		    	Entry e1=(Entry) itr.next();
		    	
		    	System.out.println(e1.getKey()+" : "+e1.getValue());
		    }

		

	}

}
