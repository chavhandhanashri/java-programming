/*
1
21
321
4321
54321

*/
class PatternNo3
{
  public static void main(String args[])
  {   int k=1;
    for(int i=1;i<=5;i++)
    {   k=i;
	for(int j=1;j<=i;j++)
	 {
	   System.out.print(k);
	   k--;
	 }
	 System.out.println();
	}
  }

}