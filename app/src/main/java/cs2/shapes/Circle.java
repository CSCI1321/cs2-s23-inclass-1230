package cs2.shapes;

public class Circle extends Shape {
  private double r;
  public Circle(double _x, double _y, double _r) {
    super(_x,_y);
    r = _r;
  }
  public boolean overlap(Shape other) {
    if(other instanceof Circle) {
      Circle c = (Circle)other;
      double xdiff = x - c.x;
      double dy = y - c.y;
      double dist = Math.sqrt(xdiff*xdiff + dy*dy);
      return dist < r + c.r;
    } else if(other instanceof Rectangle) {
      Rectangle rect = (Rectangle)other;
      double dx = Math.abs(x - rect.x);
      double dy = Math.abs(y - rect.y);
      if(dx > rect.w/2 + r) { return false; }
      if(dy > rect.h/2 + r) { return false; }
      if(dx <= rect.w/2) { return true; }
      if(dy <= rect.h/2) { return true; }
      double cornerDist = Math.pow(dx - rect.w/2, 2) +
                          Math.pow(dy - rect.h/2, 2);
      return cornerDist <= r*r;
    }
    return false;
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
    return "Circle: (" + x + "," + y + ") r=" + r + " area=" + area();
  }
}
