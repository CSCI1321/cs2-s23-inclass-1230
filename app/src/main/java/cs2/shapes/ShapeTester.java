package cs2.shapes;

import java.util.*;

public class ShapeTester {
  public static void main(String[] args) {
    Circle c = new Circle(0,0,1);
    System.out.println(c);
    System.out.println(c.getRadius());
    Rectangle r = new Rectangle(0, 0, 4, 2);
    System.out.println(r);
    Square s = new Square(0,0, 5);
    Shape[] shapes = { s, c, r };
    System.out.println(shapes[0]);
    if(shapes[0] instanceof Circle) {
      System.out.println(((Circle)shapes[0]).getRadius());
    } else { System.out.println("Not a Circle!"); }

    HashSet<Integer> set = new HashSet<Integer>();
    //Set<Integer> set2 = new Set<Integer>();

  }
}
