package cs2.univ;

public class Faculty extends Person {
	private String office;

	public Faculty(String f, String l, String u, String o) {
		super(f,l,u);
		office = o;
	}

	public String getOffice() { return office; }

	public void teachCourse(CourseInfo c) {
		courses.add(c);
	}

	@Override
	public String toString() {
		return super.toString() + " (Faculty)";
	}

	public String getType() {
		return "Faculty";
	}

}
