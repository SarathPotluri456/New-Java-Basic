package conversion;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("sarath");
		al.add("hai");
		al.add("how");
		al.add("are");
		al.add("you");
		
		String[] arr=new String[al.size()];
		arr=(String[]) al.toArray(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);	
		}
		

	}

}
