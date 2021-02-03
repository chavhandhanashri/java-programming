class ArrayMaxMin2
{
  public static void main(String args[])
  {
    int a[]={5,6,8,3,4,9,1};
	  int temp=0,i=0,k=0;
	  int len=a.length;
	  for(i=0;i<a.length;i++)
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
	  }
	  for(k=0;k<a.length;k++)
	  {
	    System.out.print(a[k]+" ");
	  }  System.out.println();
	  System.out.println("2nd max is "+a[1]);
	  System.out.println("2nd min is "+a[len-2]);
  }
  

}