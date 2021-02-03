// palindrome Nunber eg.121
import java.util.*;
class PalindromNo
{
   public static void main(String args[])
   { Scanner s=new Scanner(System.in);
     System.out.println("enter number");
     int no=s.nextInt();
	 int temp=no;
	 int rev=0,d=0;
	 while(no!=0)
	 {  d=no%10;
	    rev=rev*10+d;
		no=no/10;
	 }
	 if(temp==rev)
	 {
	   System.out.println("no is palindrome");
	 }
	 else
	 {
	   System.out.println("no is not Palindrom");
	 }
   }

}