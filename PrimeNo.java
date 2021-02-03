import java.util.*;

class PrimeNo
{
  public static void main(String args[])
  {  int temp=0;
     for(int i=1;i<=100;i++)
	 {  if(i==1)
		 {
			 temp++;
		 }
	  for(int j=2;j<i;j++)
	  {
	    if(i%j==0)
		{
		 temp++;
		}
	  }
	  if(temp==0)
	  {
	    System.out.print(" "+i);
	  }
	  else
	  {
	    temp=0;
	  }
	 }
  
  }

}