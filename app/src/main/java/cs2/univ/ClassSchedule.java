package cs2.univ;

import java.io.File;
import java.util.*;

public class ClassSchedule {

  private HashMap<Integer, CourseInfo> courses;
  private HashMap<String, ArrayList<Integer>> idBySection;
  private HashMap<String, ArrayList<Integer>> idByInstructor;

  public ClassSchedule(String filename) {
    courses = new HashMap<Integer, CourseInfo>();
    idBySection = new HashMap<String, ArrayList<Integer>>();
    idByInstructor = new HashMap<String, ArrayList<Integer>>();
    try {
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext()) {
        String line = in.nextLine();
        String[] parts = line.split("\t");
        CourseInfo course = new CourseInfo(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], parts[4], parts[5], Integer.parseInt(parts[6]), parts[7]);
        courses.put(course.id, course);
        
        String courseNumber = course.section.substring(0,9);
        if (!idBySection.containsKey(courseNumber)) {
          idBySection.put(courseNumber, new ArrayList<Integer>());
        }
        idBySection.get(courseNumber).add(course.id);

        if (!idByInstructor.containsKey(course.instructor)) {
          idByInstructor.put(course.instructor, new ArrayList<Integer>());
        }
        idByInstructor.get(course.instructor).add(course.id);
      }
      in.close();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public ArrayList<CourseInfo> getCoursesBySection(String section) {
    ArrayList<CourseInfo> ret = new ArrayList<CourseInfo>();
    if (idBySection.containsKey(section)) {
      for (int courseID : idBySection.get(section)) {
        ret.add(courses.get(courseID));
      }
    }
    return ret;
  }

  public ArrayList<CourseInfo> getCoursesByInstructor(String instructor) {
    ArrayList<CourseInfo> ret = new ArrayList<CourseInfo>();
    if (idByInstructor.containsKey(instructor)) {
      for (int courseID : idByInstructor.get(instructor)) {
        ret.add(courses.get(courseID));
      }
    }
    return ret;
  }

  public String toString() {
    String ret = "";
    for (int courseID : courses.keySet()) {
      ret += courses.get(courseID) + "\n";
    }

    for(Map.Entry<Integer, CourseInfo> entry : courses.entrySet()) {
      ret += entry.getKey() + " " + entry.getValue() + "\n";
    }
    return ret;
  }


  public static void main(String[] args) {
    ClassSchedule schedule = new ClassSchedule("CSCIcourses.tsv");
    System.out.println(schedule);
    System.out.println("CSCI 3398");
    for(CourseInfo c : schedule.getCoursesBySection("CSCI-3398")) {
      System.out.println(c);
    }
  }
}
