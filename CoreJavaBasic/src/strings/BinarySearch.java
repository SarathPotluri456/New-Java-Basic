package strings;

public class BinarySearch {
      
	void binerySearch(int arr[],int key)
	{
		
		int lowindex=0;
		int highindex=arr.length-1;
		/*if(lowindex>highindex)
		{
		System.out.println("Key not found");
		}*/
		while(lowindex<=highindex)
		{
			
			int mid=(lowindex+highindex)/2;
			if(arr[mid]<key)
			{
				lowindex=mid+1;
			}
			else if(arr[mid]>key)
			{
				highindex=mid-1;
			}
			
			else
			{
				
				System.out.println("Founded Index found value is:"+mid);
				break;
			}
			
			
		}
		if(lowindex>highindex)
		{
			System.out.println("Key not found");
		}
		
		

	}
       	
	
	public static void main(String[] args)
	{
		BinarySearch bs=new BinarySearch();
		int arr[]= {10,20,30,40,50,60};
	
		 int key=70;
		bs.binerySearch(arr,key);

	}

}
