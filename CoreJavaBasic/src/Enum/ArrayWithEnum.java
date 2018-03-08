package Enum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayWithEnum {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("sarath");
		al.add("hai");
		al.add("how");
		al.add("are");
		Enumeration e=Collections.enumeration(al);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
