package cs2.shapes;

public class ShapeTester {
  public static void main(String[] args) {
    Circle c = new Circle(0,0,1);
    System.out.println(c);
    System.out.println(c.getRadius());
    Rectangle r = new Rectangle(0, 0, 4, 2);
    System.out.println(r);
    Shape[] shapes = { r, c };
    System.out.println(shapes[0]);
    System.out.println(((Circle)shapes[0]).getRadius());
  }
}
