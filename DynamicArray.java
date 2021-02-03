//Dynamic Array
import java.util.*;
class DynamicArray
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
 
  System.out.println("Enter Size of Array");
  int n=s.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter Elements");
  for(int i=0;i<n;i++)
  {
	  arr[i]=s.nextInt();
  }
  System.out.println("Your Array:");
  for(int i=0;i<n;i++)
  {
	  System.out.print(arr[i]+" ");
  }
  System.out.println();
  System.out.println("Array is:"+Arrays.toString(arr));
 }
}