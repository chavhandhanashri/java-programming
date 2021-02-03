import java.util.*;

class Calculater
{
  public static void main(String args[])
  {  
      String yn;
      do
      {
      Scanner s=new Scanner(System.in);
	  System.out.println("Enter 1st no:");
	  int a=s.nextInt();
	  System.out.println("Enter 2st no:");
	  int b=s.nextInt();
	  System.out.println("Enter operation(+,-,*,/)");
	  String sym=s.next();
	  int res;
	  switch(sym)
	  {
		  case "+":res=a+b;
		         System.out.println(res);
		          break;
		  case "-":res=a-b;
		          System.out.println(res);
		         break;
		  case "*": res=a*b;
		          System.out.println(res);
		          break;
		  case "/":res=a/b;
		          System.out.println(res);
		         break;
	    }
		System.out.println("For continue press: y otherwise :N");
		  yn=s.next();
		
	    }while(yn.equals("y")||yn.equals("Y"));
  
    }

}