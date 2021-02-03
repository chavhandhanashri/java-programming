class Prime2
{   int temp=0;
 public static void main(String args[])
 {   //int iret=0; 
     Prime2 p=new Prime2();
	 for(int i=1;i<=100;i++)
	 {
		 p.prime(i);
		/* if(iret==0)
		 {
		 System.out.print(" "+i);
		 } */
	 }
 }
  void prime(int i)
 {    int j;
   
	 for(j=2;j<i;j++)
	 {
		 if(i%j==0)
		 {
			break;
		 }
	 }
	 if(j==i)
	 {
		 System.out.print(i+" ");
	 }
     
 }
}