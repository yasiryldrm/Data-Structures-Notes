#include <iostream>

void anotherFunction() {
  int a = 1;
  int b = 2;
  int c = 3;
  
  printf("The address of the variable a in the anotherFunction is: %p\n",&a);
  printf("The address of the variable b in the anotherFunction is: %p\n",&b);
  printf("The address of the variable c in the anotherFunction is: %p\n",&c);
}

void function() {
  int a = 1;
  int b = 2;
  int c = 3;
  
  printf("The address of the variable a in the function is: %p\n",&a);
  printf("The address of the variable b in the function is: %p\n",&b);
  printf("The address of the variable c in the function is: %p\n",&c);
  
}

int main() {
  int a = 1;
  int b = 2;
  int c = 3;
  
  printf("The address of the variable a in memory is: %p\n",&a);
  printf("The address of the variable b in memory is: %p\n",&b);
  printf("The address of the variable c in memory is: %p\n",&c);

  function();
  anotherFunction();
}
