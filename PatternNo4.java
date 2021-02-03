/*
1
121
12321
1234321
123454321
*/
class PatternNo4
{
 public static void main(String args[])
 {
   for(int i=1;i<=5;i++)
   {   int r=i-1;
     for(int j=1;j<=i;j++)
	 {
	  System.out.print(" "+j);
	 }
	 for(int k=2;k<=i;k++)
	 {
	  System.out.print(" "+r);
	  r--;
	 }
	 System.out.println();
   }
 }

}