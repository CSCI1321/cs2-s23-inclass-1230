package cs2.generics;
import java.util.ArrayList;

public class Bucket<TOMATO> {
  private ArrayList<TOMATO> contents;
  public Bucket() {
    contents = new ArrayList<TOMATO>();
  }
  public void add(TOMATO item) {
    if(!contents.contains(item)) {
      contents.add(item);
    }
  }
  public TOMATO get(int idx) {
    return contents.get(idx);
  }
  public String toString() { return contents.toString(); }

  public static void main(String[] args) {
    Bucket<String> b = new Bucket<String>();
    Bucket<Double> d = new Bucket<Double>();
    b.add("Hello");
    b.add("Hello");
    System.out.println(b);
  }

}
