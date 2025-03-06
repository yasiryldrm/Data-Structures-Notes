
package garbagecollector;

public class GarbageCollector {

    public static void main(String[] args) {
        
        GarbageCollector obj=new GarbageCollector();  
	obj=null;
        
        GarbageCollector a = new GarbageCollector();
	GarbageCollector b = new GarbageCollector();
	b = a;
	System.gc();
    }  
    
    
    public void finalize()
    {
        System.out.println("Garbage collection is performed");
    }
   
}
