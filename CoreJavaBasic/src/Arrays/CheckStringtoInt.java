package Arrays;

import java.util.StringTokenizer;

public class CheckStringtoInt {

	public static void main(String[] args) {
		String s="1 3 5 9 11 13";
		int arr[]=new int [7];
		StringTokenizer st=new StringTokenizer(s," ");
		int j=0;
		while(st.hasMoreElements())
		{
			String s1=st.nextToken();
			int i=Integer.parseInt(s1);
			arr[j]=i;
			j++;
			
		}
		for(j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		for(int i=0;i<=arr.length;i++)
		{
			if((arr[i+1]-arr[i])!=2)
{
				System.out.println("The Missing value");
	System.out.println(arr[i]+2);
}

		}
/*    
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				 arr[j]=Character.getNumericValue(s.charAt(i));
				
				j++;
			}
		}
		for( j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}*/
	}
}
