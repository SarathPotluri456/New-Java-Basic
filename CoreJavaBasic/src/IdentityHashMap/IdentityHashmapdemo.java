package IdentityHashMap;

import java.util.IdentityHashMap;

public class IdentityHashmapdemo {
 public static void main(String[] args) {
	 
	 IdentityHashMap im=new IdentityHashMap();
	 im.put(1, "sarath");
	 im.put(new Integer(1), "potluri");
	 System.out.println(im);
	
}
}

