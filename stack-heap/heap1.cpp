#include <iostream>

void anotherFunction() {
  int *a = new int(1);
  int *b = new int(2);
  int *c = new int(3);

  std::cout << "Variable a in anotherFunction has address: " << a << "\n";
  std::cout << "Variable b in anotherFunction has address: " << b << "\n";
  std::cout << "Variable c in anotherFunction has address: " << c << "\n";
}

void function() {
  int *a = new int(1);
  int *b = new int(2);
  int *c = new int(3);

  std::cout << "Variable a in address: " << a << "\n";
  std::cout << "Variable b in address: " << b << "\n";
  std::cout << "Variable c in address: " << c << "\n";
}

int main() {
  int *a = new int(1);
  int *b = new int(2);
  int *c = new int(3);

  std::cout << "Variable a is in memory address: " << a << "\n";
  std::cout << "Variable b is in memory address: " << b << "\n";
  std::cout << "Variable c is in memory address: " << c << "\n";

  function();
  anotherFunction();
}
