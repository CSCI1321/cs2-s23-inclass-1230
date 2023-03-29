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

	public int getID() { return 9999; }

	@Override
	public String toString() {
		return super.toString() + " (Student)";
	}

	public String getType() {
		return "Student";
	}

}
