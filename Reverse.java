import java.util.*;

class Reverse
{
  public static void main(String args[])
  {  Scanner s=new Scanner(System.in);
     System.out.println("Enter number");
     int n=s.nextInt(); 
    //int n=2347;
	int r=0,d=0;
	while(n>0)
	{
	  d=n%10;
	  r=r*10+d;
	  n=n/10;
	}
	System.out.println(r);
	
  
  }
 
 }
