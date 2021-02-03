import java.util.*;
class factorial
{
  public static void main(String args[])
  { 
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter no");
	 int a=s.nextInt();
	 factorial f=new factorial();
	f.fact(a);
 
  }
   void fact(int a)
   {  int facto=1;
    for(int i=1;i<=a;i++)
	{
	  facto=facto*i;
	}
    System.out.println(facto);	
   }

}