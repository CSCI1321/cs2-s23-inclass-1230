package cs2.univ;

import java.util.*;

public abstract class Person {
	private String first;
	private String last;
	private int id;
	private String username;
	protected ArrayList<CourseInfo> courses;

	private static int nextID = 1000;

	public Person(String f, String l, String u) {
		first = f;
		last = l;
		id = Person.nextID;
		Person.nextID++;
		username = u;
		courses = new ArrayList<CourseInfo>();
	}
	
	public String toString() {
		return last + ", " + first + " (" + username + ")";
	}

	public abstract String getType();

	public String getFirstname() { return first; }
	public String getLastname() { return last; }
	public int getID() { return id; }
	public String getUsername() { return username; }
	public String getEmail() { return username + "@trinity.edu"; }
}
