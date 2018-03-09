package conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String arr[]= {"sarath","potluri","hai","how"};
		ArrayList al=new ArrayList (Arrays.asList(arr));
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
