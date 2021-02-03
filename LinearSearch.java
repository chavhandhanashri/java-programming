class LinearSearch
{
 public static void main(String args[])
 {
    int arr[]={3,5,7,1,9,6};
	int item=9;
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
	  if(arr[i]==item)
	  {
	    System.out.print("number is at "+i+" position");
		temp++;
	  }
	}
	if(temp==0)
	{
		System.out.print("number not found");
	}
 }
}