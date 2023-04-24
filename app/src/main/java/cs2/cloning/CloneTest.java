package cs2.cloning;

import java.util.ArrayList;

public class CloneTest {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Hello");
    arr.add("Goodbye");
    arr.add("You");
    System.out.println(arr);

    ArrayList<String> alias = arr;
    //Changing alias also changes arr
    alias.set(1, "Adios");
    System.out.println(arr);

    ArrayList<String> clone = (ArrayList<String>)arr.clone();
    //Changing clone does NOT change arr
    clone.set(0, "Hola");
    System.out.println(arr);
  }
}
