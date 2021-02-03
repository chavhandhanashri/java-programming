import java.util.*;
class ArrayMaxMinK
{
  public static void main(String args[])
  { Scanner s=new Scanner(System.in);
    int a[]={3,6,4,1,9,5};
	System.out.print("Enter k");
	int k=s.nextInt();
	int temp=0;
	int len=a.length;
	for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	  {
	       if(a[i]<a[j])
		     {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			 }
	  }
	  if(i==k-1)
	  {
	    System.out.println("kth Max is "+a[i]);
	  }
	  if(i==len-k)
	  {
		  System.out.println("kth Min is "+a[i]);
	  }
	}
	for(int j:a)
	{
		System.out.print(j+" ");
	}
  }
}