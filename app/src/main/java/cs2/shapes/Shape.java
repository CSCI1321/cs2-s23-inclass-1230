package cs2.shapes;

public abstract class Shape {
  protected double x;
  protected double y;
  public Shape(double _x, double _y) {
    x = _x; y = _y;
  }
  public abstract double area();
  public abstract double perimeter();
  @Override
  public String toString() { return "Shape!"; }
}