//febonucy series by using reccursion

import java.util.*;

class Febon
{  static int a=0,b=1,c;
   public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
	 Febon f=new Febon();
	 System.out.println("enter number");
	 int n=s.nextInt();
	 System.out.print(a+" "+b);
	 f.feb(n);
   
   }
   void feb(int n)
   { 
       if(n>=1)
	   {
	   c=a+b;
	   System.out.print(" "+c);
	   a=b;
	   b=c;
	   feb(n-1);
	   }
   }
}