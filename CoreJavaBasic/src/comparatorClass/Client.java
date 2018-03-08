package comparatorClass;

import java.util.TreeSet;

public class Client {
 public static void main(String[] args) {
	TreeSet ts=new TreeSet(new NameComparator());
	ts.add(new Customer(12,"sarath",45000));
	ts.add(new Customer(11,"potluri",50000));
	ts.add(new Customer(10,"anudeep",60000));
	System.out.println(ts);
}
}
