class StringRev
{
  public static void main(String args[])
  {
    String name="dhanashri";
	int i=0;
	String rev="";
	int len=name.length();
	for(i=len-1;i>=0;i--)
	{
	  rev=rev+name.charAt(i);
	}
	System.out.println("Reverse of "+name+" is "+rev);
  }


}