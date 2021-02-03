/*
1
2 5
3 6 8 
4 7 9 11
*/
class PatternNo7
{   
 public static void main(String args[])
 {   
  for(int i=1;i<=4;i++)
  {   int k=i;
   for(int j=1;j<=i;j++)
   {
	  System.out.print(k+" ");
	    k=k+4-j;
   }
   System.out.println();
  }
 }
}