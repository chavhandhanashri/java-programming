import java.util.*;

class PrimeChk
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
	 System.out.println("Enter number");
	 int no=s.nextInt();
	 //int no=5;
	 int i=0;
	 for(i=2;i<no;i++)
	 {
	    if(no%i==0)
		{
		   break;
		}
	 }
     if(i==no)
	 {
	   System.out.println("no is prime");
	 }
	 else
	 {
	   System.out.println("no is not prime");
	 }
  
  }


}