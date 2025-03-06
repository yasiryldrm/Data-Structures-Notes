package javastack1;
import java.util.*;

public class JavaStack1 {

    public static void main(String[] args) {
        Stack yigin = new Stack();
        yigin.push(10); 
        yigin.push(20); 
        
        while(!yigin.isEmpty()) 
        {
            System.out.println(yigin.pop()); 
        }
        
    }
    
}
