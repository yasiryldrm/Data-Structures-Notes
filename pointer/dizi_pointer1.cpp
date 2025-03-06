#include <stdio.h>

main()
{
char tablo[40], *p,*p2,*q;

p = &tablo[0]; // dizinin 1. elemanýnýn adresi
p2 = tablo;    // dizinin baþlangýç adresi yani 1. elemanýn adresi
q = &tablo[1]; // dizinin 2. elemanýnýn adresi

printf("adres p: %d\n",p);  
printf("adres p2: %d\n",p2);  
printf("adres q: %d\n",q);  

p++; // ilgili deðiþken tipi boyutunca arttýrýlýr yani dizinin 2. elemanýnýn adresi olur

printf("adres yeni p: %d\n",p);  
printf("adres dizinin 3. elemani: %d\n",p2+2); 
}

