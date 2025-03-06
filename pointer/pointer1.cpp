#include <stdio.h>
int main(){
int a=10;
int *p;
p=&a;

printf("%d \n",*p); // p’nin gösterdiði adresteki içeriði basar

printf("%d \n",p); // p’nin içeriðini basar, ayný zamanda bu a'nýn adresidir

printf("%d \n",a); // a’nýn deðerini basar

printf("%d \n",&a); //a’nýn adresini basar

printf("%d \n",&p); //p’nin adresini basar

printf("%d \n",p); //p’nin içeriðini basar
p++;
printf("%d \n",p); //p’nin içeriðini basar (p'nin içeriði 1 int boyutu kadar artmýþtýr)

}

