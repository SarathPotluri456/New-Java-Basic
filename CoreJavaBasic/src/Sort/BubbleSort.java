package Sort;

public class BubbleSort {
    static void sort(int []arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=1;j<arr.length;j++)
    		{
    			if(arr[j]>arr[j-1])
    			{
    				int swap=arr[j-1];
    				arr[j-1]=arr[j];
    				arr[j]=swap;
    			}
    		}
    }
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
	public static void main(String[] args) {
		int []arr= {3,45,25,78,97,21,12,0};
		sort(arr);

	}

}
