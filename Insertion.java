class Insertion 
{
  public static void main(String args[])
  {
    int a[]={2,5,3,8,6};
	  int temp=0,j=0;
	 for(int i=1;i<a.length;i++)
	 {  temp=a[i];  
	    j=i;
		while(j>0 && a[j-1]>temp)
		{
		   a[j]=a[j-1];
		   j=j-1;
		}
		a[j]=temp;
	 }
    for(int i=0;i<a.length;i++)
	{
	   System.out.print(a[i]+" ");
	}
  }

}