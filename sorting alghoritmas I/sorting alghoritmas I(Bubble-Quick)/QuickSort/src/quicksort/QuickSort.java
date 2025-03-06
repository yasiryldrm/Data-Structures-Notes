package quicksort;

public class QuickSort {

static int[] Quicksort(int a[],int low,int high)
{
if(high-low<=1) return a;
int pivot=a[high-1];
int split=low;
for (int i=low;i<high-1;i++)
    if(a[i]<pivot)
    {
        int temp=a[i];
        a[i]=a[split];
        a[split]=temp;
        split++;
    }

int temp2=a[high-1];
a[high-1]=a[split];
a[split]=temp2;

Quicksort(a,low,split);
Quicksort(a,split+1,high);
return a;
}

public static void main(String[] args) {     
    int dizi[]={3,2,1,5,6,4,9,7,8};
    int n= dizi.length;
    for (int ii=0;ii<n;ii++)
    {
        System.out.print(dizi[ii]+" ");
    }	
	
    Quicksort(dizi,0,n);
    
    System.out.println("");
    for (int ii=0;ii<n;ii++)
    {
        System.out.print(dizi[ii]+" ");
    }
    System.out.println("");	
    }
    
}
