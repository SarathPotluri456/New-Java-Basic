package Arrays;
import java.util.*;
public class ForInMulti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			
				System.out.println("The Value of a["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The Array Values:");
		for(int[] x:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}

	}

}
