package Exam;

import java.util.Comparator;

public class AgeCheck implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getAge()==o2.getAge())
		{
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
		return o1.getId().compareTo(o2.getId());
	}

}
