package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
  public static void main(String[] args) {
     
	  HashSet<String> h1=new HashSet<String>();
	  Scanner sc=new Scanner(System.in);
	  
	  String s=sc.next();
	  h1.add(s);
	  h1.add("Sarath");
	  h1.add("hai");
	  h1.add("are");
	  h1.add("how");
	 
	  System.out.println(h1);
	  
	  
	  
	  
	  
}
}
