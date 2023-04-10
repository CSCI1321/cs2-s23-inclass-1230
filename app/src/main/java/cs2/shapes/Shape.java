package cs2.shapes;
public abstract class Shape implements Comparable<Shape> {
  protected double x;
  protected double y;
  public Shape(double _x, double _y) {
    x = _x; y = _y;
  }
  public abstract double area();
  public abstract double perimeter();
  public abstract boolean overlap(Shape other);
  @Override
  public String toString() { return "Shape!"; }
  public int compareTo(Shape other) {
    if(this.area() < other.area()) return -1;
    else if(this.area() > other.area()) return 1;
    else return 0;
  }
}