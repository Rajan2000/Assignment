package CollectionAssignment;

import java.util.*;  
public class HashMapShallowCopy {  
   public static void main(String args[]){  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "purple");
  hash_map.put(2, "Green");
  hash_map.put(3, "brown");
  hash_map.put(4, "White");
  hash_map.put(5, "grey");
    // print the map
   System.out.println("The Original map: " + hash_map);
   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
   new_hash_map = (HashMap)hash_map.clone();     
   System.out.println("Cloned map: " + new_hash_map);        
     }
}