//find duplicate value of array

class DuplicateArray
{
 public static void main(String args[])
 {
     int a[]={3,5,3,8,1,8};
	 System.out.println("Duplicate elements are");
	 for(int i=0;i<a.length;i++)
	 {
	    for(int j=i+1;j<a.length;j++)
		{
		  if(a[i]==a[j])
		  {
		     System.out.print(a[i]+" ");
			 break;
		  }
		}
		
	 }
 }

}