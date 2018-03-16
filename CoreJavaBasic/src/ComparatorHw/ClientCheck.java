package ComparatorHw;

import java.util.Iterator;
import java.util.TreeSet;

public class ClientCheck {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new CheckComparator());
		
		ts.add(new Employee("sarath","babu",9848368284L,24,"savings"));
		ts.add(new Employee("sarath","reddy",9848368284L,22,"savings"));
		ts.add(new Employee("suresh","naik",5442342234L,20,"current"));
		ts.add(new Employee("mahesh","babu",5442362234L,20,"current"));
		
		/*System.out.println(ts);
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		System.out.println(ts.headSet(new Employee("suresh","naik",5442342234L,20,"current")));

	}

}
