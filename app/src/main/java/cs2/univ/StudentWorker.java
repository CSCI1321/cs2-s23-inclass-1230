package cs2.univ;

public class StudentWorker extends Student implements Payable {
  public StudentWorker(String f, String l, String u) {
    super(f,l,u);
  }
  public int getSalary() { return Payable.minWage; }
}
