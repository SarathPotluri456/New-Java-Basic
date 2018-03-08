package ClassComparable;

import java.util.TreeSet;

public class TresetCompare {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new Customer(123,"sarath",35000));
		ts.add(new Customer(124,"potluri",40000));
		ts.add(new Customer(125,"sarath1",50000));
		ts.add(new Customer(123,"sarath143",60000));
		System.out.println(ts);
		
		
		

	}

}
