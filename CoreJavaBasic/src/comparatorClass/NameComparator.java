package comparatorClass;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customer c1=(Customer) o1;
		Customer c2=(Customer) o2;
		int namecom=c1.getRollno().compareTo(c2.getRollno());
		
		return namecom;
	}

}
