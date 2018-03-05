package Arrays;

public class Multi {
   
	void multi(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("The value of a["+i+"]["+j+"]:"+a[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		int a[][]= {{1,5,74,2},{4,68,45,65},{5,0,34,54}};
		Multi m=new Multi();
		m.multi(a);
	}

}
