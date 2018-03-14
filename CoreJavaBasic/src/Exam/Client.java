package Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		ArrayList ts=new ArrayList();
		
		 ts.add(new Customer(1034,25,"Rajesh","Kathi"));
		 ts.add(new Customer(1032,26,"Abhilash","Suhad"));
		 ts.add(new Customer(1033,26,"Mujeeb","Md"));
		 ts.add(new Customer(1039,36,"Sirish","Vadhwa"));
		 ts.add(new Customer(1025,25,"Abhilash","Suhan"));
		 ts.add(new Customer(1028,20,"Sonal","Gadwe"));
		 ts.add(new Customer(1029,26,"Mujeeb","Mohammed"));
		 
		 Collections.sort(ts, new CheckComparator());
		 
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(ts,new AgeCheck());
		System.out.println("If Age Is Same");
		Iterator itr1=ts.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		Collections.sort(ts,new FirstNameCheck());
		System.out.println("If FirstName Is Same");
		Iterator itr2=ts.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

		
		
		

	}

}
