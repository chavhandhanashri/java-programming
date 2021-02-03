/*
1 2 3
6 5 4
7 8 9
12 11 10
13 14 15
/*
class PatternNo6
{
  public static void main(String args[])
  {  int k=1;
   for(int i=1;i<=5;i++)
   {  
   
     if(i%2!=0)
     {
       for(int j=1;j<=3;j++)
	   {  
	    System.out.print(k+" ");
		k++;
	   }
	 }
     else
     {  
         int t=k;
	   for(int j=t+2;j>=t;j--)
	   {    
	    System.out.print(j+" ");
		 k++;
	   }
	 }
    System.out.println();	 
   }
  }
}