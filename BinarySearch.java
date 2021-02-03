class BinarySearch
{
public static void main(String args[])
{
  int a[]={7,5,3,2,1};
   int l=0;
   int h=a.length-1;
   int item=7;
   int mi=(l+h)/2;
   while(l<=h)
      {
      if(a[mi]==item)
      {
	   System.out.print("element is at position "+mi);
	   break;
      }
      else if(a[mi]<item)
      {
	   l=mi+1;
      }
      else
      {
	   h=mi-1;
      }
      mi=(l+h)/2;
   }
   if(l>h)
   {
	   System.out.print("element not found");
   }
}
}