package cs2.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapStuff {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer,String>();
    map.put(1,"one");
    map.put(3,"three");
    map.put(17,"seventeen");
    System.out.println(map);
    System.out.println(map.get(3));
    System.out.println(map.get(5));
    System.out.println(map.size());
    map.put(3,"Ardvark");
    System.out.println(map);

    Set<Integer> keys = map.keySet();
    Iterator<Integer> iter = keys.iterator();
    while(iter.hasNext()) {
      int key = iter.next();
      System.out.println(map.get(key));
    }

    map.remove(3);
    System.out.println(map);
    System.out.println(map.containsKey(6));
    System.out.println(map.containsValue("one"));

    map.clear();
    System.out.println(map);


  }
}