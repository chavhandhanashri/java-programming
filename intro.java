
class FactorialRecu
{
	public static void main(String args[])
	{
		int no=4;
		FctorialRecu fr=new FactorialRecu();
		 fr.FactCal(no);
	}
	void FactCal(int no)
	{  int i=0,fact=1;
	    
		if(no>=1)
		{   fact=fact*i;
			FactCalc(no-1);
		}
	   System.out.println("Factorial is %d",fact);
	}
	
	
	
}

