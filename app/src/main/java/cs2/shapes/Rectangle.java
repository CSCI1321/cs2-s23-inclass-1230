package cs2.shapes;

public class Rectangle extends Shape {
  private double w;
  private double h;

  public Rectangle(double _x, double _y,
                   double _w, double _h) {
    super(_x,_y);
    w = _w; h = _h;
  }

  public double area() { return w * h; }
  public double perimeter() { return 2 * (w + h); }
}
