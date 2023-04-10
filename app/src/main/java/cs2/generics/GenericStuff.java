package cs2.generics;
import java.util.HashMap;
import java.util.HashSet;
public class GenericStuff {
  
  public static HashSet<Integer> arrayToSet(Integer[] a) {
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i=0; i<a.length; i++) {
      set.add(a[i]);
    }
    return set;
  }

  public static <T> HashSet<T> arrayToSetGeneric(T[] a) {
    HashSet<T> set = new HashSet<T>();
    for(int i=0; i<a.length; i++) {
      set.add(a[i]);
    }
    return set;
  }

  public static <A,B> HashMap<A,B> zip(A[] a, B[] b) {
    HashMap<A,B> map = new HashMap<A,B>();
    for(int i=0; i<a.length; i++) {
      map.put(a[i], b[i]);
    }
    return map;
  }

  public static void main(String[] args) {
    Integer[] intArr = { 1, 4, 5, 2 };
    HashSet<Integer> intSet = arrayToSetGeneric(intArr);
    System.out.println(intSet);
    String[] strArr = { "Goodbye", "Hello", "Goodbye", "Apple" };
    HashSet<String> strSet = arrayToSetGeneric(strArr);
    System.out.println(strSet);

    HashMap<Integer, String> m = zip(intArr, strArr);
    System.out.println(m);
    System.out.println(zip(strArr, intArr));
  }
}
