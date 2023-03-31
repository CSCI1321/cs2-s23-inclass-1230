package cs2.shapes;

public class Circle extends Shape {
  private double r;
  public Circle(double _x, double _y, double _r) {
    super(_x,_y);
    r = _r;
  }
  public double area() {
    return Math.PI * r * r;
  }
  public double perimeter() {
    return 2 * Math.PI * r;
  }
  public double getRadius() { return r; }
  @Override
  public String toString() {
    return "Circle: (" + x + "," + y + ") r=" + r;
  }
}
