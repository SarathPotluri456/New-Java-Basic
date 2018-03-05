package Arrays;
import java.util.*;
public class SwapOfArrays {
	void swap(int a[],int b[])
	{int c;
		for(int i=0;i<5;i++)
		{
			c=a[i];
			a[i]=b[i];
			b[i]=c;
		}
		System.out.println("After Swapping A array Values");
		for(int i=0;i<5;i++)
		{
			System.out.println("The Value of a["+i+"]:"+a[i]);
			
		}
		System.out.println("After Swapping B array Values");
		for(int i=0;i<5;i++)
		{
			System.out.println("The Value of b["+i+"]:"+b[i]);
			
		}
		
	}
	

	public static void main(String[] args) {
		SwapOfArrays sa=new SwapOfArrays();
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int [5];
		System.out.println("Please Enter A array Values");
		for(int i=0;i<5;i++)
		{
			System.out.println("The Value of a["+i+"]:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("The Value of b["+i+"]:");
			b[i]=sc.nextInt();
		}
		sa.swap(a, b);

	}

}

