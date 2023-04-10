package cs2.shapes;

public class Rectangle extends Shape {
  protected double w;
  protected double h;
  public boolean overlap(Shape other) {
    if(other instanceof Rectangle) {
      Rectangle r = (Rectangle)other;
      double l1 = x - w/2;
      double r1 = x + w/2;
      double l2 = r.x - r.w/2;
      double r2 = r.x + r.w/2;
      double t1 = y + h/2;
      double b1 = y - h/2;
      double t2 = r.y + r.h/2;
      double b2 = r.y - r.h/2;
      return !(l1 > r2 || l2 > r1 || t1 < b2 || t2 < b1);
    } else if(other instanceof Circle) {
      Circle c = (Circle)other;
      return c.overlap(this);
    }
    return false;
  }
  public Rectangle(double _x, double _y,
                   double _w, double _h) {
    super(_x,_y);
    w = _w; h = _h;
  }
  public double area() { return w * h; }
  public double perimeter() { return 2 * (w + h); }
  public String toString() {
    return "Rect area=" + area();
  }
}
