package setbasic;

import java.util.TreeSet;

public class TreeSetCustomer {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(new Customer(6,"revanth",24));
		ts.add(new Customer(2,"satish",23));
		ts.add(new Customer(4,"lahari",20));
		ts.add(new Customer(8,"mahesh",28));
		ts.add(new Customer(4,"kranthi",30));
		ts.add(new Customer(2,"kranthi",31));
		
		System.out.println(ts);
	}

}
