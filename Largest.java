class Largest
{
   public static void main(String args[])
   {
    int x=5,y=9,z=6;
	if(x>y)
	{System.out.println(x);}
	else
	{System.out.println(y);
	}
	//largest of 3 number
	if(x>y && x>z)
	{System.out.println(x+" is greater");}
    else if(y>x && y>z)
	{System.out.println(y+" is greater");}
    else
	{System.out.println(z+" is greater");}
	
   }

}