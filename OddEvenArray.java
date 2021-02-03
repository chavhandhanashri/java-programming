//print ODD and EVEN number in an Array
import java.util.*;
class OddEvenArray
{
   public static void main(String args[])
   {
     int a[]={4,6,8,1,2,7};
	
	 ArrayList<Integer> al1=new ArrayList<>();
	 ArrayList<Integer> al2=new ArrayList<>();
	 for(int i=0;i<a.length;i++)
	 {
	   if(a[i]%2==0)
	   {
		  al1.add(a[i]);
	   }
	   else
	   {
		   al2.add(a[i]);
	   }
	 }
	 System.out.print("Even numbers are:");
	 for(int no:al1)
	 {
		 System.out.print(no+" ");
	 }
	 System.out.println();
	 System.out.print("Odd numbers are:");
	 for(int no:al2)
	 {
		 System.out.print(no+" ");
	 }
   }
}