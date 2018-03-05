package Arrays;
import java.util.*;
public class MultiDimen {

	public static void main(String[] args) {
		int a[][]=new int [3][4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter The Value of a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Value of Array:");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}

	}

}
