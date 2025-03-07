package binary_search;

public class Binary_search {

   static int ikiliArama(int A[], int n, int sayi)
{
int sol = 0;  
int sag = n-1;
while (sol<=sag)
{
	System.out.println("");
	for (int ii=sol;ii<=sag;ii++)
	{
            System.out.print(A[ii]+" ");
	}
	
	int orta=(sol+sag)/2;
	System.out.println(" ");
	System.out.println("ortadaki indis="+orta+" ortadaki eleman="+A[orta]);
	
	if(A[orta]==sayi) return orta;
	else if(sayi<A[orta]) sag=orta-1;
	else sol=orta+1;
}

return -1;
}

    public static void main(String[] args) {
        int dizi[]={1,2,5,6,8,9,11,15,16,19,23,24,30,33,35,36,37,38,45,49,52};
	int n= dizi.length;
	int aranan=33;
	
	int sonuc = ikiliArama(dizi,n,aranan);
	if(sonuc!=-1)
	System.out.println("Aranan bulundu: "+dizi[sonuc]);
	else
	System.out.println("Aranan sayı bulunamadı"); 
        
    }
    
}
