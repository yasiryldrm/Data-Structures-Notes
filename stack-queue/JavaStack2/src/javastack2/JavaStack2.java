package javastack2;
import java.util.*;

public class JavaStack2 {

    public static void main(String[] args) {
    // Default initialization of Stack
    Stack stack1 = new Stack();

    // Initialization of Stack using Generics
    Stack<String> stack2 = new Stack<String>();

    stack1.push(5);
    stack1.push("Merhaba");
    stack1.push("Dünya");

    stack2.push("Hello");
    stack2.push("Merhaba");
    stack2.push("Dünya");

    System.out.println(stack1);
    System.out.println(stack2);
    }
}
