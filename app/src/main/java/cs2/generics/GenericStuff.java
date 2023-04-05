package cs2.generics;
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

  public static void main(String[] args) {
    Integer[] intArr = { 1, 4, 5, 2, 8, 4, 4, 4, 5 };
    HashSet<Integer> intSet = arrayToSetGeneric(intArr);
    System.out.println(intSet);
    String[] strArr = { "Goodbye", "Hello", "Goodbye" };
    HashSet<String> strSet = arrayToSetGeneric(strArr);
    System.out.println(strSet);
  }
}
