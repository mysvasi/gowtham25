package Map;

import java.util.HashMap;
import java.util.Map;

public class RemovingEntries {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		// Adding entries in the map. Call put() method to add entries in map.
        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Yellow");
        map.put(104, "Blue");
        map.put(105, "Pink");
        
     // Removing an entry for the specified key.
        map.remove(104);
        System.out.println("Entries in Map after removing an entry: " +map);

        
     // Removing specified value associated with the specified key from the map. 
        map.remove(105, "Pink");
        System.out.println("Entries in Map after removing Pink: " +map);
        
        //Remove all the entries in map using clear()
        map.clear();
        System.out.println(map);

        
	}

}
