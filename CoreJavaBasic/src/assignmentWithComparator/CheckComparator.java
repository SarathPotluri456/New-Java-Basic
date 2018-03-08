package assignmentWithComparator;
import java.util.Comparator;

public class CheckComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		if(o1.getName().equals(o2.getName()))
		{
			int Ager=o1.getAge().compareTo(o2.getAge());
			return Ager;
		}
		int namer=o1.getName().compareTo(o2.getName());
		return namer; 
	}

}
