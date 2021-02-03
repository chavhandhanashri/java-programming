//delete an element from Array

class DelElementArray
{
 public static void main(String args[])
 {
   int a[]={4,6,7,8,3,5,9};
   int del=3;
   for(int i=0;i<a.length;i++)
   {
      if(del==a[i])
	  {
	     for(int j=i;j<a.length-1;j++)
		 {
		    a[j]=a[j+1];
		 }
		 break;
	  }
	  
   }
   for(int k=0;k<a.length-1;k++)
   {
     System.out.print(a[k]+" ");
   }
 }

}