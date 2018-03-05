package LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		List<String>l2=new LinkedList<String>();
		ArrayList a1=new ArrayList();
		a1.add(234);
		a1.add("fsfdedf");
		System.out.println(a1);
		l2.add("New");
		l2.add("List");
		l1.add("Sarath");
		l1.add("Potluri");
		l1.add("Hai");
		l1.add("how");
		System.out.println(l1);
		l1.addFirst("Are");
		l1.addLast("PSB");
		System.out.println(l1);
		l1.addAll(1,l2);
		System.out.println("After Adding the List into Linked List");
		System.out.println(l1);
		l1.add(1, "Adding");
		System.out.println("After Adding the new Element in perticular Index:");
		System.out.println(l1);
		l1.remove("Adding");
		System.out.println("After Removing one element");
		System.out.println(l1);
		System.out.println("The Size of Linked List:"+l1.size());
		

	}

}
