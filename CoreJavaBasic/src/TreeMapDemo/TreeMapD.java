package TreeMapDemo;

import java.util.*;

public class TreeMapD {
  public static void main(String []args)
  {
	 TreeMap tm=new TreeMap(new CheckComparator());
	 tm.put(new Employee("sarath",20000),1);
	 tm.put(new Employee("sathish",25000),2);
	 tm.put(new Employee("lahari",36000),3);
	 tm.put(new Employee("Anudeep",753),4);
	 System.out.println(tm.ceilingEntry(new Employee("lahari",36000)));
	 System.out.println(tm);
	 Set keys = tm.keySet();
     for(Object key:keys){
         System.out.println(key+" ==> "+tm.get(key));
     }
	 
	
	
  }
}
