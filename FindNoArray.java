//find the number that appears once in an array

class FindNoArray
{
 public static void main(String args[])
 {
   int a[]={3,4,5,6,5,4,3};
     int No=a[0];
    for(int i=0;i<a.length;i++)
	{
	  No=No^a[i];
	}
	
	System.out.print("element in Array appears onace is "+No);
 }

}