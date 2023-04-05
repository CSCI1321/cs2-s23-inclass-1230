package cs2.univ;
public interface Payable {
  public static final int minWage = 7;
  public abstract int getSalary();
  public default void pay() {
    System.out.println("Paying " + getSalary());
  }
}