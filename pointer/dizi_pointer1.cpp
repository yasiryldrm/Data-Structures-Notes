#include <stdio.h>

main()
{
char tablo[40], *p,*p2,*q;

p = &tablo[0]; // dizinin 1. eleman�n�n adresi
p2 = tablo;    // dizinin ba�lang�� adresi yani 1. eleman�n adresi
q = &tablo[1]; // dizinin 2. eleman�n�n adresi

printf("adres p: %d\n",p);  
printf("adres p2: %d\n",p2);  
printf("adres q: %d\n",q);  

p++; // ilgili de�i�ken tipi boyutunca artt�r�l�r yani dizinin 2. eleman�n�n adresi olur

printf("adres yeni p: %d\n",p);  
printf("adres dizinin 3. elemani: %d\n",p2+2); 
}

