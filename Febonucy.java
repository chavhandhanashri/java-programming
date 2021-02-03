import java.util.*;

class Febonucy
{
   public static void main(String args[])
   {    Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int no=s.nextInt();
       int a=0;
	   int b=1;
	   int c=0;
	   System.out.print(a+" "+b);
	   for(int i=1;i<=no;i++)
	   { 
	       c=a+b;
		  System.out.print(" "+c);
		  a=b;
		  b=c;
	   }
   
   }


}