package Map;

import java.util.HashMap;
import java.util.Map;

public class AddingEntries {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		boolean isEmpty = map.isEmpty();
		System.out.println("Is Map is empty? " +isEmpty);
		
		// Adding entries in the map. Call put() method to add entries in map.
         map.put(101, "Red");
         map.put(103, "Green");
         map.put(102, "Yellow");
         map.put(104, "Blue");
         map.put(105, "Pink");
         
         System.out.println("Entries in Map: " +map);
         int size = map.size();
         System.out.println("No. of entries in Map: " +size);
         
     	Map<Integer,String> map2 = new HashMap<>();
         map2.put(115,  "Brown");
         map2.put(120,  "Purple");
         map2.put(125,  "Green");
         
      // Inserting elements of map2 into map.
         map.putAll(map2);
         System.out.println("Entries in updated Map: " +map);
	}

}
