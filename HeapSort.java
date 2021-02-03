class HeapSort
{
 public static void main(String args[])
 { 
    int a[]={2,4,9,5,3};
	 HeapSort hs=new HeapSort();
	 hs.Sort(a);
	 hs.print(a);
 }
 void Sort(int a[])
 {
	 int leng=a.length;
	 for(int i=leng/2-1;i>=0;i--)
	 {
		 heapify(a,leng,i);
	 }
	 //swap the element and heapify again
	 for(int i=leng-1;i>=0;i--)
	 {
		 int temp=a[0];
		 a[0]=a[i];
		 a[i]=temp;
		 heapify(a,i,0);
	 }
 }
 void heapify(int a[],int n,int i)
 {
	 int largest=i;
	 int left=2*i+1;
	 int right=2*i+2;
	 if(left<n && a[left]>a[largest])
	 {
		 largest=left;
	 }
	 if(right<n && a[right]>a[largest])
	 {
		 largest=right;
	 }
	 if(largest!=i)
	 {
		 int temp=a[i];
		 a[i]=a[largest];
		 a[largest]=temp;
		 
		 heapify(a,n,largest);
	 }
  }
  void print(int a[])
  {
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+" ");
	  }
  }
}