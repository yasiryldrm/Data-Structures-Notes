#include <stdio.h>
int main(){
int a=10;
int *p;
p=&a;

printf("%d \n",*p); // p�nin g�sterdi�i adresteki i�eri�i basar

printf("%d \n",p); // p�nin i�eri�ini basar, ayn� zamanda bu a'n�n adresidir

printf("%d \n",a); // a�n�n de�erini basar

printf("%d \n",&a); //a�n�n adresini basar

printf("%d \n",&p); //p�nin adresini basar

printf("%d \n",p); //p�nin i�eri�ini basar
p++;
printf("%d \n",p); //p�nin i�eri�ini basar (p'nin i�eri�i 1 int boyutu kadar artm��t�r)

}

