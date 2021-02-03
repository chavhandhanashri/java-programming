import java.util.Scanner;

class FactorialRecu
{ 
    static int fact=1;
  
 public static void main(String args[])
  {  Scanner s=new Scanner(System.in);
     System.out.println("Enter no");
	 int no=s.nextInt();
	 FactorialRecu fr=new FactorialRecu();
	 fr.factcal(no);
	 System.out.println("factorial of "+no+" is "+fact);
  }
   void factcal(int no)
   {
	  //   int fact=1;
	   if(no>1)
	   {
		   fact=fact*no;
		   factcal(no-1);
	   }
	   //System.out.println(fact);
   }

}


