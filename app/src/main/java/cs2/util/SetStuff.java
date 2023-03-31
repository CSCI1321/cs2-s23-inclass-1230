package cs2.util;

import java.util.HashSet;
import java.util.Iterator;

public class SetStuff {
  public static void main(String[] args) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    System.out.println(set1);
    set1.add(5);
    set1.add(12);
    set1.add(5);
    System.out.println(set1);
    for(int i=0; i<10; i++) {
      set1.add(i);
    }
    System.out.println(set1);
    set1.remove(3);
    System.out.println(set1);
    System.out.println(set1.size());

    int total = 0;
    /* Can't do a for loop with a set
    for(int i=0; i<set1.size(); i++) {
      total += set1.get(i);
    }
    */
    Iterator<Integer> iter = set1.iterator();
    while(iter.hasNext()) {
      int x = iter.next();
      System.out.println(iter.next());
      total += x;
    } 
    System.out.println("Total = " + total);

  }
}
