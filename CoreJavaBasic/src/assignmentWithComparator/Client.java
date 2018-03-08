package assignmentWithComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		
		ArrayList ts=new ArrayList();
		ts.add(new Customer(12,"sarath",60));
		ts.add(new Customer(11,"sarath",50));
		ts.add(new Customer(10,"sathish",30));
		ts.add(new Customer(15,"potluri",35));
	
		Collections.sort(ts,new CheckComparator());
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
