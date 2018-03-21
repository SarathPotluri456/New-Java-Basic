package TaskOnHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class TaskHashmap {

	public static void main(String[] args) {
		String str="abcdabc";
		LinkedHashMap lh=new LinkedHashMap();
		
		ArrayList al=new ArrayList();
	    char ch;
	    for(int i=0;i<str.length();i++)
	    {
	    	ch=str.charAt(i);
	    	al.add(ch);
	    }
	    System.out.println(al);
	   
	   for(Object o:al) {
			if(lh.containsKey(o)) {
				int c=(int)lh.get(o)+1;
				lh.put(o, c);
			}
			else {
				lh.put(o, 1);
			}
		}
		System.out.println(lh);
		}
	}


