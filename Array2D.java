class Array2D
{
 public static void main(String args[])
 {
    int a[][]=new int[2][3];
	a[0][0]=2;
	a[0][1]=3;
	a[0][2]=4;
	a[1][0]=5;
	a[1][1]=8;
	for(int i=0;i<a.length;i++)
	{
	 for(int j=0;j<a[i].length;j++)
	 {
	   System.out.print(a[i][j]+" ");
	 }
	 System.out.println();
	}
	int b[][]={{1,2,3},{10,20}};
	for(int i=0;i<b.length;i++)
	{
	 for(int j=0;j<b[i].length;j++)
	 {
	   System.out.print(b[i][j]+" ");
	 }
	 System.out.println();
	}
 }


}