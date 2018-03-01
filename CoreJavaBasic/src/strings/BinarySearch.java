package strings;

public class BinarySearch {
      
	void binerySearch(int arr[],int key)
	{
		
		int lowindex=0;
		int highindex=arr.length-1;
		
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
				
				System.out.println("Index found value is:"+mid);
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
		int arr[]= {1,2,3,4,5,6};
	
		 int key=4;
		bs.binerySearch(arr,key);

	}

}
