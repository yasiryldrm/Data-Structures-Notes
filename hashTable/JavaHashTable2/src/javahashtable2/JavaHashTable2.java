package javahashtable2;
import java.util.*;

public class JavaHashTable2 {
	public static void main(String[] args)
	{
		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("mehmet", 10);
		ht.put("hasan", 30);
		ht.put("ahmet", 20);

		System.out.println("Size of map is: " + ht.size());
		System.out.println(ht);

		if (ht.containsKey("hasan")) {
			Integer a = ht.get("hasan");
			System.out.println("value for key"+ " \"hasan\" is: " + a);
		}
	}
}
