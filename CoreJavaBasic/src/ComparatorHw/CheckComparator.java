package ComparatorHw;

import java.util.Comparator;

public class CheckComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		int firstNcompare=e1.getFirstName().compareTo(e2.getFirstName());
		int secondNcompare=e1.getLastName().compareTo(e2.getLastName());
		int ageCompare=e1.getAge().compareTo(e2.getAge());
		int AccCompare=e1.getAccno().compareTo(e2.getAccno());
		int mobiCompare=e1.getMobile().compareTo(e2.getMobile());
		
		if(firstNcompare==0)
		{
			if(secondNcompare==0)
			{
				if(mobiCompare==0)
				{
					if(ageCompare==0)
					{
						 if(AccCompare<0)
						{
							return -1;
						}
						else
						{
						
						return 1;
						}
						
					}
					else if(ageCompare<0)
					{
						return -1;
					}
					else
					{
					
					return 1;
					}
				}
				else if(mobiCompare<0)
				{
					return -1;
				}
				else
				{
				return 1;
				}
			}
			else if(secondNcompare<0)
			{
				return -1;
			}
			else
			{
			return 1;
			}
			
		}
		else if(firstNcompare>0)
		{
		
			return 1;

		}
		else
		{
			return -1;
		}
	}
		
	

}
