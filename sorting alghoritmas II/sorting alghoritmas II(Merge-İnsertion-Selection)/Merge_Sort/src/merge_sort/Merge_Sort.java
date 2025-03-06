package merge_sort;

public class Merge_Sort {

static int[] Mergesort(int a[],int low,int high)
{
if(high-low<=1) return a;
int split=(low+high)/2;
Mergesort(a,low,split);
Mergesort(a,split,high);
int[] scratch=new int[split-low];
for(int ii=0;ii<(split-low);ii++)
{
    scratch[ii]=a[low+ii];
}

int m1=0;
int m2=split;
int i=low;

while(i<m2 && m2<high)
{
	if(scratch[m1]<=a[m2])
	a[i++]=scratch[m1++];
	else
	a[i++]=a[m2++];
}

while(i<m2)
	a[i++]=scratch[m1++];
	
return a;
}

    public static void main(String[] args) {
       int dizi[]={3,2,1,5,6,4,9,7,8};
	int n= dizi.length;
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");
	}
	
	Mergesort(dizi,0,n);
	
	System.out.println("");
	for (int ii=0;ii<n;ii++)
	{
            System.out.print(dizi[ii]+" ");
	}
        System.out.println("");
    }
    
}
