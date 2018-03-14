package Exam;

import java.util.Comparator;

public class CheckComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		/*if(c1.getAge()==c2.getAge())
		{
			return c1.getFirstName().compareTo(c2.getFirstName());
		}
	
		else if(c1.getFirstName().equals(c2.getFirstName()))
		{
			return c1.getLastName().compareTo(c2.getLastName());
				
		}
		else*/
		
			return c1.getId().compareTo(c2.getId());
		
	}
	

}
