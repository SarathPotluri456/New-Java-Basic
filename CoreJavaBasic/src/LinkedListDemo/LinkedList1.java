package LinkedListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		
		List<String>l2=new LinkedList<String>();
		ArrayList a1=new ArrayList();
		a1.add(234);
		a1.add("fsfdedf");
		a1.clear();
		System.out.println(a1);
		l2.add("New");
		l2.add("List");
		l1.add("Sarath");
		l1.add("Potluri");
		l1.add("Hai");
		l1.add("how");
		LinkedList<String> l3=l1;
		System.out.println("Assigning l1 to l3"+l3);
		System.out.println("for loop");
		 for(int i=0;i<l1.size();i++)
		  {
			  System.out.println(l1.get(i));
		  }
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
		l1.removeFirst();
		System.out.println("After Removing First Element"+l1);
		l1.removeLast();
		System.out.println("After Removing Last Element"+l1);
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		ListIterator<String> li=l1.listIterator();
		System.out.println("While Using Next ListIterator");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("While Using Previous ListIterator");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		l1.clear();
		System.out.println("After doing Clear Statement ");
		System.out.println(l1);
		
		

	}

}
