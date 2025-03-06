package ınsertion_sort;

public class Insertion_Sort {

static int[] Insertionsort(int a[],int size)
{
for(int i=1;i<size;i++)
{
	if(a[i]<a[i-1])
	{	int j;
		int temp=a[i];
		for(j=i;j>0 && a[j-1]>temp;j--)
			a[j]=a[j-1];
		
		a[j]=temp;
	}
	
}
return a;
}

    public static void main(String[] args) {
        int dizi[]={3,2,1,5,6,4,9,7,8};
	int n= dizi.length;
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");	
	}
	
	Insertionsort(dizi,n);
	
	System.out.println();
        
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");
	}
        System.out.println();
    }
    
}
