/*                   *     *
                      *   *
                       * *
                        *
*/	
class Pattern13
{
 public static void main(String args[])
 {
   for(int i=1;i<=4;i++)
   {
    for(int j=1;j<=i;j++)
	{
	  System.out.print(" ");
	}
	for(int k=4+3;k>=(i*2)-1;k--)
	{  if(k==7 || k==(i*2)-1)
		{
	     System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
   }
 }
}