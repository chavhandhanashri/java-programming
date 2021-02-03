class Anonymous
{
 public static void main(String args[])
 {
  //new int[][]{{1,2},{30}};
   Anonymous.Display( new int[][]{{1,2},{30}}); 
 }
 static void Display(int arr[][])
  {  
     int total=0;
	for(int i=0;i<arr.length;i++)
	{
	 for(int j=0;j<arr[i].length;j++)
	 {
	   System.out.print(arr[i][j]+" ");
	 }
	 System.out.println();
	}
	
	for(int i[]:arr)
	 {
		 for(int j:i)
		 {
			 total=total+j;
		 }
	 }
	 System.out.println("Sum is "+total);
	
  }

}
