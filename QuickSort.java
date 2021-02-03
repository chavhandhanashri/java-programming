class QuickSort
{
   public static void main(String args[])
   {
	   int a[]={2,4,7,1,9,5};
	   int leng=a.length;
	   QuickSort qs=new QuickSort();
	   qs.recursion(a,0,leng-1);
	   qs.print(a);
   }
   int partition(int a[],int i,int j)
   {    int temp;
        int pivot=a[(i+j)/2];
	   while(i<=j)
	   {
		   while(a[i]<pivot)
		   {
			   i++;
		   }
		   while(a[j]>pivot)
		   {
			   j--;
		   }
		   if(i<=j)
		   {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			   i++;
			   j--;
		   }
	   }
	   return i;
   }
   void recursion(int[] a,int i,int j)
   {
	   int pi=partition(a,i,j);
	   if(i<pi-1)
	   {
		   recursion(a,i,pi-1);
	   }
	   if(pi<j)
	   {
		   recursion(a,pi,j);
	   }
	}
	void print(int a[])
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}