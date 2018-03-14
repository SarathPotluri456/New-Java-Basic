package Exam;

import java.util.Comparator;

public class FirstNameCheck implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getFirstName().equals(c2.getFirstName()))
		{
			return c1.getLastName().compareTo(c2.getLastName());
				
		}
		return c1.getId().compareTo(c2.getId());
		
	}

}
