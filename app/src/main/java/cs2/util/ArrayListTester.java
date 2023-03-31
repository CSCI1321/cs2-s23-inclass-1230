package cs2.util;

import java.util.ArrayList;

public class ArrayListTester {
  public static void main (String[] args) {
    System.out.println("HelloWorld!");
    ArrayList<String> lst = new ArrayList<String>();
    System.out.println(lst);
    lst.add("Hello");
    System.out.println(lst);
    lst.add("Goodbye");
    System.out.println(lst);
    lst.add("Third");
    System.out.println(lst);
    lst.add(1,"Something");
    System.out.println(lst);

    System.out.println(lst.get(2)); //equivalent of lst[2]
    lst.set(2, "Else"); //equivalent of lst[2] = "Else"
    System.out.println(lst);

    lst.remove(1);
    System.out.println(lst);
    System.out.println(lst.size());
    lst.remove(lst.size() - 1);
    System.out.println(lst);

    System.out.println(lst.contains("Else"));
    System.out.println(lst.contains("Goodbye"));

    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i=0; i<100; i+=5) {
      nums.add(i);
    }
    System.out.println(nums);
    System.out.println(nums.contains(10));
    System.out.println(nums.contains(11));
  }
}
