class Sort{
	
	public static void insertionSort(int arr[], int n)
	{
		if(n<=1)
		{
			return;
		}
		
		insertionSort(arr, n-1);
		
		int last = arr[n-1];
		int j = n-2;
		
		while(j>=0 && arr[j]>last)
		{
			arr[j+1] = arr[j];
			j--;
			display(arr);
		}
		arr[j+1] = last;
		
		
	}
	
	public static void display(int arr[])
	{
		System.out.println("");
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		
		int a1[] = {2,4,6,8,3};
		insertionSort(a1, a1.length);
		Sort ob = new Sort();
		//ob.display(a1);
		
	}
}