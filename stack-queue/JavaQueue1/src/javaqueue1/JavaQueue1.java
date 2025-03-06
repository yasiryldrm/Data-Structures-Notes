package javaqueue1;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue1 {

    public static void main(String[] args) {
        LinkedList bagliliste=new LinkedList();
        Queue kuyruk=new LinkedList();
        
        bagliliste.add(10); 
        bagliliste.add(20); 
        bagliliste.addFirst(0);
        bagliliste.addLast(30);

        while(!bagliliste.isEmpty()) 
        { 
        System.out.println(bagliliste.remove()); 
        }

        System.out.println("----------------");
        kuyruk.add(10); 
        kuyruk.add(20); 

        while(!kuyruk.isEmpty()) 
        { 
        System.out.println(kuyruk.remove()); 
        }

    }
    
}
