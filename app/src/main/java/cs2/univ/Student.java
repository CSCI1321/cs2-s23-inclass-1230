package cs2.univ;

public class Student extends Person {
	private double gpa;

	public Student(String f, String l, String u) {
		super(f,l,u);
		gpa = 0.0;
	}

	public void registerForCourse(CourseInfo c) {
		courses.add(c);
	}

	public double getGPA() { return gpa; }

	@Override
	public String toString() {
		return super.toString() + " (Student)";
	}
}
